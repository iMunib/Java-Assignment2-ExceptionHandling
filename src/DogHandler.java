/**
 * importing IOException class
 */

import java.io.IOException;

/** Purpose of this class is to throw inner classes of DogHandler as an exception plus NullPointerException and IOException
 * and catch it using try and catch blocks. 
 * @author munib
 * @since JavaSE-17
 *
 */
public class DogHandler {
	/**Purpose of this class is to extend Exception class so it and the subclasses will have access to throw Exceptions.
	 * I declared it static as its easier to write code as you don't need to do inner classes syntax such as CatHandler.new "class" and its prettier
	 * @see DogHandler
	 * @author munib
	 */
	public static class ExceptionDog extends Exception{}
	public static class ExceptionPuppy extends ExceptionDog{}
	
/**
 * 
 * @param args main method
 */
	public static void main(String[] args) {
		
		/**
		 * For this try block we are throwing ExceptionDog class. The "new" keyword is required for class accessibility or else 
		 * eclipse will think ExceptionDog() is a method and "throw" is required to be able to catch the exception in the catch block.
		 * In the catch block the type of exception being caught is Exception as its a superclass all exceptions. Used "e" as a standard variable.
		 * I Used printStackTrace() as its the most useful one I found as it shows you the Class where it happened, what caused it and the line where
		 * the code is. I also used System.err.println() to print a custom message which will print in red to console.
		 * I added additional space between the try blocks so its easier to read by using System.err.println().
		 */
		try {
			throw new ExceptionDog();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the ExceptionDog Exception");
			System.err.println();
			System.err.println();
		}
		/**
		 * For this try block we are throwing ExceptionPuppy class. The "new" keyword is required for class accessibility or else 
		 * eclipse will think ExceptionPuppy() is a method and "throw" is required to be able to catch the exception in the catch block.
		 * In the catch block the type of exception being caught is Exception as its a superclass all exceptions. Used "e" as a standard variable.
		 * I Used printStackTrace() as its the most useful one I found as it shows you the Class where it happened, what caused it and the line where
		 * the code is. I also used System.err.println() to print a custom message which will print in red to console.
		 * I added additional space between the try blocks so its easier to read by using System.err.println().
		 */
		try {
			throw new ExceptionPuppy();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the ExceptionPuppy Exception");
			System.err.println();
			System.err.println();
		}
		
		/**
		 * For this try block we are throwing NullPointerException class. The "new" keyword is required for class accessibility or else 
		 * eclipse will think NullPointerException() is a method and "throw" is required to be able to catch the exception in the catch block.
		 * In the catch block the type of exception being caught is Exception as its a superclass all exceptions. Used "e" as a standard variable.
		 * I Used printStackTrace() as its the most useful one I found as it shows you the Class where it happened, what caused it and the line where
		 * the code is. I also used System.err.println() to print a custom message which will print in red to console.
		 * I added additional space between the try blocks so its easier to read by using System.err.println().
		 */
		try {
			throw new NullPointerException();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the NullPointerException Exception");
			System.err.println();
			System.err.println();
		}
		/**
		 * For this try block we are throwing IOException class. The "new" keyword is required for class accessibility or else 
		 * eclipse will think IOException() is a method and "throw" is required to be able to catch the exception in the catch block.
		 * In the catch block the type of exception being caught is Exception as its a superclass all exceptions. Used "e" as a standard variable.
		 * I Used printStackTrace() as its the most useful one I found as it shows you the Class where it happened, what caused it and the line where
		 * the code is. I also used System.err.println() to print a custom message which will print in red to console.
		 * I added additional space between the try blocks so its easier to read by using System.err.println().
		 */
		try {
			throw new IOException();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the IOException Exception");
			System.err.println();
			System.err.println();
		}
		
		

	
	
	
	
	
	
	
	
	
	}
}
