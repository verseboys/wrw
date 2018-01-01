package com.wrw.test.pojo;

import java.util.Date;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private Users users;
	private Date custBrith;
	private String custPhone;
	private String sex;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Users users, Date custBrith, String sex) {
		this.users = users;
		this.custBrith = custBrith;
		this.sex = sex;
	}

	/** full constructor */
	public Customer(Users users, Date custBrith, String custPhone, String sex) {
		this.users = users;
		this.custBrith = custBrith;
		this.custPhone = custPhone;
		this.sex = sex;
	}

	// Property accessors

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getCustBrith() {
		return this.custBrith;
	}

	public void setCustBrith(Date custBrith) {
		this.custBrith = custBrith;
	}

	public String getCustPhone() {
		return this.custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}