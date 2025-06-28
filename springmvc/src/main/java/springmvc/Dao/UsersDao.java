package springmvc.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.Users;

@Repository
public class UsersDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(Users users) {
	    int id = (Integer) this.hibernateTemplate.save(users);
		return id;
	}
}
