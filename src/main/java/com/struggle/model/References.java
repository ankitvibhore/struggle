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
@Table(name="references")
public class References implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3111703817442686352L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reference_id")
	private int referenceId;
	private String url;
	private String name;
	private String refSource;
	@ManyToOne
	@JoinColumn(name="cve_id")
	private CveData cveData;
	
	public int getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRefSource() {
		return refSource;
	}
	public void setRefSource(String refSource) {
		this.refSource = refSource;
	}
	
	public CveData getCveData() {
		return cveData;
	}
	public void setCveDate(CveData cveData) {
		this.cveData = cveData;
	}
	

}
