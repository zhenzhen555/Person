class MinPriority implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + "�������:" +i);
		}
	}
}
class MaxPriority implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName() + "�������:" +i);
		}
	}
}


public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
    Thread  minPriority = new Thread(new MinPriority(),"������ȼ�");
    Thread maxPriority = new Thread(new MaxPriority(),"������ȼ�");
    minPriority.setPriority(Thread.MIN_PRIORITY);
    maxPriority.setPriority(10);
    maxPriority.start();
    minPriority.start();
    
	}

}
