package com.wrw.test.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Complaintmanag entity. @author MyEclipse Persistence Tools
 */

public class Complaintmanag implements java.io.Serializable {

	// Fields

	private Integer compmanId;
	private Users usersByCompmanUserId;
	private Users usersByCompmanBeuserId;
	private String compmanNo;
	private String compmanClassify;
	private Timestamp compmanTime;
	private String compmanContent;
	private Set phacreplies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Complaintmanag() {
	}

	/** minimal constructor */
	public Complaintmanag(Users usersByCompmanBeuserId, String compmanNo, String compmanClassify, Timestamp compmanTime,
			String compmanContent) {
		this.usersByCompmanBeuserId = usersByCompmanBeuserId;
		this.compmanNo = compmanNo;
		this.compmanClassify = compmanClassify;
		this.compmanTime = compmanTime;
		this.compmanContent = compmanContent;
	}

	/** full constructor */
	public Complaintmanag(Users usersByCompmanUserId, Users usersByCompmanBeuserId, String compmanNo,
			String compmanClassify, Timestamp compmanTime, String compmanContent, Set phacreplies) {
		this.usersByCompmanUserId = usersByCompmanUserId;
		this.usersByCompmanBeuserId = usersByCompmanBeuserId;
		this.compmanNo = compmanNo;
		this.compmanClassify = compmanClassify;
		this.compmanTime = compmanTime;
		this.compmanContent = compmanContent;
		this.phacreplies = phacreplies;
	}

	// Property accessors

	public Integer getCompmanId() {
		return this.compmanId;
	}

	public void setCompmanId(Integer compmanId) {
		this.compmanId = compmanId;
	}

	public Users getUsersByCompmanUserId() {
		return this.usersByCompmanUserId;
	}

	public void setUsersByCompmanUserId(Users usersByCompmanUserId) {
		this.usersByCompmanUserId = usersByCompmanUserId;
	}

	public Users getUsersByCompmanBeuserId() {
		return this.usersByCompmanBeuserId;
	}

	public void setUsersByCompmanBeuserId(Users usersByCompmanBeuserId) {
		this.usersByCompmanBeuserId = usersByCompmanBeuserId;
	}

	public String getCompmanNo() {
		return this.compmanNo;
	}

	public void setCompmanNo(String compmanNo) {
		this.compmanNo = compmanNo;
	}

	public String getCompmanClassify() {
		return this.compmanClassify;
	}

	public void setCompmanClassify(String compmanClassify) {
		this.compmanClassify = compmanClassify;
	}

	public Timestamp getCompmanTime() {
		return this.compmanTime;
	}

	public void setCompmanTime(Timestamp compmanTime) {
		this.compmanTime = compmanTime;
	}

	public String getCompmanContent() {
		return this.compmanContent;
	}

	public void setCompmanContent(String compmanContent) {
		this.compmanContent = compmanContent;
	}

	public Set getPhacreplies() {
		return this.phacreplies;
	}

	public void setPhacreplies(Set phacreplies) {
		this.phacreplies = phacreplies;
	}

}