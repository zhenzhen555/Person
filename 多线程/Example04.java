public class Example04{
	public static void main(String[] args){
		MyThread04 myThread = new MyThread04();
		Thread thread=new Thread(myThread);
		thread.start();
		for(int i=1;i<=100;i++){
			System.out.println("main");
		} 
		
	}
}
