import java.util.LinkedList;
import java.util.Queue;

public class ValueCarrier {

	Queue<Shapes> q = new LinkedList<Shapes>();

	public ValueCarrier() {
	}
	public ValueCarrier(Queue<Shapes> q) {
		this.q = q;
	}

	public Queue<Shapes> getQ() {
		return q;
	}

	public void setQ(Queue<Shapes> q) {
		this.q = q;
	}

}
