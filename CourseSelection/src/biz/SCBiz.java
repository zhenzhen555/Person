package biz;
import java.util.HashMap;
import java.util.Scanner;

import entity.Course;
import entity.SC;
import dao.*;


public class SCBiz {
            SCDao scDao= SCDao.getInstance();
            CourseDao courseDao= CourseDao.getInstance();
            private SC sc;
            public void selection(){
            	CourseBiz courseBiz = new CourseBiz();
            	courseBiz.print();
            	//HashMap courses=new HashMap();
            	//courses=courseDao.getAllEntities();
            	//courseBiz.print();
            	Scanner scan = new Scanner(System.in);
            	System.out.println("������ѧ��");
            	String studentNo=scan.nextLine();
            	System.out.println("������γ̺�");
            	String courseNo=scan.nextLine();
            	sc=(SC)scDao.getEntity(studentNo);
            	if(sc==null){
            		sc=new SC();
            		sc.setStudentNo(studentNo);
            		StringBuffer courseNo1 = new StringBuffer();
            		courseNo1.append(courseNo+",");
            		
            		sc.setCourseNo(courseNo1);
            		CourseDao courseDao = (CourseDao)CourseDao.getInstance();
            		Course course = (Course)courseDao.getEntity(courseNo);
            		
           		    int grade =course.getCourseGrade();
            		sc.setGrade(grade);
            		scDao.insert(sc);
            		
            	}else{
            		StringBuffer s = new StringBuffer();
            		StringBuffer s1 = new StringBuffer();
            		 s= sc.getCourseNo();
            		 s1=sc.getCourseNo();
            		// System.out.println(s1+"***");
            		String [] arr = s1.toString().split(",");
            		int flag = 0;
            		for(int i=0;i<arr.length;i++){
            			if(arr[i].equals(courseNo))
            				flag=1;
            			
            		}
            		if(flag==0){
            			sc.setStudentNo(studentNo);
            			s.append(courseNo+",");
            			sc.setCourseNo(s);
            			int a= sc.getGrade();
            			a=a+(((Course)courseDao.getEntity(courseNo)).getCourseGrade());
            			sc.setGrade(a);
            			scDao.insert(sc);
            			
            		}	else System.out.println("���Ѿ�ѡ���ÿγ���,��ѡ�����γ�");
            		
            			
            		
            				
            	}
            }
            public void withdraw1(){
            	CourseBiz courseBiz =new CourseBiz();
            	//HashMap courses=new HashMap();
            	//courses=courseDao.getAllEntities();
            	CourseBiz.print();
            	Scanner scan = new Scanner(System.in);
            	System.out.println("����ѧ��");
            
            
                String studentNo = scan.nextLine();
             	System.out.println("����γ̺�");
            	String courseNo = scan.nextLine();
                 
            	sc=(SC)scDao.getEntity(studentNo);
            	StringBuffer s =new StringBuffer();
            	s = sc.getCourseNo();
            	String[] arr  = s.toString().split(",");
            	int flag =0;
            	for(int i =0;i<arr.length;i++){
            		if(arr[i].equals(courseNo)) flag =1;
            		
            	}if(flag==0){
            		System.out.println("�㻹û��ѡ���ÿγ�");
            		
            	}
            	else{
            		s.delete(0, s.length());
            		for(int i=0;i<arr.length;i++){
            			if(arr[i].equals(courseNo))
            				continue;
            			s.append(arr[i]+",");
            			
            		}
            		int a =sc.getGrade();
            a=a-(((Course)courseDao.getEntity(courseNo)).getCourseGrade());
            sc.setGrade(a);
            scDao.update1(sc);
            	}
            	
            }
            public void showresult(){
            	Scanner scan = new Scanner(System.in);
            	System.out.print("����ѧ��");
            	String studentNo = scan.nextLine();
            	SCDao scDao = SCDao.getInstance();
            	SC sc=(SC)scDao.getEntity(studentNo);
            	String[] courseNo = sc.getCourseNo().toString().split(",");
            	System.out.println("��ѡ�����¿γ�");
            	for(int i=0;i<courseNo.length;i++){
            		Course course=(Course)CourseDao.getInstance().getEntity(courseNo[i]);
            		System.out.println("�γ̱��Ϊ��"+course.getCourseNo()+" �γ����ƣ�"+course.getCourseName()+" �γ�ѧ�֣�"+course.getCourseGrade());
            	}
            	System.out.println("��������ѡ�γ���Ϣ������ǰһ��ѡ���ˣ�"+courseNo.length+"�ſ�,ѧ��һ����"+sc.getGrade()+"��");
            }
            
       
	
}