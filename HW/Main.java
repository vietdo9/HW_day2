package HW;

public class Main {
	public static void main(String[] args) {
		Counter ct = new Counter();
		int numTheach = 6;
		int incrementsperThread = 5;
		
		IncremeThread[] threads = new IncremeThread[numTheach];
		
		for(int i = 0 ; i < numTheach;i++) {
			threads[i] = new IncremeThread(ct, incrementsperThread);
			threads[i].start();
		}
		
		try {
			for (IncremeThread thread : threads) {
				thread.join();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
