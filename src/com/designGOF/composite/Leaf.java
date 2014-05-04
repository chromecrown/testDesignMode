package com.designGOF.composite;

/**
 * ������б�ʾҶ�ڵ����Ҷ�ڵ�û���ӽڵ�
 * 
 * @author sulp
 * 
 */
public class Leaf extends Component
{

	public Leaf(String name) {
		super(name);
	}

	public void Add(Component c)
	{
		System.out.println("Can not add to a leaf");
	}

	public void Remove(Component c)
	{
		System.out.println("Can not remove a leaf");
	}

	public void Diaplay(int depth)
	{
		String sep = "";
		for(int i=0;i<depth;i++){
			sep +="-";
		}
		System.out.println(sep + name);
	}

}
