public class Example03{
	public static void main(String[] args ){
		MyThread03 myThread = new MyThread03() ;
		new Thread (myThread,"�߳�һ").start();
		new Thread (myThread,"�̶߳�").start();
		
	}
}
