package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobSeekerService;
import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.core.utilities.result.SuccessDataResult;
import hrms.hrms.core.utilities.result.SuccessResult;
import hrms.hrms.dataAccess.abstracts.JobSeekerDao;
import hrms.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao; 
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(), "Data listelendi.");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Is arayan eklendi.");
	}

}
