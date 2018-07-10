package com.struggle.dto;

public class ReferencesDTO 
{
	private String url;
	private String name;
	private String refSource;
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
	@Override
	public String toString() {
		return getUrl()+"," +getName()+ "," +getRefSource();
	}
	
	
	

}
