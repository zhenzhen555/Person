package us;
import java.util.HashMap;
public class DBUtil {
	private static DBUtil instance = null;
	private HashMap<String,User>users= new HashMap<String,User>();
	//���ݹ���
private DBUtil(){
	User u1 = new User();
	u1.setCardId("1001");
	u1.setCardPwd("123456");
	u1.setUserName("С��");
	u1.setCall("15515156576");
	u1.setAccount(0);
	users.put(u1.getCardId(), u1);
	User u2 = new User();
	u2.setCardId("1002");
	u2.setCardPwd("123456");
	u2.setUserName("С��");
	u2.setCall("15515156577");
	u2.setAccount(2000);
	users.put(u2.getCardId(), u2);
	User u3 = new User();
	u3.setCardId("1003");
	u3.setCardPwd("123456");
	u3.setUserName("С��");
	u3.setCall("15515156575");
	u3.setAccount(3000);
	users.put(u3.getCardId(), u3);
}	
//����ʽ����ģʽ
public static DBUtil getInstance(){
	if (instance ==null){
		synchronized (DBUtil.class){
			if (instance ==null){
		instance = new DBUtil();
			}
	}
}

   return instance;
 }  
//�������п��Ż�ȡ��Ӧ�����ʻ�����Ϣ
  public User getUser(String cardId){
	  User user = (User)users.get(cardId);
	  return user;
  }
  //��ȡ�����ʻ���Ϣ
  public HashMap<String,User> getUsers(){
	  
	  return users;
	  
	  
  }
}
