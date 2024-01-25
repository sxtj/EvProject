package com.ethanscompany.evproject.model;

public enum Level {
	
	LEVEL_1("120V"),
	LEVEL_2("220V"),
	LEVEL_3("FAST DC");
	
	String description;
	
	Level(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
