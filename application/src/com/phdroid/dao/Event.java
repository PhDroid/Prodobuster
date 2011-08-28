package com.phdroid.dao;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;
import java.util.List;

/**
 * Event is assigned to specific time and could have participants.
 */
@DatabaseTable(tableName = "events")
public class Event implements DaoObject {
	@DatabaseField(id = true)
	private int id;
	@DatabaseField
	private String summary;
	@DatabaseField
	private String description;
	@DatabaseField
	private Date when;
	@DatabaseField
	private List<String> participants;

	public int getId() {
		return id;
	}

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
