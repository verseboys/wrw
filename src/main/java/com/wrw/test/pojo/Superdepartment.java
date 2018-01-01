package com.wrw.test.pojo;

/**
 * Superdepartment entity. @author MyEclipse Persistence Tools
 */

public class Superdepartment implements java.io.Serializable {

	// Fields

	private Integer superId;
	private Users users;
	private String superDepName;

	// Constructors

	/** default constructor */
	public Superdepartment() {
	}

	/** full constructor */
	public Superdepartment(Users users, String superDepName) {
		this.users = users;
		this.superDepName = superDepName;
	}

	// Property accessors

	public Integer getSuperId() {
		return this.superId;
	}

	public void setSuperId(Integer superId) {
		this.superId = superId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getSuperDepName() {
		return this.superDepName;
	}

	public void setSuperDepName(String superDepName) {
		this.superDepName = superDepName;
	}

}