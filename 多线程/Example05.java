public class Example05{
	public static void main(String[] args){
		FenFa ff = new FenFa();
		new Thread (ff,"��ʦ1").start();
		new Thread (ff,"��ʦ2").start();
		new Thread (ff,"��ʦ3").start();
		
	} 
}
