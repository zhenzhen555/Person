public class Example06{
	public static void main(String[] args){
		Taxi ta = new Taxi();
		new Thread (ta,"���⳵1").start();
		new Thread (ta,"���⳵2").start();
		new Thread (ta,"���⳵3").start();
		new Thread (ta,"���⳵4").start();
		new Thread (ta,"���⳵5").start();
	} 
}