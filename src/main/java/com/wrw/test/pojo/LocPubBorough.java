package com.wrw.test.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * LocPubBorough entity. @author MyEclipse Persistence Tools
 */

public class LocPubBorough implements java.io.Serializable {

	// Fields

	private String boroCode;
	private LocPubCity locPubCity;
	private String boroName;
	private Set pharmacists = new HashSet(0);

	// Constructors

	/** default constructor */
	public LocPubBorough() {
	}

	/** minimal constructor */
	public LocPubBorough(LocPubCity locPubCity, String boroName) {
		this.locPubCity = locPubCity;
		this.boroName = boroName;
	}

	/** full constructor */
	public LocPubBorough(LocPubCity locPubCity, String boroName, Set pharmacists) {
		this.locPubCity = locPubCity;
		this.boroName = boroName;
		this.pharmacists = pharmacists;
	}

	// Property accessors

	public String getBoroCode() {
		return this.boroCode;
	}

	public void setBoroCode(String boroCode) {
		this.boroCode = boroCode;
	}

	public LocPubCity getLocPubCity() {
		return this.locPubCity;
	}

	public void setLocPubCity(LocPubCity locPubCity) {
		this.locPubCity = locPubCity;
	}

	public String getBoroName() {
		return this.boroName;
	}

	public void setBoroName(String boroName) {
		this.boroName = boroName;
	}

	public Set getPharmacists() {
		return this.pharmacists;
	}

	public void setPharmacists(Set pharmacists) {
		this.pharmacists = pharmacists;
	}

}