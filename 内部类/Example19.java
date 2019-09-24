//方法内部类
class Outer{
	private int num=8;
	public void test(){   
	//方法中定义内部类
		class Inner{
			void show (){
				System.out.println("num = "+num);
			}
		}
		Inner in =new Inner();
		in.show();
		
	}
	
}
public class Example19{
	public static void main(String[] args){
		Outer outer = new Outer();
		outer.test();
	}
}