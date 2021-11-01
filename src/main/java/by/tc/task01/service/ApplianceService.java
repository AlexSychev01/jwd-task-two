package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.impl.CriteriaException;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria) throws CriteriaException, Exception;
	
}
