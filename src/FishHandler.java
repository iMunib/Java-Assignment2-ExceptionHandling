
/** Purpose of this class is to throw exception in methods it created and catch it using try and catch blocks in main method. 
 * @author munib
 * @since JavaSE-17
 *
 */
public class FishHandler {
	
	/**
	 * This method easterEnding() is throwing an Exception when being called upon of Exception class and we have to declare
	 * "throws Exceptions before the method body as without it method wont be able to handle the exception.
	 * @throws Exception 
	 */
	public void easterEnding() throws Exception {
		throw new Exception();
	}
	/**
	 * This method easterStarting() is rethrowing the Exception of easterEnding() when being called upon.
	 * We enclosed it in a try and catch block so it will be able to handle the exception being thrown.
	 * Used "e" as a standard variable. I Used printStackTrace() as its the most useful one I found as it shows you 
	 * the Class where it happened, what caused it and the line where the code is. 
	 * I also used System.err.println() to print a custom message which will print in red to console.
	 */
	public void easterStarting() {
		try {
			easterEnding();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Caught easterEnding() Expection in easterStarting()");
		}
	}

	/** Making an instance of FishHandler class and calling the easterStarting() method
	 * @param args main method
	 */
	public static void main(String[] args) {

		FishHandler fish = new FishHandler();
		/**
		 * easterStarting being called upon will execute the easterEnding() method which will throw the exception
		 * and that exception is catch in the catch block of easterStarting()
		 */
		fish.easterStarting();
	}

}
