package com.sap.sdc.hcp.bootcamp.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Analytic
 *
 */
@Entity
@Table(name="\"i044067trial.bootcamphana.Model/CV_LOCATION_COUNT\"")

@IdClass(AnalyticPK.class)
public class Analytic implements Serializable {

	   
	@Id
	@Column(name = "\"JOBID\"", nullable = false, length = 10) 
	private String JOBID;    
	@Id
	@Column(name = "\"LOCATION\"", length = 50)
	private String LOCATION;
	@Column(name = "\"Count\"")
	private int Count;
	
	private static final long serialVersionUID = 1L;

	public Analytic() {
		super();
	}   
	public String getJOBID() {
		return this.JOBID;
	}

	public void setJOBID(String JOBID) {
		this.JOBID = JOBID;
	}   
	public String getLOCATION() {
		return this.LOCATION;
	}

	public void setLOCATION(String LOCATION) {
		this.LOCATION = LOCATION;
	}   
	public int getCount() {
		return this.Count;
	}

	public void setCount(int Count) {
		this.Count = Count;
	}
   
}
