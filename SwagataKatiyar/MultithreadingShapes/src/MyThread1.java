import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyThread1 implements Runnable {
	Queue<Shapes> q;

	MyThread1(Queue<Shapes> q) {
		this.q = q;
	}

	ValueCarrier vc= new ValueCarrier(q);
	Scanner sc = new Scanner(System.in);
	String shape;
	int no;

	@Override
	public void run() {

		do {
			System.out.println("Choose your shape:");
			System.out.println("1.For shape Square");
			System.out.println("2.For shape Rectangle");
			no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("Enter the value:");
				int m1 = sc.nextInt();
				Shapes s = new Square(m1);
				q.add(s);
				vc.setQ(q);
				synchronized (q) {
					try {
			            Thread.sleep(1000); 
						q.wait();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			case 2:
				System.out.println("Enter the values:");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				Shapes r = new Rectangle(n1, n2);
				q.add(r);
				synchronized (q) {
					try {
			            Thread.sleep(1000); 
						q.wait();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		} while (no == 1 || no == 2);
		System.out.println("Wrong Choice");
	}
}