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
			System.out.println("��������������������������ӭ����ѡ��ϵͳ������������������������\r\n"
				            +"����������1.��ѡ������������2.��ѡ�������������3.��ѡ����������4.�˳�����\r\n"
				           +"������Ҫ���еĲ���\r\n"
				);
		//Scanner scanner = new Scanner(System.in);
		String option1=scanner.nextLine();
		SCBiz scBiz=new SCBiz();
		switch(option1){
		case "1":
//			System.out.println("��������ѡ��Ŀγ̱��");
			//SCBiz scBiz = new SCBiz();
			scBiz.selection();
			System.out.println("��ѡ�ɹ���");
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
			System.out.println("�����˳�ѡ��ϵͳ����������������������");
			MainUI.show();
		break;
		}
	}
	}
}
