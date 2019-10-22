class MyThread03 extends Thread{
	public void run(){
		Thread th =Thread.currentThread();
		String th_name=th.getName();
		System.out.println(th_name);
	}
	
}