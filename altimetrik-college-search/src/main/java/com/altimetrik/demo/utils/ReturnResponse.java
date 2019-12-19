package com.altimetrik.demo.utils;

import java.io.Serializable;
import java.util.List;

import com.altimetrik.demo.dao.College;
import com.altimetrik.demo.dao.Paginator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnResponse implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("results")
	private List<College> results;

	@JsonProperty("paginator")
	private Paginator metadata;
	
	public ReturnResponse(Paginator metadata, List<College> list) {
		this.metadata = metadata;
		this.results = list;
	}

	public List<College> getResults() {
		return results;
	}

	public void setResults(List<College> results) {
		this.results = results;
	}

	public Paginator getMetadata() {
		return metadata;
	}

	public void setMetadata(Paginator metadata) {
		this.metadata = metadata;
	}
	
	
	
	
	
	
}