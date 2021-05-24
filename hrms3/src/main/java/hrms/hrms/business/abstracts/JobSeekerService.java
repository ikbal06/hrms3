package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);

}
