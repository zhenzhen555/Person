
public class TelcomAccountSystem0 {

	public static void main(String[] args) {
		//ʵ����һ�������û���TelcomUser
		//TelcomUser telcomUser = new TelcomUser("13800138000");
		TelcomUserBasedOnCollection0 telcomUser = new TelcomUserBasedOnCollection0("13800138000");
		//����ͨ����¼
		telcomUser.generateCommunicateRecord();
		//��ӡͨ���굥
		telcomUser.printDetails();
		//telcomUser.printCallToNumber();
	}

}
