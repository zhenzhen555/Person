import telcom.*;
import user.*;
import telcomfactory.*;

public class TelcomAccountSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ����һ�������û���TelcomUser
		TelcomUser telcomUser = new TelcomUser("13800138000");
			   
		//����ͨ����¼
		telcomUser.generateCommunicateRecord();
		//��ӡͨ���굥
		telcomUser.printDetails();

	}

}
