package thread;

public class Mythread {

	public static void main(String args[]) {
		Table obj = new Table();// only one object

		Thread t1 = new Thread() {
			public void run() {
				obj.printSum();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printSum();
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				obj.printSum();
			}
		};
		Thread t4 = new Thread() {
			public void run() {
				obj.printSum();
			}
		};
		Thread t5 = new Thread() {
			public void run() {
				obj.printSum();
			}
		};

		t1.start();
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

class Table {
	int sum = 0;
    int i=1;
	 void printSum() {// synchronized method
		for (int j = 1; j <= 25; j++) 
		{
			sum = sum + i;
			i++;
//			
//			try {
//				Thread.sleep(4000);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
		}
		System.out.println(sum);

	}
}
