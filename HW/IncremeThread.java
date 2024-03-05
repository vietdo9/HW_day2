package HW;

public class IncremeThread extends Thread{
	private Counter counter;
	private int incremeThread;
	
	public IncremeThread(Counter counter, int incremeThread) {
		this.counter = counter;
		this.incremeThread = incremeThread;
	}
	
	public void run() {
		for(int i=0;i<incremeThread;i++) {
			try {
				counter.incremet();
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
	}

}
