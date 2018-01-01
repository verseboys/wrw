package com.wrw.test.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer ecode;
	private Role role;
	private String cardid;
	private String uname;
	private String upassword;
	private Set evaluateusersForEvaluUserId = new HashSet(0);
	private Set evaluateusersForEvaluUserBeId = new HashSet(0);
	private Set pharmacists = new HashSet(0);
	private Set superdepartments = new HashSet(0);
	private Set complaintmanagsForCompmanUserId = new HashSet(0);
	private Set phacreplies = new HashSet(0);
	private Set complaintmanagsForCompmanBeuserId = new HashSet(0);
	private Set customers = new HashSet(0);
	private Set enterprises = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Role role, String cardid, String uname, String upassword) {
		this.role = role;
		this.cardid = cardid;
		this.uname = uname;
		this.upassword = upassword;
	}

	/** full constructor */
	public Users(Role role, String cardid, String uname, String upassword, Set evaluateusersForEvaluUserId,
			Set evaluateusersForEvaluUserBeId, Set pharmacists, Set superdepartments,
			Set complaintmanagsForCompmanUserId, Set phacreplies, Set complaintmanagsForCompmanBeuserId, Set customers,
			Set enterprises) {
		this.role = role;
		this.cardid = cardid;
		this.uname = uname;
		this.upassword = upassword;
		this.evaluateusersForEvaluUserId = evaluateusersForEvaluUserId;
		this.evaluateusersForEvaluUserBeId = evaluateusersForEvaluUserBeId;
		this.pharmacists = pharmacists;
		this.superdepartments = superdepartments;
		this.complaintmanagsForCompmanUserId = complaintmanagsForCompmanUserId;
		this.phacreplies = phacreplies;
		this.complaintmanagsForCompmanBeuserId = complaintmanagsForCompmanBeuserId;
		this.customers = customers;
		this.enterprises = enterprises;
	}

	// Property accessors

	public Integer getEcode() {
		return this.ecode;
	}

	public void setEcode(Integer ecode) {
		this.ecode = ecode;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getCardid() {
		return this.cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return this.upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public Set getEvaluateusersForEvaluUserId() {
		return this.evaluateusersForEvaluUserId;
	}

	public void setEvaluateusersForEvaluUserId(Set evaluateusersForEvaluUserId) {
		this.evaluateusersForEvaluUserId = evaluateusersForEvaluUserId;
	}

	public Set getEvaluateusersForEvaluUserBeId() {
		return this.evaluateusersForEvaluUserBeId;
	}

	public void setEvaluateusersForEvaluUserBeId(Set evaluateusersForEvaluUserBeId) {
		this.evaluateusersForEvaluUserBeId = evaluateusersForEvaluUserBeId;
	}

	public Set getPharmacists() {
		return this.pharmacists;
	}

	public void setPharmacists(Set pharmacists) {
		this.pharmacists = pharmacists;
	}

	public Set getSuperdepartments() {
		return this.superdepartments;
	}

	public void setSuperdepartments(Set superdepartments) {
		this.superdepartments = superdepartments;
	}

	public Set getComplaintmanagsForCompmanUserId() {
		return this.complaintmanagsForCompmanUserId;
	}

	public void setComplaintmanagsForCompmanUserId(Set complaintmanagsForCompmanUserId) {
		this.complaintmanagsForCompmanUserId = complaintmanagsForCompmanUserId;
	}

	public Set getPhacreplies() {
		return this.phacreplies;
	}

	public void setPhacreplies(Set phacreplies) {
		this.phacreplies = phacreplies;
	}

	public Set getComplaintmanagsForCompmanBeuserId() {
		return this.complaintmanagsForCompmanBeuserId;
	}

	public void setComplaintmanagsForCompmanBeuserId(Set complaintmanagsForCompmanBeuserId) {
		this.complaintmanagsForCompmanBeuserId = complaintmanagsForCompmanBeuserId;
	}

	public Set getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}

	public Set getEnterprises() {
		return this.enterprises;
	}

	public void setEnterprises(Set enterprises) {
		this.enterprises = enterprises;
	}

}