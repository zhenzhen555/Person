import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class TelcomUserBasedOnCollection1 {
   private String phoneNumber;
   private String callto;
   private ArrayList communicationRecords;
   private LinkedHashMap singleRecord;
   private TreeMap treeMapCallToAndFee;
  
   public TelcomUserBasedOnCollection1(String phoneNumber) {
	   this.phoneNumber = phoneNumber;
	   this.communicationRecords = new  ArrayList ();
	   this.singleRecord = new LinkedHashMap();
	   this.treeMapCallToAndFee = new TreeMap();
	   
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
		   
						
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
			
		   this.singleRecord = new LinkedHashMap();
		   this.singleRecord.put("����",this.phoneNumber);
		   
		   this.singleRecord.put("��ʼʱ��",simpleDateFormat.format(timeStart));
		   this.singleRecord.put("����ʱ��", simpleDateFormat.format(timeEnd));
		   this.singleRecord.put("���к���",this.callto);
		   this.singleRecord.put("�Ʒ�",this.accountFee(timeStart,timeEnd)+"Ԫ");
		   //����ͨ����¼
		   this.communicationRecords.add(this.singleRecord);
		   this.treeMapCallToAndFee.put(this.callto,this.accountFee(timeStart,timeEnd));
		   
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
     
                      //��ӡͨ����¼
    void printDetails() {
    	         //ʹ��Enumeration�ӿڱ�����ע��Ӧ��communicationRecords����ΪVector
    	Iterator itRecords = this.communicationRecords.iterator();
    	  while(itRecords.hasNext()) {
    		  System.out.println("--------ͨ����¼�ָ���----------");
    		 this.singleRecord = ((LinkedHashMap)itRecords.next());
    		 Set entrySet = this.singleRecord.entrySet();
    		 Iterator itEntry = entrySet.iterator();
    		 while(itEntry.hasNext()){
    			 Map.Entry entry = (Map.Entry)itEntry.next();
    			 Object key = entry.getKey();
    			 Object value = entry.getValue();
    			 //��˳�����
    			 System.out.println(key + ":" + value);
    			 
    		 }
    		  
    		  
    		  
    	  }
    	}
      
      void printCallToAndFee() {
    	  Iterator  it = this.treeMapCallToAndFee.entrySet().iterator();
    	  while (it.hasNext()) {
    		  Map.Entry entry = (Map.Entry)it.next();
    		  System.out.println(entry.getKey()+":"+entry.getValue());
    	  }
      }
      
      
}
