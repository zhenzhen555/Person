package dao;
import entity.Course;
import entity.IEntity;
import java.util.HashMap;
import entity.SC;
public class SCDao implements IDao {
	private static SCDao instance;
	private HashMap<String, IEntity> scs;
	private SC sc;
	private SCDao(){
		scs=new HashMap<String, IEntity>();
		sc=new SC();
		
		sc.setStudentNo("184805029");
		sc.setCourseNo("1");
		sc.getGrade();
	}
	public static SCDao getInstance(){
		if(instance==null){
			synchronized(SCDao.class){
				instance=new SCDao();
				return instance;
			}
		}
		return instance;
		
	}
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		SC co=(SC)entity;
		scs.put(co.getCourseNo(), co);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
	public void update1(IEntity entity){
		scs.put(((SC)entity).getStudentNo(),(SC)entity);
	}

	@Override
	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return scs;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return scs.get(Id);
	}
	

}
