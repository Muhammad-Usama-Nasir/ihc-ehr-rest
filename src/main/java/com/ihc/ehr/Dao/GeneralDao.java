package com.ihc.ehr.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ihc.ehr.model.ORMGeneral;
@Repository
public interface GeneralDao extends JpaRepository<ORMGeneral, Long> {

}
