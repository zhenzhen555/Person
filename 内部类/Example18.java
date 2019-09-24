//¾²Ì¬ÄÚ²¿Àà
class Outer{
	private static int num=6;
	static class Inner{
		void show(){
			System.out.println("num= "+num);
		}
	}
}
class Example18{
	public static void main(String[] args){
		Outer.Inner inner=new Outer.Inner();
		inner.show();
	}
}