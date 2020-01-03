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
		System.out.println("请输入姓名：");
		String studentname = scanner.nextLine();
		System.out.println("请输旧密码：");
		String studentoldpassword = scanner.nextLine();   
		System.out.println("请输新密码：");
		String studentnewpassword1 = scanner.nextLine(); 
		System.out.println("请确认新密码：");
		String studentnewpassword2= scanner.nextLine(); 
		if(studentnewpassword1.equals(studentnewpassword2)){
			System.out.println("修改成功");
			
		}
		else{
			System.out.println("修改失败");
			ModifyPasswordUI.show();
		}
	
		MainUI.show();
	}
}
	
