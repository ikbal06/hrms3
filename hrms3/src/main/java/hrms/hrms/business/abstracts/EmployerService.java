package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>>getAll();
    Result add(Employer employer);
}
