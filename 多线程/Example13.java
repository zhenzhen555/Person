
class Ticket2 implements Runnable{
 	private int tickets=10;
	public void run() {
		while (true) {
			saleTicket();
			if(tickets<=0) {
				break;
			}
		}
	}
	private synchronized void saleTicket() {
		if (tickets>0) {
			try {
				Thread.sleep(10);
			}
		catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+"---������Ʊ"+tickets--);
	}
	} 
	}
public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Ticket2 ticket=new Ticket2();
			new Thread(ticket,"�߳�һ");
			new Thread(ticket,"�̶߳�");
			new Thread(ticket,"�߳���");
			new Thread(ticket,"�߳���");
			
			
			
		

	}

}
