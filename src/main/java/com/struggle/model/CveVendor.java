package com.struggle.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="cve_vendor")
public class CveVendor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 837643824650303401L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String vendorId;
	private String vendorName;
	private CveData cveData;
	private Set<VendorProduct> products;
	
	@Column(name="vendor_id")
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
	@OneToMany(fetch=FetchType.LAZY)
	@JoinTable(name="vendor_product_versions",joinColumns=@JoinColumn(name="version_id"),inverseJoinColumns=@JoinColumn(name="version_id"))
	public Set<VendorProduct> getProducts() {
		return products;
	}
	public void setProducts(Set<VendorProduct> products) {
		this.products = products;
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
