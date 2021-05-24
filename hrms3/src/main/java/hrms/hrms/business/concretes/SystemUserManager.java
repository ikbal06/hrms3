package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.SystemUserServcie;
import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.SystemUserDao;
import hrms.hrms.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserServcie {

	private SystemUserDao systemUserDao;
	
	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {
		super();
		this.systemUserDao = systemUserDao;
	}

	@Override
	public DataResult<List<SystemUser>> getAll() {
		return new SuccessDataResult<List<SystemUser>>
		(this.systemUserDao.findAll(),"Data listelendi.");
	}

}
