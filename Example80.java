
public class Example80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.println("***---ѧ������ϵͳ---***");
    System.out.println("1�����ͬѧ��Ϣ----------------");
     add();
    System.out.println("2��ɾ��ͬѧ��Ϣ----------------");
    remove();
    System.out.println("3���޸�ͬѧ��Ϣ----------------");
    alter();
	}
    public static void add() {
    	StringBuffer sb = new StringBuffer();
    	sb.append(" ���� 184805001"); 
    	System.out.println("append��ӽ���� "+sb);
    	sb.insert(0,"18��");
    	System.out.println("insert��ӽ���� "+sb);
    	
    }
    public static void remove() {
    	StringBuffer sb = new StringBuffer("18 �� ����  18480500002");
    	sb.delete(15,17);
    	System.out.println("ɾ��ָ��λ�ý���� "+sb);
    	
    	sb.delete(0,sb.length());
    	System.out.println("��ջ�����������"+sb);
     }	
    public static void alter() {
    	StringBuffer sb= new StringBuffer("111805001");
    	String str1 = new String("18�� ����  ");
    	sb.setCharAt(8, '3');
    	System.out.println("�޸�ָ��λ���ַ���: "+sb);
    	sb.replace(1, 3, "84");
    	System.out.println("�滻ָ���ַ�������� "+sb);
    	System.out.println(str1+sb);
    	
   
}
}
