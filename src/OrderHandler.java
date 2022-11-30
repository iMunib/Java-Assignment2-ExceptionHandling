import java.io.IOException;

public class OrderHandler {
	

	public static void main(String[] args) {
		Exception superclass = new Exception();
		Exception subclass = new IOException();
		
		
//		try{
//			throw new IOException();
//		}
//		catch(Exception e) {
//			e.getStackTrace();
//		}
//		catch(IOException e) {
//			e.getStackTrace();
//		}

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
