package biz;
import dao.CourseDao;
import dao.StudentDao;
import entity.*;
import view.*;
public class CourseBiz {
	StudentDao studentDao;
	CourseDao courseDao;
	private Student student;
	private Course course;
	public void login(String studentNo,String studentPassword){
		studentDao=StudentDao.getInstance();
		student=(Student) studentDao.getEntity(studentNo);
		if(student==null){
			System.out.println("用户不存在");
			return ;
		}
		else if(student.getStudentPassword().equals(studentPassword)){
		System.out.println("登录成功");
		MainUI.show();
		}
		else{
			System.out.println("密码不正确");
			MainUI.show();
		}
	}
	public void register(String courseNo,
			                            String courseName,
			                            int courseGrade) {
		if(course.getCourseNo().equals(courseNo)){
			course=new Course();
			course.setCourseNo(courseNo);
			course.setCourseName(courseName);
			course.setCourseGrade(courseGrade);
			courseDao.insert(course);
			System.out.println("正选成功");
			MainUI.show();
		}
		else{
			
		}
	}
}
