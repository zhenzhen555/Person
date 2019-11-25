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
		   //随机生成i条通话记录
		   //Calendar获取当前时间
		   callto=getCallToPhoneNumber();
		   
		   Calendar cal = Calendar.getInstance();
		   //随机减去若干小时
		   cal.add(Calendar.HOUR,-new Random().nextInt(10));
		   long timeStart = cal.getTimeInMillis();
		   long timeEnd = timeStart + 60000+new Random().nextInt(600000);
		   this.callToNumbersList.add(this.callto);
		   this.callToNumbersSet.add(this.callto);
		   //插入通话记录
		   this.communicationRecords.add(this.phoneNumber+","+timeStart+","
				   +timeEnd+","+this.callto);
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
      void printCallToNumber() {
    	  System.out.println("-------被叫号码不重复的共有------------");
    	  for(Object callto:this.callToNumbersSet) {
    		 
    		  System.out.println((String)callto);
    	  }
    	 System.out.println("-----所有的被叫号码--------");
    	  for(Object callTo:this.callToNumbersList) {
    		  System.out.println((String)callTo);
    	  }
      }
                      //打印通话记录
      void printDetails() {
    	         //使用Enumeration接口遍历。注意应将communicationRecords定义为Vector
    	  Enumeration enumeration = this.communicationRecords.elements();
    	  while(enumeration.hasMoreElements()) {
    		  System.out.println("--------通话记录分割线----------");
    		  String [] recordField = ((String)enumeration.nextElement()).split(",");
    		  System.out.println("主叫："+recordField[0]);
    		  System.out.println("被叫： "+recordField[3]);
    		  Date timeStart= new Date(Long.parseLong(recordField[1]));
    		  Date timeEnd = new Date(Long.parseLong(recordField[2]));
    		  SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
    		  System.out.println("通话开始时间："+simpleDateFormat.format(timeStart));
    		  System.out.println("通话结束时间："+simpleDateFormat.format(timeEnd));
    		  System.out.println("计费："+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
    		        +"元");
    		  
    		  
    	  }
      }
}
