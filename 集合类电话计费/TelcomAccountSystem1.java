
public class TelcomAccountSystem1 {

	public static void main(String[] args) {
		//ʵ����һ�������û���TelcomUser
		//TelcomUser telcomUser = new TelcomUser("13800138000");
		TelcomUserBasedOnCollection1 telcomUser = new TelcomUserBasedOnCollection1("13800138000");
		//����ͨ����¼
		telcomUser.generateCommunicateRecord();
		//��ӡͨ���굥
		telcomUser.printCallToAndFee();
		telcomUser.printDetails();
	}

}
