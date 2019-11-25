import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class TelcomUserBasedOnCollection {
   private String phoneNumber;
   private String callto;
   private Vector communicationRecords;
   private TreeSet callToNumbersSet;
   private ArrayList callToNumbersList;
   public TelcomUserBasedOnCollection(String phoneNumber) {
	   this.phoneNumber = phoneNumber;
	   this.communicationRecords = new Vector();
	   this.callToNumbersSet = new TreeSet();
	   this.callToNumbersList = new ArrayList();
	   
   }     
   void generateCommunicateRecord() {
	   int recordNum = new Random().nextInt(10);
	   for(int i=0;i<=recordNum;i++) {
		   //�������i��ͨ����¼
		   //Calendar��ȡ��ǰʱ��
		   callto=getCallToPhoneNumber();
		   
		   Calendar cal = Calendar.getInstance();
		   //�����ȥ����Сʱ
		   cal.add(Calendar.HOUR,-new Random().nextInt(10));
		   long timeStart = cal.getTimeInMillis();
		   long timeEnd = timeStart + 60000+new Random().nextInt(600000);
		   this.callToNumbersList.add(this.callto);
		   this.callToNumbersSet.add(this.callto);
		   //����ͨ����¼
		   this.communicationRecords.add(this.phoneNumber+","+timeStart+","
				   +timeEnd+","+this.callto);
		   } 
		 }  
	      //������ɵ绰�����1λ
      private String getCallToPhoneNumber() {
    	  return "1380372000"+String.valueOf(new Random().nextInt(10));
    	  
      }
      //ģ��ƷѰ취�����ַ�������ʽ������λС��
      private String accountFee(long timeStart,long timeEnd) {
    	  double feePerMinute =0.2;
    	  int minutes = Math.round((timeEnd-timeStart)/60000);
    	  double feeTotal =feePerMinute*minutes;
    	  return String.format("%.4f",feeTotal);
      }
      void printCallToNumber() {
    	  System.out.println("-------���к��벻�ظ��Ĺ���------------");
    	  for(Object callto:this.callToNumbersSet) {
    		 
    		  System.out.println((String)callto);
    	  }
    	 System.out.println("-----���еı��к���--------");
    	  for(Object callTo:this.callToNumbersList) {
    		  System.out.println((String)callTo);
    	  }
      }
                      //��ӡͨ����¼
      void printDetails() {
    	         //ʹ��Enumeration�ӿڱ�����ע��Ӧ��communicationRecords����ΪVector
    	  Enumeration enumeration = this.communicationRecords.elements();
    	  while(enumeration.hasMoreElements()) {
    		  System.out.println("--------ͨ����¼�ָ���----------");
    		  String [] recordField = ((String)enumeration.nextElement()).split(",");
    		  System.out.println("���У�"+recordField[0]);
    		  System.out.println("���У� "+recordField[3]);
    		  Date timeStart= new Date(Long.parseLong(recordField[1]));
    		  Date timeEnd = new Date(Long.parseLong(recordField[2]));
    		  SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
    		  System.out.println("ͨ����ʼʱ�䣺"+simpleDateFormat.format(timeStart));
    		  System.out.println("ͨ������ʱ�䣺"+simpleDateFormat.format(timeEnd));
    		  System.out.println("�Ʒѣ�"+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
    		        +"Ԫ");
    		  
    		  
    	  }
      }
}
