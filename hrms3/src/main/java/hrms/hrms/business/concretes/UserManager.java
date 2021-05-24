package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.UserService;
import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.core.utilities.result.SuccessDataResult;
import hrms.hrms.core.utilities.result.SuccessResult;
import hrms.hrms.dataAccess.abstracts.UserDao;
import hrms.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"Data listelendi.");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("ürün eklendi");
	}

}
