public class Example03{
	public static void main(String[] args ){
		MyThread03 myThread = new MyThread03() ;
		new Thread (myThread,"线程一").start();
		new Thread (myThread,"线程二").start();
		
	}
}
