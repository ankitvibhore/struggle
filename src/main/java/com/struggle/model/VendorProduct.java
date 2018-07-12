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
	@Column(name="version_id")
	private String versionId;
	@Column(name="product_name")
	private String product_name;
	@ManyToOne
	@JoinColumn(name="vendor_id")
	private CveVendor cveVendor;
	
	public String getVersionId() {
		return versionId;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	
	public String getProduct_Name() {
		return product_name;
	}
	public void setProduct_Name(String product_name) {
		this.product_name = product_name;
	}
	
	public CveVendor getCveVendor() {
		return cveVendor;
	}
	public void setCveVendor(CveVendor cveVendor) {
		this.cveVendor = cveVendor;
	}
	

}
