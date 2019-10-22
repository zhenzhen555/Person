public class Example06{
	public static void main(String[] args){
		Taxi ta = new Taxi();
		new Thread (ta,"出租车1").start();
		new Thread (ta,"出租车2").start();
		new Thread (ta,"出租车3").start();
		new Thread (ta,"出租车4").start();
		new Thread (ta,"出租车5").start();
	} 
}