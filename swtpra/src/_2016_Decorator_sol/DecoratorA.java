package _2016_Decorator_sol;

public class DecoratorA extends AbstractDecorator
{	
	public DecoratorA(AbstractComponent comp) 
	{
		super(comp);
	}
	
	public void decorate()
	{
		System.out.print("- decorated by DecoratorA ");
	}
	
	public void printMe()
	{
		this.myComponent.printMe();
		decorate();
	}
}
