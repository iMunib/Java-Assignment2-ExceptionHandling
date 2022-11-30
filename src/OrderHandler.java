/**
 * Importing IOException class
 */
import java.io.IOException;


/**
 * The purpose of this class is to show case the importance of the order of exception catching.
 * I have commented out the code which will give an error due to subclass being below the super, please "CTRL + /" to uncomment it when needed.
 * We also made two instances objects of Exception and IOException.
 * @author munib
 *
 */
public class OrderHandler {
	
/**
 * 
 * @param args main method
 */
	public static void main(String[] args) {
		
		/**
		 * making superclass an instance object of Exception class
		 */
		Exception superclass = new Exception();
		/**
		 * making subclass an instance object of IOException class
		 */
		IOException subclass = new IOException();
		
		/**
		 * In this try block we are throwing IOException class exception and catching it first with Exception type and then IOException.
		 * The reason why we get an error is because we would have already caught the exception in the first catch block as Exception(parent) will catch 
		 * every exception while IOException can only can IOException.
		 */
//		try{
//			throw new IOException();
//		}
//		catch(Exception e) {
//			e.getStackTrace();
//		}
//		catch(IOException e) {
//			e.getStackTrace();
//		}
		
		/**
		 * In this try block we are throwing IOException class exception and catching it first with IOException type and then Exception.
		 * The reason why we don't an error is because we would first try to catch block as IOException and if its not an IOException type of exception
		 * then the all might Exception will catch the exception.
		 * 
		 * The reason why we want to use specific exceptions such as IOException or NullPointerException is because it provides more information on
		 * what type of difficulty occurred in the program rather than a generic exception type handler which will say "Something went wrong but I don't 
		 * know what" 
		 *
		 */
		try{
			throw new IOException();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
