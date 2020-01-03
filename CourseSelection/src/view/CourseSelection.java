package view;

import java.util.Scanner;
import view.MainUI;
import biz.*;
import dao.*;
import entity.*;
public class CourseSelection {
  //  private static final String=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MainUI.show();
			CourseDao.getInstance();
	}
	public static void show() {
		int flag=0;
		Scanner scanner = new Scanner(System.in);
		while(true){
			if(flag==1) break;
			System.out.println("————————————欢迎进入选课系统————————————\r\n"
				            +"—————1.正选——————2.正选结果—————3.退选—————4.退出——\r\n"
				           +"请输入要进行的操作\r\n"
				);
		//Scanner scanner = new Scanner(System.in);
		String option1=scanner.nextLine();
		SCBiz scBiz=new SCBiz();
		switch(option1){
		case "1":
//			System.out.println("请输入您选择的课程编号");
			//SCBiz scBiz = new SCBiz();
			scBiz.selection();
			System.out.println("正选成功！");
//			show();
			break;
		case "2": 
			scBiz.showresult();
			System.out.println("");
			break;
		case "3": 
			scBiz.withdraw1();
			break;
		case "4":flag=1;
			System.out.println("您已退出选课系统，请根据您的需求继续输入");
			MainUI.show();
		break;
		}
	}
	}
}
