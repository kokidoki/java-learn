public class SleepyHead {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin " + new java.util.Date());
		Thread.sleep(1000l);
		System.out.println("Stop " + new java.util.Date());
	}
}
