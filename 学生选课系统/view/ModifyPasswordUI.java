package view;
import java.util.Scanner;
import view.MainUI;
import biz.StudentBiz;
import dao.StudentDao;
public class ModifyPasswordUI{
	String studentname,studentoldpassword,studentnewpassword1,studentnewpassword2;
	public static void show() {
		StudentDao studentdao;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		String studentname = scanner.nextLine();
		System.out.println("��������룺");
		String studentoldpassword = scanner.nextLine();   
		System.out.println("���������룺");
		String studentnewpassword1 = scanner.nextLine(); 
		System.out.println("��ȷ�������룺");
		String studentnewpassword2= scanner.nextLine(); 
		if(studentnewpassword1.equals(studentnewpassword2)){
			System.out.println("�޸ĳɹ�");
			
		}
		else{
			System.out.println("�޸�ʧ��");
			ModifyPasswordUI.show();
		}
	
		MainUI.show();
	}
}
	
