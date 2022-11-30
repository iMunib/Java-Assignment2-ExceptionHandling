
public class FishHandler {
	
	public void easterEnding() throws Exception {
		throw new Exception();
	}
	
	public void easterStarting() {
		try {
			easterEnding();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Caught easterEnding() Expection in easterStarting()");
		}
	}

	
	public static void main(String[] args) {

		FishHandler fish = new FishHandler();
		fish.easterStarting();
	}

}
