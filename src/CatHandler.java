public class CatHandler {
	
	public static class ExceptionAlpha extends Exception{}
    public static class ExceptionBeta extends ExceptionAlpha {}
    public static class ExceptionGamma extends ExceptionBeta {}

	public static void main(String[] args) {
		
		try{
			throw new ExceptionBeta();
		}
		catch(ExceptionAlpha e) {
			e.printStackTrace();
			System.err.println("Caught the ExceptionBeta Exception");
			System.out.println();
			System.out.println();
		}

		try {
			throw new ExceptionGamma();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Caught the ExceptionGamma Exception");
		}
		
		
		
		
		
		
	}

}
