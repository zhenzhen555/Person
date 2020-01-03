package view;
import java.util.Scanner;
import view.MainUI;
import biz.StudentBiz;
import dao.StudentDao;
public class ModifyPasswordUI{
	public static void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÑ§ºÅ£º");
		String xuehao = scanner.nextLine();
		System.out.println("ÇëÊä¾ÉÃÜÂë£º");
		String mima = scanner.nextLine();   
		System.out.println("ÇëÊäĞÂÃÜÂë£º");
		String xinmima = scanner.nextLine(); 
		System.out.println("ÇëÈ·ÈÏĞÂÃÜÂë£º");
		String querenmima= scanner.nextLine(); 
		StudentBiz sc= new StudentBiz();
		sc.ModifyPassword(xuehao,mima,xinmima,querenmima);
	}
}
	
