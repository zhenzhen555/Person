package view;

import java.util.Scanner;
import view.MainUI;
public class CourseSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MainUI.show();
		
	}
	public static void show() {
		System.out.println("��ѡ����Ŀγ̣�");
		System.out.println("�γ��б�\r\n"
				+ "1.���ݿ�ѧ����\r\n"
				+ "2.�����ݲɼ���Ԥ������\r\n"
				+ "3.ǰ�˿�������\r\n"
				+ "4.�����ݼ�����Ӧ��\r\n"
				+ "5.���ݿ�ϵͳ�����ݲֿ�\r\n"
				+ "6.�����ϵͳ����\r\n"
				+ "0.�˳�ѡ��");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			System.out.println("��ѡ�����ݿ�ѧ����");
			show();
			break;
		case "2":
		
			System.out.println("��ѡ��ǰ�˿�������");
			show();
			break;
		case "3":
			System.out.println("��ѡ�����ݼ�����Ӧ��");
			show();
			break;
		case "4":
			System.out.println("��ѡ�����ݿ�ϵͳ�����ݲֿ�");
			show();
			break;
		case "0":
			System.out.print("���˳�");
			break;
		}
		System.out.println("\n");
		MainUI.show();	
	} 
}
