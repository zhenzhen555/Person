public class Example05{
	public static void main(String[] args){
		FenFa ff = new FenFa();
		new Thread (ff,"老师1").start();
		new Thread (ff,"老师2").start();
		new Thread (ff,"老师3").start();
		
	} 
}
