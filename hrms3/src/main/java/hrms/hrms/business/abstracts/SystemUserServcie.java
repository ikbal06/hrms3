package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.entities.concretes.SystemUser;

public interface SystemUserServcie {
      DataResult<List<SystemUser>>getAll();
}
