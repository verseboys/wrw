package com.wrw.test.pojo;

import java.sql.Timestamp;

/**
 * Phacreply entity. @author MyEclipse Persistence Tools
 */

public class Phacreply implements java.io.Serializable {

	// Fields

	private Integer phacrId;
	private Complaintmanag complaintmanag;
	private Users users;
	private Timestamp phacrTime;
	private String phacrContent;
	private String phacrNumber;

	// Constructors

	/** default constructor */
	public Phacreply() {
	}

	/** full constructor */
	public Phacreply(Complaintmanag complaintmanag, Users users, Timestamp phacrTime, String phacrContent,
			String phacrNumber) {
		this.complaintmanag = complaintmanag;
		this.users = users;
		this.phacrTime = phacrTime;
		this.phacrContent = phacrContent;
		this.phacrNumber = phacrNumber;
	}

	// Property accessors

	public Integer getPhacrId() {
		return this.phacrId;
	}

	public void setPhacrId(Integer phacrId) {
		this.phacrId = phacrId;
	}

	public Complaintmanag getComplaintmanag() {
		return this.complaintmanag;
	}

	public void setComplaintmanag(Complaintmanag complaintmanag) {
		this.complaintmanag = complaintmanag;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Timestamp getPhacrTime() {
		return this.phacrTime;
	}

	public void setPhacrTime(Timestamp phacrTime) {
		this.phacrTime = phacrTime;
	}

	public String getPhacrContent() {
		return this.phacrContent;
	}

	public void setPhacrContent(String phacrContent) {
		this.phacrContent = phacrContent;
	}

	public String getPhacrNumber() {
		return this.phacrNumber;
	}

	public void setPhacrNumber(String phacrNumber) {
		this.phacrNumber = phacrNumber;
	}

}