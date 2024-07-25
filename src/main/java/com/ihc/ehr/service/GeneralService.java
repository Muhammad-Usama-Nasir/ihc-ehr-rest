package com.ihc.ehr.service;

import java.util.List;

import com.ihc.ehr.model.ORMGeneral;

public interface GeneralService {

	ORMGeneral newData(ORMGeneral general);

	List<ORMGeneral> readData();

}
