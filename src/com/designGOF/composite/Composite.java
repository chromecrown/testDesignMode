package com.designGOF.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component
{
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	public void Add(Component c)
	{
		children.add(c);
	}

	public void Remove(Component c)
	{
		children.remove(c);
	}

	/**
	 * ��ʾ����ڵ����ƣ��������¼����б���
	 */
	public void Diaplay(int depth)
	{
		String sep = "";
		for(int i=0;i<depth;i++){
			sep +="-";
		}
		System.out.println(sep+name);
		for(Component component:children){
			component.Diaplay(depth+2);
		}
	}
}
