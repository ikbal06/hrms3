package hrms.hrms.core.adapters;

import java.sql.Date;

public interface IdentityValidationService {
       Boolean checkIfRealPerson(String identityNumber,String name,String surname,Date birthYear);
}
