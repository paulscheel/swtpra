package _2016_JavaDoc;

public class JavaDocExample
{
	
	public JavaDocExample(){}
	/**
	 * This method returns true if the first {@value} 
	 * is smaller or equal {@value} j.
	 *  
	 * @author pc
	 * @param i to check if smaller or equal
	 * @param j the value to be compared to
	 * @return True if i is smaller or equal, false if not
	 */
	public static boolean isSmallerOrEqual(int i, int j)
	{
		if(i <= j)
			return true;
		return false;
	}	
	
}