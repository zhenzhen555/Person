interface Car {
	void run ();
		
	
}
class Aodi implements Car{
	public void run(){
		System.out.println("�µϳ�����");
	}
	
}
class BMW implements Car{
	public void run(){
		System.out.println("��������");
	}
}
class CarFactory{
	public static Car create(String str){
		if(str.equals("�µ�")){
			return new Aodi();
		}
		else if(str.equals("����")){
			return new BMW();
		}
		return null;
	}
}
public class TestDriver01{
	public static void main (String[] args){
		Car aodi =CarFactory.create("�µ�");
		Car bmw =CarFactory.create("����");
		aodi.run();
		bmw.run();
		}
	
}