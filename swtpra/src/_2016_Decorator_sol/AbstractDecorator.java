package _2016_Decorator_sol;

public abstract class AbstractDecorator extends AbstractComponent{
	AbstractComponent myComponent;
	public AbstractDecorator(AbstractComponent comp)
	{
		myComponent = comp;
	}
	protected abstract void decorate();

}
