package com.wrw.test.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * LocPubCity entity. @author MyEclipse Persistence Tools
 */

public class LocPubCity implements java.io.Serializable {

	// Fields

	private String cityCode;
	private LocPubProvince locPubProvince;
	private String cityName;
	private Set locPubBoroughs = new HashSet(0);

	// Constructors

	/** default constructor */
	public LocPubCity() {
	}

	/** minimal constructor */
	public LocPubCity(LocPubProvince locPubProvince, String cityName) {
		this.locPubProvince = locPubProvince;
		this.cityName = cityName;
	}

	/** full constructor */
	public LocPubCity(LocPubProvince locPubProvince, String cityName, Set locPubBoroughs) {
		this.locPubProvince = locPubProvince;
		this.cityName = cityName;
		this.locPubBoroughs = locPubBoroughs;
	}

	// Property accessors

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public LocPubProvince getLocPubProvince() {
		return this.locPubProvince;
	}

	public void setLocPubProvince(LocPubProvince locPubProvince) {
		this.locPubProvince = locPubProvince;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Set getLocPubBoroughs() {
		return this.locPubBoroughs;
	}

	public void setLocPubBoroughs(Set locPubBoroughs) {
		this.locPubBoroughs = locPubBoroughs;
	}

}