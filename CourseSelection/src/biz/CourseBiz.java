package biz;
import dao.CourseDao;
import dao.StudentDao;
import entity.*;
import view.*;
import java.util.*;
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
			System.out.println("正选成功！");
			MainUI.show();
		}
		else{
			
		}
	}
//	public static void print(HashMap courses){
//		Collection values = courses.values();
//		Iterator it=values.iterator();
//		while(it.hasNext()){
//			Object value = it.next();
//			System.out.println(value);
//		}
//	}
	
	/*public static void print(){
		CourseDao courseDao =new CourseDao.getInstance();
		HashMap<String,IEntity> hashMap = courseDao.getAllEntities();
		Set set = hashMap.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}*/
	public static void print(){
		CourseDao courseDao=new CourseDao();
		Set keySet=courseDao.getAllEntities().keySet();
		Iterator it=keySet.iterator();
		System.out.println("-------可选课程信息--------");
		while(it.hasNext()){
			Object key=it.next();
			Course value=(Course)courseDao.getAllEntities().get(key);
			System.out.println("课程编号："+key+"课程名称："+value.getCourseName()+"课程学分："+value.getCourseGrade());
		}
	}
}
