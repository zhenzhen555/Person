package dao;
import entity.IEntity;

import java.util.*;
import entity.*;
import java.io.*;
import java.util.HashMap;
public class CourseDao implements IDao {
	public static CourseDao instance;
	public HashMap<String,IEntity> courses=new HashMap<String, IEntity>();
	//private Course courses;
	public CourseDao(){
		//courses=new HashMap<String, IEntity>();
		Course course1=new Course();
		Course course2=new Course();
		Course course3=new Course();
		course1.setCourseNo("01");
		course1.setCourseName("物理");
		course1.setCourseGrade(3);
		courses.put(course1.getCourseNo(),course1);
		course2.setCourseNo("02");
		course2.setCourseName("概率论");
		course2.setCourseGrade(5);
		courses.put(course2.getCourseNo(),course2);
		course3.setCourseNo("03");
		course3.setCourseName("离散数学");
		course3.setCourseGrade(3);
		courses.put(course3.getCourseNo(),course3);
	}
	public static CourseDao getInstance(){
		if(instance==null){
			synchronized(CourseDao.class){
				if(instance==null){
				instance=new CourseDao();
				return instance;
				}
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
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, entity.IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return courses;
	}
	//public IEntity getEntity(String Id) {
		//// TODO 自动生成的方法存根
	//	return courses.get(Id);
	@Override
	public IEntity getEntity(String Id) {
		// TODO 自动生成的方法存根
		return courses.get(Id);
	}
	}

