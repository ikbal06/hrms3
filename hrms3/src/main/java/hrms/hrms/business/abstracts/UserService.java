package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
}
