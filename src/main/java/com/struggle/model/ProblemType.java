package com.struggle.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="problem_type")
public class ProblemType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2868990783558136805L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int problemId;
	private String problemDescription;
	private String problemValue;
	private CveData cveData;
	@Column(name="problem_id")
	public int getProblemId() {
		return problemId;
	}
	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}
	@Column(name="problem_description")
	public String getProblemDescription() {
		return problemDescription;
	}
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}
	@Column(name="problem_value")
	public String getProblemValue() {
		return problemValue;
	}
	public void setProblemValue(String problemValue) {
		this.problemValue = problemValue;
	}
	@ManyToOne
	@JoinColumn(name="cve_id")
	public CveData getCveData() {
		return cveData;
	}
	public void setCveData(CveData cveData) {
		this.cveData = cveData;
	}
	

}
