package com.java.thread.concurrency;

public class SequentialPrimeFinder extends AbstractPrimeFinder {

	@Override
	public int countPrimes(int number) {
		return countPrimesInRange(1, number);
	}

	public static void main(final String[] args) {
		new SequentialPrimeFinder().timeAndCompute(Integer.parseInt("10000000"));
	}
}
