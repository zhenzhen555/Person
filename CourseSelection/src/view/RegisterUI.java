package view;

import java.util.Scanner;

import biz.StudentBiz;
import dao.StudentDao;

public class RegisterUI {
	public static void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String studentNo = scanner.nextLine();
		System.out.println("������������");
		String studentName = scanner.nextLine();
		System.out.println("�������Ա�");
		String studentGender = scanner.nextLine();
		System.out.println("���������䣺");
		int studentAge = Integer.parseInt(scanner.nextLine());		
		System.out.println("������Ժϵ��");
		String studentDepartment = scanner.nextLine();
		System.out.println("���������룺");
		String firstPassword = scanner.nextLine();
		System.out.println("���ٴ��������룺");
		String secondPassword = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.register(studentNo, 
				studentName, 
				studentGender, 
				studentAge, 
				studentDepartment, 
				firstPassword, 
				secondPassword);
	}
}
