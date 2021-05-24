package hrms.hrms.core.adapters;

import org.springframework.stereotype.Service;

import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.core.utilities.result.SuccessResult;
import hrms.hrms.entities.concretes.User;

@Service
public class EmailManager implements EmailService{

	@Override
	public Result send(User user) {
		return new SuccessResult("Eposta gönderildi");
	}

}
