

/** Purpose of this class is to throw inner classes of {@link CatHandler} as an exception and catch it using try and catch blocks. 
 * @author munib
 * @since JavaSE-17
 *
 */

public class CatHandler {
	
	/**Purpose of this class is to extend Exception class so it and the subclasses will have access to throw Exceptions.
	 * I declared it static as its easier to write code as you don't need to do inner classes syntax such as CatHandler.new "class" and its prettier
	 * @see CatHandler
	 * @author munib
	 */
	public static class ExceptionAlpha extends Exception{}
	/**Purpose of this class is to extend ExceptionAlpha class so it and the subclasses will have access to throw Exceptions.
	 * I declared it static as its easier to write code as you don't need to do inner classes syntax such as CatHandler.new "class" and its prettier
	 * @see ExceptionAlpha
	 * @author munib
	 */
    public static class ExceptionBeta extends ExceptionAlpha {}
	/**Purpose of this class is to throw Exceptions.
	 * I declared it static as its easier to write code as you don't need to do inner classes syntax such as CatHandler.new "class" and its prettier
	 * @see CatHandler
	 * @author munib
	 */
    public static class ExceptionGamma extends ExceptionBeta {}

    /**
     * 
     * @param args main method
     */
	public static void main(String[] args) {
		
		/**
		 * For this try block we are throwing ExceptionBeta class. The "new" keyword is required for class accessibility or else 
		 * eclipse will think ExceptionBeta() is a method and "throw" is required to be able to catch the exception in the catch block.
		 * In the catch block the type of exception being caught is ExceptionAlpha as its a superclass to both classes. Used "e" as a standard variable.
		 * I Used printStackTrace() as its the most useful one I found as it shows you the Class where it happened, what caused it and the line where
		 * the code is. I also used System.err.println() to print a custom message which will print in red to console.
		 * I added additional space between the try blocks so its easier to read by using System.err.println().
		 */

		try{
			throw new ExceptionBeta();
		}
		catch(ExceptionAlpha e) {
			e.printStackTrace();
			System.err.println("Caught the ExceptionBeta Exception");
			System.err.println();
			System.err.println();
			}
		
		
		/**
		 * For this try block we are throwing ExceptionGamma class. The "new" keyword is required for class accessibility or else 
		 * eclipse will think ExceptionGamma() is a method and "throw" is required to be able to catch the exception in the catch block.
		 * In the catch block the type of exception being caught is ExceptionAlpha as its a superclass to both classes.I used "e" as a standard variable.
		 * I Used printStackTrace() as its the most useful one I found as it shows you the Class where it happened, what caused it and the line where
		 * the code is. I also used System.err.println() to print a custom message which will print in red to console.
		 * I added additional space between the try blocks so its easier to read by using System.err.println().
		 */
		try {
			throw new ExceptionGamma();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the ExceptionGamma Exception");
			System.err.println();
			System.err.println();
		}
		
		
		
		
		
		
	}

}
