package dao;
import java.util.HashMap;
import entity.IEntity;;
public interface IDao {
	void insert(IEntity entity);//增
	void delete();//删
	void update();//改
	public HashMap<String, IEntity> getAllEntities();//获取全部实体类 
	public IEntity getEntity(String Id);//获得某个实体
}
