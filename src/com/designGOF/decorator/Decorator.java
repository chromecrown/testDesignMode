package com.designGOF.decorator;

/**
 * Decorator,װ�γ����࣬�̳���Component������������չComponent��Ĺ��ܣ�������Component��˵������֪��Decorator�Ĵ��ڵ�
 * @author Administrator
 *
 */
abstract class Decorator extends Component {

	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	public void Operation() {
		if (component != null) {
			component.Operation();
		}
	}

}
