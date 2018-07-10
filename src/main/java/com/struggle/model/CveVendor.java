package com.struggle.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="cve_vendor")
//@PrimaryKeyJoinColumn(name="vendor_id")
public class CveVendor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 837643824650303401L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vendor_id")
	private String vendorId;
	private String vendorName;
	@ManyToOne
	@JoinColumn(name="cve_id")
	private CveData cveData;
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="cveVendor")
//	@JoinTable(name="vendor_product_versions",joinColumns=@JoinColumn(name="vendor_id"),inverseJoinColumns=@JoinColumn(name="version_id"))
//	@JoinTable(name = "vendor_product", joinColumns = { @JoinColumn(name = "vendor_id") }, inverseJoinColumns = { @JoinColumn(name = "version_id") })
	private Set<VendorProduct> vendorProducts;
	
	
	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
    @Column(name="vendor_name")
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	public Set<VendorProduct> getVendorProducts() {
		return vendorProducts;
	}
	public void setVendorProducts(Set<VendorProduct> vendorProducts) {
		this.vendorProducts = vendorProducts;
	}
	 
	public CveData getCveData() {
		return cveData;
	}
	public void setCveData(CveData cveData) {
		this.cveData = cveData;
	}	

}
