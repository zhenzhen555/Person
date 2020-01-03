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
            	Scanner scan = new Scanner(System.in);
            	System.out.println("请输入学号");
            	String studentNo=scan.nextLine();
            	System.out.println("请输入课程号");
            	String courseNo=scan.nextLine();
            	sc=(SC)scDao.getEntity(studentNo);
            	if(sc==null){
            		sc=new SC();
            		sc.setStudentNo(studentNo);
            		StringBuffer courseNo1 = new StringBuffer();
            		courseNo1.append(courseNo+",");
            		sc.setCourseNo(courseNo1);
            		CourseDao courseDao = (CourseDao)CourseDao.getInstance();
            		Course course = (Course)courseDao.getEntity();
            		int grade =course.getCourseGrade();
            		sc.setGrade(grade);
            		scDao.insert(sc);
            		
            	}else{
            		StringBuffer s = new StringBuffer();
            		StringBuffer s1 = new StringBuffer();
            		 s= sc.getCourseNo();
            		 s1=sc.getCourseNo();
            		String [] arr = s1.toString().split(",");
            		int flag = 0;
            		for(int i=0;i<arr.length;i++){
            			if(arr[i].equals(courseNo))
            				flag=1;
            			
            		}
            		if(flag==0){
            			s.append(courseNo+",");
            			sc.setCourseNo(s);
            			int a= sc.getGrade();
            			a=a+(((Course)courseDao.getEntity(courseNo)).getCourseGrade());
            			sc.setGrade(a);
            			scDao.insert(sc);
            			
            		}	else System.out.println("你已经选过该课程了,请选其他课程");
            		
            			
            		
            				
            	}
            }
            public void withdraw1(){
            	CourseBiz courseBiz =new CourseBiz();
            	CourseBiz.print();
            	Scanner scan = new Scanner(System.in);
            	System.out.println("输入学号");
            	String studentNo = scan.nextLine();
            	System.out.println("输入课程号");
            	String courseNo = scan.nextLine();
                 
            	sc=(SC)scDao.getEntity(studentNo);
            	StringBuffer s =new StringBuffer();
            	s = sc.getcourseNo();
            	String[] arr  = s.toString().split(",");
            	int flag =0;
            	for(int i =0;i<arr.length;i++){
            		if(arr[i].equals(courseNo)) flag =1;
            		
            	}if(flag==0){
            		System.out.println("你还没有选过该课程");
            		
            	}
            	else{
            		s.delete(0, s.length());
            		for(i=0;i<arr.length;i++){
            			if(arr[i].equals(courseNo)) continue;
            			s.append(arr[i]+",");
            			
            		}int a =sc.getGrade();
            a=a-(((Course)courseDao.getEntity(courseNo).getCourseGrade()));
            sc.setGrade(a);
            scDao.update1(sc);
            	}
            	
            }
            public static void showresult(){
            	Scanner scan = new Scanner(System.in);
            	System.out.print("输入学号");
            	String studentNo = scan.nextLine();
            	SCDao scDao = SCDao.getInstance();
            	SC sc=(SC)scDao.getInstance();
            	String[] courseNo = sc.getCourseNo().toString.split(",");
            	System.out.println("你选了如下课程");
            	for(int i=0;i<courseNo.length;i++){
            		Course course=(Course)CourseDao.getInstance().getEntity(CourseNo);
            		System.out.println("课程编号为"+course.getCourseNo()+"课程名称"+course.getCourseName()+"课程学分"+course.getCourseGrade());
            	}
            	System.out.println("以上是所选课程信息，您当前一共选择了"+courseNo.length+"学分一共"+sc.getGrade());
            }
            
	
}
