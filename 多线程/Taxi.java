class Taxi implements Runnable{
	private int passenger =100;
	public void run(){
		while(true){
			if (passenger>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڽ��͵�"+passenger--+"������");
			}
		}
	}
}
