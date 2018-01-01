package com.wrw.test.pojo;

/**
 * Pharmacist entity. @author MyEclipse Persistence Tools
 */

public class Pharmacist implements java.io.Serializable {

	// Fields

	private Integer phaId;
	private LocPubBorough locPubBorough;
	private Users users;
	private String sex;
	private String photo;
	private String edu;
	private String major;
	private String email;
	private String phone;
	private String tel;
	private String workplace;
	private String department;
	private String position;
	private String achievement;
	private Integer cid;
	private Integer xyjf;
	private String birthplace;
	private String eduschool;
	private Integer faithPoints;

	// Constructors

	/** default constructor */
	public Pharmacist() {
	}

	/** minimal constructor */
	public Pharmacist(LocPubBorough locPubBorough, Users users, Integer faithPoints) {
		this.locPubBorough = locPubBorough;
		this.users = users;
		this.faithPoints = faithPoints;
	}

	/** full constructor */
	public Pharmacist(LocPubBorough locPubBorough, Users users, String sex, String photo, String edu, String major,
			String email, String phone, String tel, String workplace, String department, String position,
			String achievement, Integer cid, Integer xyjf, String birthplace, String eduschool, Integer faithPoints) {
		this.locPubBorough = locPubBorough;
		this.users = users;
		this.sex = sex;
		this.photo = photo;
		this.edu = edu;
		this.major = major;
		this.email = email;
		this.phone = phone;
		this.tel = tel;
		this.workplace = workplace;
		this.department = department;
		this.position = position;
		this.achievement = achievement;
		this.cid = cid;
		this.xyjf = xyjf;
		this.birthplace = birthplace;
		this.eduschool = eduschool;
		this.faithPoints = faithPoints;
	}

	// Property accessors

	public Integer getPhaId() {
		return this.phaId;
	}

	public void setPhaId(Integer phaId) {
		this.phaId = phaId;
	}

	public LocPubBorough getLocPubBorough() {
		return this.locPubBorough;
	}

	public void setLocPubBorough(LocPubBorough locPubBorough) {
		this.locPubBorough = locPubBorough;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEdu() {
		return this.edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getWorkplace() {
		return this.workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAchievement() {
		return this.achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getXyjf() {
		return this.xyjf;
	}

	public void setXyjf(Integer xyjf) {
		this.xyjf = xyjf;
	}

	public String getBirthplace() {
		return this.birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getEduschool() {
		return this.eduschool;
	}

	public void setEduschool(String eduschool) {
		this.eduschool = eduschool;
	}

	public Integer getFaithPoints() {
		return this.faithPoints;
	}

	public void setFaithPoints(Integer faithPoints) {
		this.faithPoints = faithPoints;
	}

}