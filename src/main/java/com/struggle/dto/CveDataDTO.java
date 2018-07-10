package com.struggle.dto;

import java.util.Map;
import java.util.Set;

public class CveDataDTO
{
	private String cveId;
	private String assigner;
	private Set<String> vendor;
	private Map<String,String> productVersion;
	private Set<String> problem;
	private Set<ReferencesDTO> references;
	private Set<String> description;
	private String publishedDate;
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
	public Set<String> getVendor() {
		return vendor;
	}
	public void setVendor(Set<String> vendor) {
		this.vendor = vendor;
	}
	public Map<String, String> getProductVersion() {
		return productVersion;
	}
	public void setProductVersion(Map<String, String> productVersion) {
		this.productVersion = productVersion;
	}
	public Set<String> getProblem() {
		return problem;
	}
	public void setProblem(Set<String> problem) {
		this.problem = problem;
	}
	public Set<ReferencesDTO> getReferences() {
		return references;
	}
	public void setReferences(Set<ReferencesDTO> references) {
		this.references = references;
	}
	public Set<String> getDescription() {
		return description;
	}
	public void setDescription(Set<String> description) {
		this.description = description;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CveDataDTO [cveId=");
		builder.append(cveId);
		builder.append(", assigner=");
		builder.append(assigner);
		builder.append(", vendor=");
		builder.append(vendor);
		builder.append(", productVersion=");
		builder.append(productVersion);
		builder.append(", problem=");
		builder.append(problem);
		builder.append(", references=");
		builder.append(references);
		builder.append(", description=");
		builder.append(description);
		builder.append(", publishedDate=");
		builder.append(publishedDate);
		builder.append(", lastModifiedDate=");
		builder.append(lastModifiedDate);
		builder.append(", getCveId()=");
		builder.append(getCveId());
		builder.append(", getAssigner()=");
		builder.append(getAssigner());
		builder.append(", getVendor()=");
		builder.append(getVendor());
		builder.append(", getProductVersion()=");
		builder.append(getProductVersion());
		builder.append(", getProblem()=");
		builder.append(getProblem());
		builder.append(", getReferences()=");
		builder.append(getReferences());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getPublishedDate()=");
		builder.append(getPublishedDate());
		builder.append(", getLastModifiedDate()=");
		builder.append(getLastModifiedDate());
		builder.append("]");
		return builder.toString();
	}
	
	

}
