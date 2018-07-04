package com.struggle.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	private String cveId;
	@Column(name="assigner")
	private String assigner;
	private Set<CveVendor> cveVendor;
    private Set<ProblemType> problemType;
    private Set<Description> description;
    private Set<References> references;
    @Column(name="published_date")
    private String publishedDate;
    @Column(name="modified_date")
    private String lastModifiedDate;
	
	
	public String getCveId() {
		return cveId;
	}
	public void setCveId(String cveId) {
		this.cveId = cveId;
	}
	
	public String getAssigner() {
		return assigner;
	}
	public void setAssigner(String assigner) {
		this.assigner = assigner;
	}
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,targetEntity=CveVendor.class,mappedBy="cveData")
	@JoinTable(name = "cve_data_vendor", joinColumns = { @JoinColumn(name = "cve_id") }, inverseJoinColumns = { @JoinColumn(name = "vendor_id") })
	public Set<CveVendor> getCveVendor() {
		return cveVendor;
	}
	public void setVendor(Set<CveVendor> cveVendor) {
		this.cveVendor = cveVendor;
	}
	@OneToMany(fetch=FetchType.LAZY)
	@JoinTable(name="problem_type",joinColumns=@JoinColumn(name="problem_id"))
	public Set<ProblemType> getProblemType() {
		return problemType;
	}
	public void setProblemType(Set<ProblemType> problemType) {
		this.problemType = problemType;
	}
	@OneToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "cve_data_description", joinColumns = { @JoinColumn(name = "cve_id") }, inverseJoinColumns = { @JoinColumn(name = "description_id") })
	public Set<Description> getDescription() {
		return description;
	}
	public void setDescription(Set<Description> description) {
		this.description = description;
	}
	@OneToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "cve_data_reference", joinColumns = { @JoinColumn(name = "cve_id") }, inverseJoinColumns = { @JoinColumn(name = "reference_id") })
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