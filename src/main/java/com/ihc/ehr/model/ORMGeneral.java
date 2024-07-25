package com.ihc.ehr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "daily_station_report")
public class ORMGeneral {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long daily_report_id;
	
	private String store_name;
	
	public Long getDaily_report_id() {
		return daily_report_id;
	}
	public void setDaily_report_id(Long daily_report_id) {
		this.daily_report_id = daily_report_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	
}
