package SpringMvc.Service;

import org.springframework.beans.factory.annotation.Autowired;

import SpingMvc.Model.User;
import SpringMvc.Dao.UserDao;

public class UserService {

	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
	
	
	
}
