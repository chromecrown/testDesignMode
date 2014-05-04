package com.designGOF.composit;

import org.junit.Test;

import com.designGOF.composite.Composite;
import com.designGOF.composite.Leaf;

public class TestCompositeClient
{

	@Test
	public void test()
	{
		System.out.println("组合模式 start----");
		Composite root = new Composite("root");
		root.Add(new Leaf("LeafA"));
		root.Add(new Leaf("LeafB"));
		
		Composite comp = new Composite("Composite X");
		comp.Add(new Leaf("Leaf XA"));
		comp.Add(new Leaf("Leaf XB"));
		
		root.Add(comp);
		
		Composite comp2 = new Composite("Composite XY");
		comp2.Add(new Leaf("Leaf XYA"));
		comp2.Add(new Leaf("Leaf XYB"));
		
		comp.Add(comp2);
		
		root.Add(new Leaf("Leaf C"));
		
		Leaf leaf = new Leaf("Leaf D");
		
		root.Add(leaf);
		root.Remove(leaf);
		
		root.Diaplay(1);
		System.out.println("组合模式 end----");
	}

}
