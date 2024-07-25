package com.ihc.ehr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihc.ehr.Dao.GeneralDao;
import com.ihc.ehr.model.ORMGeneral;

@Service
public class GeneralServiceImpl implements GeneralService {

	@Autowired
	private GeneralDao generalDao;

	@Override
	public ORMGeneral newData(ORMGeneral general) {
		return generalDao.save(general);
	}

	@Override
	public List<ORMGeneral> readData() {
		return generalDao.findAll();
	}
}
