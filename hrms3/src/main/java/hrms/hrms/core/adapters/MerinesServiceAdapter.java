package hrms.hrms.core.adapters;

import java.sql.Date;

import org.springframework.stereotype.Service;

@Service
public class MerinesServiceAdapter implements IdentityValidationService {

	@Override
	public Boolean checkIfRealPerson(String identityNumber, String name, String surname, Date birthYear) {
		return true;
	}

}
