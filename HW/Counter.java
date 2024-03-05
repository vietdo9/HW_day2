package HW;

public class Counter {
	private int count = 0;
	
	public synchronized void incremet() throws IndexOutOfBoundsException{
        count++;
        System.out.println(" "+ count +" ");
        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

    }
    public int getCount(){
        return count;
    }

}
