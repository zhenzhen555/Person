package view;

import java.util.Scanner;

import biz.StudentBiz;

public class LoginUI {	

	public static void show() {
		Scanner scanner;
		String studentName;
		String studentPassword;
		StudentBiz studentBiz;
		System.out.println("������ѧ�ţ�");
		scanner = new Scanner(System.in);
		studentName = scanner.nextLine();
		System.out.println("���������룺");
		studentPassword = scanner.nextLine();
		studentBiz = new StudentBiz();
		studentBiz.login(studentName, studentPassword);
	}
}
