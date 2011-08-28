package com.phdroid.dao;

import java.util.Date;

/**
 * Please, write short description of what this file is for.
 */
public interface DaoObject {
	public int getId();
	public String getSummary();
	public void setSummary(String value);
	public String getDescription();
	public void setDescription(String value);
	public Date getWhen();
	public void setWhen(Date value);
}
