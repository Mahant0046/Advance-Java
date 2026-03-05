package SpringMvc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import SpingMvc.Model.User;

public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveUser(User user) {
		int id=(Integer)this.hibernateTemplate.save(user);
		return id;
	}

}
