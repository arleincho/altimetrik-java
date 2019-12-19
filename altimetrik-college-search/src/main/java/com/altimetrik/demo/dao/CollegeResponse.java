package com.altimetrik.demo.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class CollegeResponse implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    Map<String, Object> details = new HashMap<>();
    
    @JsonAnySetter
    void setDetail(String key, Object value) {
    	String[] parts = key.split("\\.");
    	String keyMap = key;
    	if (parts.length > 0) {
    		keyMap = parts[parts.length - 1];
    	}
    	if (keyMap.equals("size") && value == null) {
    		value = 0;
    	}
        details.put(keyMap, value);
    }
    
    public Map<String, Object> getDetail(){
    	return this.details;
    }
    
	@Override
	public String toString() {
		return "details: " + this.details;
	}

}
