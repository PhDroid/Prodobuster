package com.phdroid.dao;

import java.util.Date;

/**
 * Task class. Tasks can be assigned to specific day and their order is not important.
 */
public class Task implements DaoObject {
	private String summary;
	private String description;
	private Date when;

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
