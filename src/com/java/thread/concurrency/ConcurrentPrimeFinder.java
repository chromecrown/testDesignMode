package com.java.thread.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrentPrimeFinder extends AbstractPrimeFinder {
	private final int poolSize;
	private final int numberOfParts;

	public ConcurrentPrimeFinder(final int thePoolSize,
			final int theNumberOfParts) {
		poolSize = thePoolSize;
		numberOfParts = theNumberOfParts;
	}

	public int countPrimes(int number) {
		int count = 0;
		try {
			final List<Callable<Integer>> partitions = new ArrayList<Callable<Integer>>();
			final int chunksPerPartition = number / numberOfParts;
			for (int i = 0; i < numberOfParts; i++) {
				final int lower = (i * chunksPerPartition) + 1;
				final int upper = (i == numberOfParts - 1) ? number : lower
						+ chunksPerPartition - 1;
				partitions.add(new Callable<Integer>() {
					public Integer call() {
						return countPrimesInRange(lower, upper);
					}
				});
			}
			final ExecutorService executorPool = Executors
					.newFixedThreadPool(poolSize);
			final List<Future<Integer>> resultFromParts = executorPool
					.invokeAll(partitions, 10000, TimeUnit.SECONDS);
			executorPool.shutdown();
			for (final Future<Integer> result : resultFromParts)
				count += result.get();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		return count;
	}

	public static void main(String[] args) {
		args = new String[]{"10000000","2","2"};
		if (args.length < 3)
			System.out.println("Usage:number poolsize numberOfParts");
		else
			new ConcurrentPrimeFinder(Integer.parseInt(args[1]),
					Integer.parseInt(args[2])).timeAndCompute(Integer
					.parseInt(args[0]));
	}
}
