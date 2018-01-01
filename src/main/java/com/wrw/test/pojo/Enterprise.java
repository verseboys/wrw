package com.wrw.test.pojo;

/**
 * Enterprise entity. @author MyEclipse Persistence Tools
 */

public class Enterprise implements java.io.Serializable {

	// Fields

	private Integer enterid;
	private Users users;
	private String enterName;
	private Integer faithPoints;

	// Constructors

	/** default constructor */
	public Enterprise() {
	}

	/** full constructor */
	public Enterprise(Users users, String enterName, Integer faithPoints) {
		this.users = users;
		this.enterName = enterName;
		this.faithPoints = faithPoints;
	}

	// Property accessors

	public Integer getEnterid() {
		return this.enterid;
	}

	public void setEnterid(Integer enterid) {
		this.enterid = enterid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getEnterName() {
		return this.enterName;
	}

	public void setEnterName(String enterName) {
		this.enterName = enterName;
	}

	public Integer getFaithPoints() {
		return this.faithPoints;
	}

	public void setFaithPoints(Integer faithPoints) {
		this.faithPoints = faithPoints;
	}

}