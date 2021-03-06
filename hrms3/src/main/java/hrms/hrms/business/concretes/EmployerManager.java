package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.EmployerService;
import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.core.utilities.result.SuccessDataResult;
import hrms.hrms.core.utilities.result.SuccessResult;
import hrms.hrms.dataAccess.abstracts.EmployerDao;
import hrms.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İş veren eklendi");
	}

}
