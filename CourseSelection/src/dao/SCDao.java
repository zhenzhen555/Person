package dao;
import entity.IEntity;
import java.util.HashMap;
import entity.SC;
public class SCDao implements IDao {
	private static SCDao instance;
	private HashMap<String, IEntity> scs=new HashMap<String, IEntity>();
	private SC sc;
	private SCDao(){
		//scs=new HashMap<String, IEntity>();
		sc=new SC();
		
		//sc.setStudentNo("184805029");
		//sc.setCourseNo(null);
		//sc.getGrade();
	}
	public static SCDao getInstance(){
		if(instance==null){
			synchronized(SCDao.class){
				if(instance==null) {
				instance=new SCDao();
				return instance;
				}
			}
		}
		return instance;
		
	}
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		//Course co=(Course)entity;
		//courses.put(co.getCourseNo(), co);
		scs.put(((SC)entity).getStudentNo(),(SC)entity);
		System.out.println("正选成功！请继续输入操作");
		//SC sc=(SC)entity;
		//scs.put(sc.getStudentNo(), sc);
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
		System.out.println("退选成功！");
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
