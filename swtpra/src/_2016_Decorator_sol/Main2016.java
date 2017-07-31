package _2016_Decorator_sol;

/**
 * 
 * @author pc
 * Target: 	I am a component - 
 * 			decorated by DecoratorA - 
 * 			decorated by DecoratorB  
 * 			I am a component - 
 * 			decorated by DecoratorB - 
 * 			decorated by DecoratorA 
*/

public class Main2016
{

	public static void main(String[] args){
		Component comp = new Component();
		//Start inserting Code here: 

		DecoratorA decA = new DecoratorA(comp);
		DecoratorB decB = new DecoratorB(comp);

		//Solution 1
		decA.printMe();
		decB.decorate();
		
		decA.printMe();
		decB.decorate();


		//Solution 2		
		//comp.printMe();
		//decA.decorate();
		//decB.decorate();
		//
		//comp.printMe();
		//decA.decorate();
		//decB.decorate();		

	}

}
