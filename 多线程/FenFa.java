class FenFa implements Runnable{
	private int zuoye =80;
	public void run(){
		while(true){
			if (zuoye>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڷַ���"+zuoye--+"�ʼ�");
			}
		}
	}
}