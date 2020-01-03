package dao;
import entity.IEntity;
import entity.Student;

import java.util.HashMap;

public class StudentDao implements IDao {
    
	private static StudentDao instance;
	private HashMap<String, IEntity> students=new HashMap<String, IEntity>();;
	private Student student=new Student();
	//private StudentDao() {
		//students = new HashMap<String, IEntity>();
		//student = new Student();
		///student.setStudentNo("184805029");
		//student.setStudentName("张三");
		//student.setStudentGender("男");
		//student.setStudentPassword("123456");
		//student.setStudentAge(20);
		//student.setStudentDepartment("软件学院");
		//students.put(student.getStudentNo(), student);
	//}
	public static StudentDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new StudentDao();
					return instance;
				}
			}
		}
		return instance;
	}
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}

	@Override
	public void delete() {
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub		
		return students.get(Id);
	}

}
