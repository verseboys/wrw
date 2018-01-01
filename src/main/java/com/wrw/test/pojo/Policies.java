package com.wrw.test.pojo;

import java.sql.Timestamp;

/**
 * Policies entity. @author MyEclipse Persistence Tools
 */

public class Policies implements java.io.Serializable {

	// Fields

	private Integer poId;
	private Integer poTid;
	private String poTitle;
	private String poAuthor;
	private Timestamp poCreatedate;
	private String poPicpath;
	private String poContent;
	private Timestamp poModifydate;
	private String poSummary;

	// Constructors

	/** default constructor */
	public Policies() {
	}

	/** minimal constructor */
	public Policies(Integer poTid, String poTitle, String poAuthor, String poContent, String poSummary) {
		this.poTid = poTid;
		this.poTitle = poTitle;
		this.poAuthor = poAuthor;
		this.poContent = poContent;
		this.poSummary = poSummary;
	}

	/** full constructor */
	public Policies(Integer poTid, String poTitle, String poAuthor, Timestamp poCreatedate, String poPicpath,
			String poContent, Timestamp poModifydate, String poSummary) {
		this.poTid = poTid;
		this.poTitle = poTitle;
		this.poAuthor = poAuthor;
		this.poCreatedate = poCreatedate;
		this.poPicpath = poPicpath;
		this.poContent = poContent;
		this.poModifydate = poModifydate;
		this.poSummary = poSummary;
	}

	// Property accessors

	public Integer getPoId() {
		return this.poId;
	}

	public void setPoId(Integer poId) {
		this.poId = poId;
	}

	public Integer getPoTid() {
		return this.poTid;
	}

	public void setPoTid(Integer poTid) {
		this.poTid = poTid;
	}

	public String getPoTitle() {
		return this.poTitle;
	}

	public void setPoTitle(String poTitle) {
		this.poTitle = poTitle;
	}

	public String getPoAuthor() {
		return this.poAuthor;
	}

	public void setPoAuthor(String poAuthor) {
		this.poAuthor = poAuthor;
	}

	public Timestamp getPoCreatedate() {
		return this.poCreatedate;
	}

	public void setPoCreatedate(Timestamp poCreatedate) {
		this.poCreatedate = poCreatedate;
	}

	public String getPoPicpath() {
		return this.poPicpath;
	}

	public void setPoPicpath(String poPicpath) {
		this.poPicpath = poPicpath;
	}

	public String getPoContent() {
		return this.poContent;
	}

	public void setPoContent(String poContent) {
		this.poContent = poContent;
	}

	public Timestamp getPoModifydate() {
		return this.poModifydate;
	}

	public void setPoModifydate(Timestamp poModifydate) {
		this.poModifydate = poModifydate;
	}

	public String getPoSummary() {
		return this.poSummary;
	}

	public void setPoSummary(String poSummary) {
		this.poSummary = poSummary;
	}

}