package com.test.springboot.first.myAPI.topic;

public class Topic {
	String name;
	String id;
	String description;
	
	public Topic(String name, String id, String description) {
		this.name=name;
		this.id=id;
		this.description=description;
	}
	
	public Topic() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
