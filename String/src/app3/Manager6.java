package app3;

public class Manager6 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		try {
			Thread.sleep(1000 * 6);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		long timeElapsed = System.currentTimeMillis() - startTime;
		System.out.println(timeElapsed / 1000 + " seconds");
	}
}
