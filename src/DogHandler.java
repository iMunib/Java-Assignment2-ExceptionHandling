import java.io.IOException;

public class DogHandler {
	public static class ExceptionDog extends Exception{}
	public static class ExceptionPuppy extends ExceptionDog{}
	

	public static void main(String[] args) {

		try {
			throw new ExceptionDog();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the ExceptionDog Exception");
			System.out.println();
			System.out.println();
		}
	
		try {
			throw new ExceptionPuppy();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the ExceptionPuppy Exception");
			System.out.println();
			System.out.println();
		}

		try {
			throw new NullPointerException();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the NullPointerException Exception");
			System.out.println();
			System.out.println();
		}
		try {
			throw new IOException();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the IOException Exception");
			System.out.println();
			System.out.println();
		}
		
		

	
	
	
	
	
	
	
	
	
	}
}
