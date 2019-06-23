package gmail.tjsdnwls813.SpringBoard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmail.tjsdnwls813.SpringBoard.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public String emailcheck(String email) {
		
		return userDao.emailcheck(email);
	}
}
