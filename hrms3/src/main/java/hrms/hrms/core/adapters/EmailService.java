package hrms.hrms.core.adapters;

import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.entities.concretes.User;

public interface EmailService {
        Result send(User user);
}
