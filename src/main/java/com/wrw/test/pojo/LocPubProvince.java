package com.wrw.test.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * LocPubProvince entity. @author MyEclipse Persistence Tools
 */

public class LocPubProvince implements java.io.Serializable {

	// Fields

	private String provCode;
	private String provName;
	private Set locPubCities = new HashSet(0);

	// Constructors

	/** default constructor */
	public LocPubProvince() {
	}

	/** minimal constructor */
	public LocPubProvince(String provName) {
		this.provName = provName;
	}

	/** full constructor */
	public LocPubProvince(String provName, Set locPubCities) {
		this.provName = provName;
		this.locPubCities = locPubCities;
	}

	// Property accessors

	public String getProvCode() {
		return this.provCode;
	}

	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}

	public String getProvName() {
		return this.provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
	}

	public Set getLocPubCities() {
		return this.locPubCities;
	}

	public void setLocPubCities(Set locPubCities) {
		this.locPubCities = locPubCities;
	}

}