package com.nm.springbootstarter.topic;

import java.io.Serializable;

public class Topic_Del implements Serializable
{
	private static final long serialVersionUID = -7035914606606384693L;

	private String id;
	private String name;
	private String description;

	public Topic_Del() {
	}

	public Topic_Del(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}
