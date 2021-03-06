package com.struggle.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="cve_data")
@PrimaryKeyJoinColumn(name="cve_id")
public class CveData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2189408149153247877L;
	@Id
	@Column(name="cve_id")
	private String ID;
	@Column(name="assigner")
	private String ASSIGNER;
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="cveData")
//	@JoinTable(name = "cve_data_vendor", joinColumns = { @JoinColumn(name = "cve_id") }, inverseJoinColumns = { @JoinColumn(name = "vendor_id") })
//	@JoinTable(name="cve_vendor",joinColumns=@JoinColumn(name="cve_id"),inverseJoinColumns=@JoinColumn(name="vendor_id"))
	private Set<CveVendor> cveVendor;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="cveData")
//	@JoinTable(name="problem_type",joinColumns=@JoinColumn(name="problem_id"))
//	@JoinTable(name = "problem_type", joinColumns = { @JoinColumn(name = "cve_id") }, inverseJoinColumns = { @JoinColumn(name = "problem_id") })
    private Set<ProblemType> problemType;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="cveData")
//	@JoinTable(name = "description", joinColumns = { @JoinColumn(name = "cve_id") }, inverseJoinColumns = { @JoinColumn(name = "description_id") })
    private Set<Description> description;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="cveData")
//	@JoinTable(name = "references", joinColumns = { @JoinColumn(name = "cve_id") }, inverseJoinColumns = { @JoinColumn(name = "reference_id") })
    private Set<References> references;
    @Column(name="published_date")
    private String publishedDate;
    @Column(name="modified_date")
    private String lastModifiedDate;
	
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getAssigner() {
		return ASSIGNER;
	}
	public void setAssigner(String ASSIGNER) {
		this.ASSIGNER = ASSIGNER;
	}
	
	public Set<CveVendor> getCveVendor() {
		return cveVendor;
	}
	public void setVendor(Set<CveVendor> cveVendor) {
		this.cveVendor = cveVendor;
	}
	
	public Set<ProblemType> getProblemType() {
		return problemType;
	}
	public void setProblemType(Set<ProblemType> problemType) {
		this.problemType = problemType;
	}
	
	public Set<Description> getDescription() {
		return description;
	}
	public void setDescription(Set<Description> description) {
		this.description = description;
	}
	
	public Set<References> getReferences() {
		return references;
	}
	public void setReferences(Set<References> references) {
		this.references = references;
	}
	
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
    
}
