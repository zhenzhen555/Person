class MinPriority implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + "正在输出:" +i);
		}
	}
}
class MaxPriority implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName() + "正在输出:" +i);
		}
	}
}


public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
    Thread  minPriority = new Thread(new MinPriority(),"最低优先级");
    Thread maxPriority = new Thread(new MaxPriority(),"最高优先级");
    minPriority.setPriority(Thread.MIN_PRIORITY);
    maxPriority.setPriority(10);
    maxPriority.start();
    minPriority.start();
    
	}

}
