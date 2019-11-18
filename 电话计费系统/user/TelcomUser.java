package user;
import java.text.*;
import utility.Utility;
import java.util.*;

import telcomfactory.TelcomFactory;
import telcom.Telcom;

public class TelcomUser {
	private String phoneNumber;    //���к���
	private String callTo;         //���к���
	private StringBuffer communicationRecords;
	Telcom Zuser;
	
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new StringBuffer();
		
		TelcomFactory telcomfactory = (TelcomFactory)Utility.getBean();
		Zuser = telcomfactory.createTelcom();
		
	}
	//ģ��ͨ����¼������
	 public void generateCommunicateRecord() {
		//�������ͨ����¼��Ŀ
		int recordNum = new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			//������ɵ�i��ͨ����¼
			
			//��ʼʱ��
			long timeStart = System.currentTimeMillis()-new Random().nextInt(36000000);
			//����ʱ��
			long timeEnd = timeStart + 60000 +new Random().nextInt(600000);
			//���к���
			
			getCallToPhoneNumber();
			callTo = getCallToPhoneNumber();
			
			//����ͨ����¼
			this.communicationRecords.append(this.phoneNumber + "," + timeStart + "," + 
			                                 timeEnd + "," + this.callTo + ";");
			
		}
		
	}
	
	//������ɱ��к��루����λ�����������
    public String getCallToPhoneNumber() {
		return "1380372" +String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10))
		+String.valueOf(new Random().nextInt(10));
		
	}
	
	//ģ��ƷѰ취�����ַ�������ʽ���ر���4λС���ļƷѽ��
	public  String accountFee(long timeStart,long timeEnd) {
		//ÿ�����շ�NԪ
		double feePerMinute = Zuser.feePerMinute();
		//ͨ��ÿ�������������������
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double  feeTotal = feePerMinute*minutes;
		return String.format("%.4f", feeTotal);
		
		
	}
	
	//��ӡͨ����¼
	public void printDetails() {
		//��ȡȫ��ͨ����¼
		String allRecords = this.communicationRecords.toString();
		//�ָ�ͨ����¼
		String [] recordArray = allRecords.split(";");
		//ѭ���ָ��¼�ڵ�ÿһ����
		for(int i=0;i<recordArray.length;i++) {
			String [] recordField = recordArray[i].split(",");
			SimpleDateFormat date1 = new SimpleDateFormat("yyyy �� MM �� dd �� HH �� mm �� ss ��");
			
			//DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
			System.out.println("-----------ͨ����¼�ָ���----------");
			System.out.println("���У�"+recordField[0]);
			System.out.println("���У�"+recordField[3]);
			System.out.println("ͨ����ʼʱ�䣺" +date1.format(Long.parseLong(recordField[1])));
			System.out.println("ͨ������ʱ�䣺" +date1.format(Long.parseLong(recordField[2])));
			System.out.println("�Ʒѣ�" + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]) ) + "Ԫ");
			
			
			
			
		}
	}

}

