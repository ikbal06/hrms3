package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.entities.concretes.Position;

public interface PositionService {
      DataResult<List<Position>>getAll();
      Result add(Position position);
}
