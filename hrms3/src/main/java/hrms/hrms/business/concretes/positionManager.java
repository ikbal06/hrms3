package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.PositionService;
import hrms.hrms.core.utilities.result.DataResult;
import hrms.hrms.core.utilities.result.Result;
import hrms.hrms.core.utilities.result.SuccessDataResult;
import hrms.hrms.core.utilities.result.SuccessResult;
import hrms.hrms.dataAccess.abstracts.PositionDao;
import hrms.hrms.entities.concretes.Position;

@Service
public class positionManager implements PositionService {

	private PositionDao positionDao;
	
	@Autowired
	public positionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<Position>> getAll() {
		return new SuccessDataResult<List<Position>>
		(this.positionDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Position position) {
		this.positionDao.save(position);
		return new SuccessResult("Pozisyon eklendi");
	}

}
