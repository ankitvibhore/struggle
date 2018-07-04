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
@Table(name="vendor_product")
public class VendorProduct implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String versionId;
	private String versionName;
	private CveVendor cveVendor;
	@Column(name="version_id")
	public String getVersionId() {
		return versionId;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	@Column(name="version_name")
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	@ManyToOne
	@JoinColumn(name="vendor_id")
	public CveVendor getCveVendor() {
		return cveVendor;
	}
	public void setCveVendor(CveVendor cveVendor) {
		this.cveVendor = cveVendor;
	}
	

}
