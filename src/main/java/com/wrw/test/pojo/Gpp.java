package com.wrw.test.pojo;

import java.sql.Timestamp;

/**
 * Gpp entity. @author MyEclipse Persistence Tools
 */

public class Gpp implements java.io.Serializable {

	// Fields

	private Integer gpId;
	private Integer gpTId;
	private String gpTitle;
	private String gpAuthor;
	private Timestamp gpCreatedate;
	private String gpPicpath;
	private String gpContent;
	private Timestamp gpModifydate;
	private String gpSummary;

	// Constructors

	/** default constructor */
	public Gpp() {
	}

	/** minimal constructor */
	public Gpp(Integer gpTId, String gpTitle, String gpAuthor, String gpContent, String gpSummary) {
		this.gpTId = gpTId;
		this.gpTitle = gpTitle;
		this.gpAuthor = gpAuthor;
		this.gpContent = gpContent;
		this.gpSummary = gpSummary;
	}

	/** full constructor */
	public Gpp(Integer gpTId, String gpTitle, String gpAuthor, Timestamp gpCreatedate, String gpPicpath,
			String gpContent, Timestamp gpModifydate, String gpSummary) {
		this.gpTId = gpTId;
		this.gpTitle = gpTitle;
		this.gpAuthor = gpAuthor;
		this.gpCreatedate = gpCreatedate;
		this.gpPicpath = gpPicpath;
		this.gpContent = gpContent;
		this.gpModifydate = gpModifydate;
		this.gpSummary = gpSummary;
	}

	// Property accessors

	public Integer getGpId() {
		return this.gpId;
	}

	public void setGpId(Integer gpId) {
		this.gpId = gpId;
	}

	public Integer getGpTId() {
		return this.gpTId;
	}

	public void setGpTId(Integer gpTId) {
		this.gpTId = gpTId;
	}

	public String getGpTitle() {
		return this.gpTitle;
	}

	public void setGpTitle(String gpTitle) {
		this.gpTitle = gpTitle;
	}

	public String getGpAuthor() {
		return this.gpAuthor;
	}

	public void setGpAuthor(String gpAuthor) {
		this.gpAuthor = gpAuthor;
	}

	public Timestamp getGpCreatedate() {
		return this.gpCreatedate;
	}

	public void setGpCreatedate(Timestamp gpCreatedate) {
		this.gpCreatedate = gpCreatedate;
	}

	public String getGpPicpath() {
		return this.gpPicpath;
	}

	public void setGpPicpath(String gpPicpath) {
		this.gpPicpath = gpPicpath;
	}

	public String getGpContent() {
		return this.gpContent;
	}

	public void setGpContent(String gpContent) {
		this.gpContent = gpContent;
	}

	public Timestamp getGpModifydate() {
		return this.gpModifydate;
	}

	public void setGpModifydate(Timestamp gpModifydate) {
		this.gpModifydate = gpModifydate;
	}

	public String getGpSummary() {
		return this.gpSummary;
	}

	public void setGpSummary(String gpSummary) {
		this.gpSummary = gpSummary;
	}

}