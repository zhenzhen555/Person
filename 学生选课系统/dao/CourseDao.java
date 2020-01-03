package dao;
import entity.IEntity;

import java.util.*;
import entity.Course;
public class CourseDao implements IDao {
	private static CourseDao instance;
	private HashMap<String, Course> courses;
	private Course course;
	private CourseDao(){
		courses=new HashMap<String, Course>();
		course=new Course();
		
		course.setCourseNo("1");
		course.setCourseName("ŒÔ¿Ì");
		course.setCourseGrade(3);
		courses.put(course.getCourseNo(),course);
	}
	public static CourseDao getInstance(){
		if(instance==null){
			synchronized(CourseDao.class){
				instance=new CourseDao();
				return instance;
			}
		}
		return instance;
		
	}
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		Course co=(Course)entity;
		courses.put(co.getCourseNo(), co);
		//courses.put(co.getCourseName(), co);
		//courses.get(co.getCourseGrade());
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		Course co=new Course();
		courses.remove(co.getCourseNo());
		//courses.remove(co.getCourseName());
		//courses.remove(co.getCourseGrade());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, entity.IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
