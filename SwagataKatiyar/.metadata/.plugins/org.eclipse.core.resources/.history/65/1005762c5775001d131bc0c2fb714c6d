import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyThread2 implements Runnable {
	Scanner sc = new Scanner(System.in);
	ValueCarrier vc= new ValueCarrier();
	Queue<Shapes> q= vc.getQ();;

	MyThread2(Queue<Shapes> q) {
		this.q = q;
	}
	
	@Override
	public void run() {

		Shapes Obj = q.poll();

		if (Obj instanceof Rectangle) {
			System.out.println(Obj.calcPerimeter());
			System.out.println(Obj.calcArea());
	
			synchronized(q){	
			notify();
			}
		} else if (Obj instanceof Square) {
			System.out.println(Obj.calcPerimeter());
			System.out.println(Obj.calcArea());
			q.notify();
		}
	}
}