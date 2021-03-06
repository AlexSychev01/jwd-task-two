package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public Appliance find(Criteria criteria) throws CriteriaException, Exception {
        if (!Validator.criteriaValidator(criteria)) {
            throw new CriteriaException("Incorrect data");
        }
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();

            // you may add your own code here
            return applianceDAO.find(criteria);

        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}

//you may add your own new classes
