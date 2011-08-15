package com.phdroid.dao;

import java.util.Date;

/**
 * Event is assigned to specific time and could have participants.
 */
public class Event implements DaoObject {
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
