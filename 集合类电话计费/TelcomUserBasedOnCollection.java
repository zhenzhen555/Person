import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class TelcomUserBasedOnCollection {
   private String phoneNumber;
   private String callto;
   private ArrayList communicationRecords;
   private HashMap singleRecord;
  
   public TelcomUserBasedOnCollection(String phoneNumber) {
	   this.phoneNumber = phoneNumber;
	   this.communicationRecords = new  ArrayList ();
	   this.singleRecord = new HashMap();
	   
	   
   }     
   void generateCommunicateRecord() {
	   int recordNum = new Random().nextInt(10);
	   for(int i=0;i<=recordNum;i++) {
		   //随机生成i条通话记录
		   //Calendar获取当前时间
		   callto=getCallToPhoneNumber();
		   
		   Calendar cal = Calendar.getInstance();
		   //随机减去若干小时
		   cal.add(Calendar.HOUR,-new Random().nextInt(10));
		   long timeStart = cal.getTimeInMillis();
		   long timeEnd = timeStart + 60000+new Random().nextInt(600000);
		   
						
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
			
		   this.singleRecord = new HashMap();
		   this.singleRecord.put("主叫",this.phoneNumber);
		   
		   this.singleRecord.put("开始时间",simpleDateFormat.format(timeStart));
		   this.singleRecord.put("结束时间", simpleDateFormat.format(timeEnd));
		   this.singleRecord.put("被叫号码",this.callto);
		   this.singleRecord.put("计费",this.accountFee(timeStart,timeEnd));
		   //插入通话记录
		   this.communicationRecords.add(this.singleRecord);
		   } 
		 }  
	      //随机生成电话号码后1位
      private String getCallToPhoneNumber() {
    	  return "1380372000"+String.valueOf(new Random().nextInt(10));
    	  
      }
      //模拟计费办法，以字符串的形式保留四位小数
      private String accountFee(long timeStart,long timeEnd) {
    	  double feePerMinute =0.2;
    	  int minutes = Math.round((timeEnd-timeStart)/60000);
    	  double feeTotal =feePerMinute*minutes;
    	  return String.format("%.4f",feeTotal);
      }
     
                      //打印通话记录
      void printDetails() {
    	         //使用Enumeration接口遍历。注意应将communicationRecords定义为Vector
    	Iterator itRecords = this.communicationRecords.iterator();
    	  while(itRecords.hasNext()) {
    		  System.out.println("--------通话记录分割线----------");
    		 this.singleRecord = ((HashMap)itRecords.next());
    		 Set entrySet = this.singleRecord.entrySet();
    		 Iterator itEntry = entrySet.iterator();
    		 while(itEntry.hasNext()){
    			 Map.Entry entry = (Map.Entry)itEntry.next();
    			 Object key = entry.getKey();
    			 Object value = entry.getValue();
    			 //无顺序输出
    			 System.out.println(key + ":" + value);
    			 
    		 }
    		  
    		  
    		  
    	  }
      }
}
