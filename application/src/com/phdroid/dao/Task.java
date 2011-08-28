package com.phdroid.dao;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Task class. Tasks can be assigned to specific day and their order is not important.
 */
@DatabaseTable(tableName = "tasks")
public class Task implements DaoObject {
	@DatabaseField(id=true)
	private int id;
	@DatabaseField
	private String summary;
	@DatabaseField
	private String description;
	@DatabaseField
	private Date when;
	@DatabaseField
	private int priority;

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
