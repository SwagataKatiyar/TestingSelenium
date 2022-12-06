import java.util.LinkedList;
import java.util.Queue;

public class MainThread {
	public static void main(String[] args) {

		Queue<Shapes> que = new LinkedList<Shapes>();
		MyThread1 ob1 = new MyThread1(que);
		Thread t1 = new Thread(ob1);
		t1.start();

		MyThread2 ob2 = new MyThread2(que);
		Thread t2 = new Thread(ob2);
		t2.start();
	
	}
}