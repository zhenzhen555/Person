package view;
import java.util.Scanner;
import view.MainUI;
import biz.StudentBiz;
import dao.StudentDao;
public class ModifyPasswordUI{
	public static void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String xuehao = scanner.nextLine();
		System.out.println("��������룺");
		String mima = scanner.nextLine();   
		System.out.println("���������룺");
		String xinmima = scanner.nextLine(); 
		System.out.println("��ȷ�������룺");
		String querenmima= scanner.nextLine(); 
		StudentBiz sc= new StudentBiz();
		sc.ModifyPassword(xuehao,mima,xinmima,querenmima);
	}
}
	
