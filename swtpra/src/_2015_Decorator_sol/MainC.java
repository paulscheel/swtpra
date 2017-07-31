package _2015_Decorator_sol;

import _2015_Decorator.*;

/**
 * 
 * @author pc
 * Target: 	I am a component - 
 * 			decorated by DecoratorA - 
 * 			decorated by DecoratorB - 
 * 			decorated by DecoratorB - 
 * 			decorated by DecoratorA
*/
public class MainC
{

	public static void main(String[] args){
		Component comp = new Component();

		//		Start inserting Code here:
		
		DecoratorB decB = new DecoratorB(comp);
		DecoratorA decA = new DecoratorA(comp);
		
		//Output
		comp.printMe();
				
		decA.decorate();
		decB.decorate();
		decB.decorate();
		decA.decorate();
	}

}
