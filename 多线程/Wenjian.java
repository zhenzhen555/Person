public class Wenjian{
	public static void main (String[] args){
		
		Loading ld=new Loading();
		new Thread(ld,"�߳�һ").start();
		new Thread(ld,"�̶߳�").start();
		new Thread(ld,"�߳���").start();
	}
}
class Loading implements Runnable{
	int size = 101;
		
		int[] mount = new int[size];
	    int i=1;
	    public void run(){
		while (true){
			
		if(i<size){
			mount[i]=i;
			Thread th =Thread.currentThread();
			String th_name=th.getName();
			
			System.out.println(th_name+"����������ɰٷ�֮"+i+++"��");
		
		}
		}
	}  
}