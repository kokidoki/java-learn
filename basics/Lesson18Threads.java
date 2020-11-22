import java.util.Date;
public class Lesson18Threads {
	public static void main(String[] args) {
		// Runnable hello = () -> {
		// 	for(int i = 0; i < 10; i++) {
		// 		System.out.println(i + " Helo worl " + new Date());
		// 		try {
		// 			Thread.sleep(300);
		// 		} catch(InterruptedException lskejdflskdf) {
		//
		// 		}
		// 	}
		// };
		// Runnable hello2 = () -> {
		// 	for(int i = 0; i < 10; i++) {
		// 		System.out.println(i + " something idferent " + new Date());
		// 		try {
		// 			Thread.sleep(300);
		// 		} catch(InterruptedException lskejdflskdf) {
		//
		// 		}
		// 	}
		// };
		// // hello.run();
		// // hello2.run();
		//
		//
		// Thread t1 = new Thread(hello);
		// Thread t2 = new Thread(hello2);
		// t1.start();
		// t2.start();


		BankAccount3 dengs = new BankAccount3();

		Runnable dAd = () -> {
			dengs.addBalance(25_000.0);
			System.out.println("Dad balance: " + dengs.getBalance());
		};
		Runnable moM = () -> {
			dengs.addBalance(20_000.0);
			System.out.println("Mom balance: " + dengs.getBalance());
		};
		Thread t1 = new Thread(dAd);
		Thread t2 = new Thread(moM);
		t1.start();
		t2.start();

	}

	public static class BankAccount {
		double balance = 10_000.0;


		public double getBalance() {
			return this.balance;
		}

		synchronized public void addBalance(double amount) {
			this.balance = this.balance + amount; // Non-atomic lines don't perform in 1 go(synchronous)
		}

		synchronized public void withdraw(double amount) { // synchronize keyword will make operations atomic
			this.balance = this.balance - amount; // when non atomic lines are used in multithreading; data corruption happens
		}
	}

	public static class BankAccount2 {
		volatile double balance = 10_000.0; // volatile keywords makes updates to var atomic


		public double getBalance() {
			return this.balance;
		}

 		public void addBalance(double amount) {
			this.balance = this.balance + amount;
		}

		public void withdraw(double amount) {
			this.balance = this.balance - amount;
		}
	}

	public static class BankAccount3 {
		double balance = 10_000.0; // volatile keywords makes updates to var atomic
		Object lock = new Object();

		public double getBalance() {
			return this.balance;
		}

 		public void addBalance(double amount) {
			synchronized(this.lock) {
				this.balance = this.balance + amount;
			}

		}

		public void withdraw(double amount) {
			synchronized(this.lock) {
				this.balance = this.balance - amount;
			}
		}
	}
}
