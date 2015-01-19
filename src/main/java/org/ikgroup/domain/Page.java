package org.ikgroup.domain;

import java.io.Serializable;


public class Page implements Serializable{
	
	private static final long serialVersionUID = -5031076456630792660L;

	private Boolean enabled = false;
	
	private String location;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
