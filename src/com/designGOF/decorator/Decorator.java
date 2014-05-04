package com.designGOF.decorator;

/**
 * Decorator,装饰抽象类，继承了Component，从外类来扩展Component类的功能，但对于Component来说是无需知道Decorator的存在的
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
