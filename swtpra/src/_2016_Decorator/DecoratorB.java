package _2016_Decorator;

public class DecoratorB extends AbstractDecorator {
	public DecoratorB(AbstractComponent comp)
	{
		super(comp);
	}
	public void decorate(){
		System.out.print("- decorated by DecoratorB ");
	}
	
	public void printMe()
	{
		this.myComponent.printMe();
		decorate();
	}
}
