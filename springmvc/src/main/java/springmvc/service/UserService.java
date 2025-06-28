package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.UsersDao;
import springmvc.model.Users;

@Service
public class UserService {

	@Autowired
	private UsersDao usersDao;
	
	public int createUser(Users users) {
		int id = (Integer) usersDao.saveUser(users);
		return id;
	}
}
