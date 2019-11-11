import java.util.Random;
class Storage{
	private int[] cells=new int [100];
	private int inpos ,outpos;
	public void put(int  num) {
		Random r1=new Random();
		System.out.println("产生0~100之间int类型的随机数："+r1.nextInt(100));
		cells[inpos]=r1.nextInt(100);
		System.out.println(" 用户正在登录"+String.valueOf(cells[inpos]));
		inpos++;
		if(inpos==cells.length)
			inpos=0;
	}
	public void get() {
		int data=cells[outpos];
		System.out.println(" 注销用户"+data);
		outpos++;
		if(outpos==cells.length)
			outpos=0;
	}
}

class Input implements Runnable{
	private Storage st;
	private int num;
	Input (Storage st){
		this.st=st;
		
	}
	public void run() {
		while (true) {
			st.put(num++);
			
		}
	}
	
}
class Output implements Runnable{
	private Storage st;
	Output(Storage st){
		this.st=st;	
				}
	public void run() {
		while(true) {
			st.get();
		}
		
	}
	
}
public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Storage st=new Storage();
       Input input=new Input(st);
       Output output=new Output(st);
       new Thread(input).start();
       new Thread(output).start(); 
       
	}

}
