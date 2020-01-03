package biz;
import dao.StudentDao;
import entity.Student;
import view.MainUI;
import  entity.Student;
import view.ModifyPasswordUI;
public class StudentBiz {
         StudentDao studentDao;
         private Student student;
         //��¼��
         public void login(String studentNo,String studentPassword){
        	 studentDao=StudentDao.getInstance();
        	 student = (Student)studentDao.getEntity(studentNo);
        	 if(student==null){
        		 System.out.println("�û�������");
        		 return ;
        	 }else if(student.getStudentPassword().equals(studentPassword)){
        		 System.out.println("��¼�ɹ�");
        		 MainUI.show();
        		 
        	 }else{
        		 System.out.println("���벻��ȷ");
        		 MainUI.show();
        	 }
         }
         //ע��ҵ���߼�ʵ��
         public void register (String studentNo,String studentName,String studentGender,int studentAge,
        		               String studentDepartment,String firstPassword,String secondPassword){
        	 if(firstPassword.equals(secondPassword)){
        		 student=new Student();
        		 student.setStudentNo(studentNo);
        		 student.setStudentName(studentName);
        		 student.setStudentAge(studentAge);
        		 student.setStudentDepartment(studentDepartment);
        		 student.setStudentPassword(firstPassword);
        		 studentDao = StudentDao.getInstance();
        		 studentDao.insert(student);
        		 System.out.println("ע��ɹ�");
        		 MainUI.show();
        		 } else{
        			 System.out.println("ע�᲻�ɹ�");
        		 }
         }
         public void ModifyPassword(String xuehao, String mima, String xinmima, String querenmima){
     		studentDao = StudentDao.getInstance();
     		student = (Student) studentDao.getEntity(xuehao);
     		if (student == null) {
     			System.out.println("�������û������������룺");
     			ModifyPasswordUI.show();
     			return;
     		} else if(student.getStudentPassword().equals(mima)){
     			student.setStudentPassword(xinmima);
     			studentDao.insert(student);
     			System.out.println("�޸ĳɹ���");
     			MainUI.show();
     		}
     	}
         
}
