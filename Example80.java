
public class Example80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.println("***---学生管理系统---***");
    System.out.println("1、添加同学信息----------------");
     add();
    System.out.println("2、删除同学信息----------------");
    remove();
    System.out.println("3、修改同学信息----------------");
    alter();
	}
    public static void add() {
    	StringBuffer sb = new StringBuffer();
    	sb.append(" 张三 184805001"); 
    	System.out.println("append添加结果： "+sb);
    	sb.insert(0,"18级");
    	System.out.println("insert添加结果： "+sb);
    	
    }
    public static void remove() {
    	StringBuffer sb = new StringBuffer("18 级 李四  18480500002");
    	sb.delete(15,17);
    	System.out.println("删除指定位置结果： "+sb);
    	
    	sb.delete(0,sb.length());
    	System.out.println("清空缓冲区域结果："+sb);
     }	
    public static void alter() {
    	StringBuffer sb= new StringBuffer("111805001");
    	String str1 = new String("18级 王五  ");
    	sb.setCharAt(8, '3');
    	System.out.println("修改指定位置字符串: "+sb);
    	sb.replace(1, 3, "84");
    	System.out.println("替换指定字符串结果： "+sb);
    	System.out.println(str1+sb);
    	
   
}
}
