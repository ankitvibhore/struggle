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
@Table(name="description")
public class Description implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5679790778689509335L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="description_id")
	private int descriptionId;
	private String value;
	@ManyToOne
	@JoinColumn(name="cve_id")
	private CveData cveData;
	
	public int getDescriptionId() {
		return descriptionId;
	}
	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}
	@Column(name="value")
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public CveData getCveData() {
		return cveData;
	}
	public void setCveData(CveData cveData) {
		this.cveData = cveData;
	}
	

}
