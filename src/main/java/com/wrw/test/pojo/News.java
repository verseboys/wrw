package com.wrw.test.pojo;

import java.sql.Timestamp;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer nid;
	private Integer ntid;
	private String ntitle;
	private String nauthor;
	private Timestamp ncreatedate;
	private String npicpath;
	private String ncontent;
	private Timestamp nmodifydate;
	private String nsummary;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(Integer ntid, String ntitle, String nauthor, String ncontent, String nsummary) {
		this.ntid = ntid;
		this.ntitle = ntitle;
		this.nauthor = nauthor;
		this.ncontent = ncontent;
		this.nsummary = nsummary;
	}

	/** full constructor */
	public News(Integer ntid, String ntitle, String nauthor, Timestamp ncreatedate, String npicpath, String ncontent,
			Timestamp nmodifydate, String nsummary) {
		this.ntid = ntid;
		this.ntitle = ntitle;
		this.nauthor = nauthor;
		this.ncreatedate = ncreatedate;
		this.npicpath = npicpath;
		this.ncontent = ncontent;
		this.nmodifydate = nmodifydate;
		this.nsummary = nsummary;
	}

	// Property accessors

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public Integer getNtid() {
		return this.ntid;
	}

	public void setNtid(Integer ntid) {
		this.ntid = ntid;
	}

	public String getNtitle() {
		return this.ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNauthor() {
		return this.nauthor;
	}

	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}

	public Timestamp getNcreatedate() {
		return this.ncreatedate;
	}

	public void setNcreatedate(Timestamp ncreatedate) {
		this.ncreatedate = ncreatedate;
	}

	public String getNpicpath() {
		return this.npicpath;
	}

	public void setNpicpath(String npicpath) {
		this.npicpath = npicpath;
	}

	public String getNcontent() {
		return this.ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public Timestamp getNmodifydate() {
		return this.nmodifydate;
	}

	public void setNmodifydate(Timestamp nmodifydate) {
		this.nmodifydate = nmodifydate;
	}

	public String getNsummary() {
		return this.nsummary;
	}

	public void setNsummary(String nsummary) {
		this.nsummary = nsummary;
	}

}