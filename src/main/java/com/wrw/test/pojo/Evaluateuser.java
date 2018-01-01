package com.wrw.test.pojo;

import java.sql.Timestamp;

/**
 * Evaluateuser entity. @author MyEclipse Persistence Tools
 */

public class Evaluateuser implements java.io.Serializable {

	// Fields

	private EvaluateuserId id;
	private Users usersByEvaluUserBeId;
	private Users usersByEvaluUserId;
	private String evaluContent;
	private Timestamp evaluTime;

	// Constructors

	/** default constructor */
	public Evaluateuser() {
	}

	/** full constructor */
	public Evaluateuser(EvaluateuserId id, Users usersByEvaluUserBeId, Users usersByEvaluUserId, String evaluContent,
			Timestamp evaluTime) {
		this.id = id;
		this.usersByEvaluUserBeId = usersByEvaluUserBeId;
		this.usersByEvaluUserId = usersByEvaluUserId;
		this.evaluContent = evaluContent;
		this.evaluTime = evaluTime;
	}

	// Property accessors

	public EvaluateuserId getId() {
		return this.id;
	}

	public void setId(EvaluateuserId id) {
		this.id = id;
	}

	public Users getUsersByEvaluUserBeId() {
		return this.usersByEvaluUserBeId;
	}

	public void setUsersByEvaluUserBeId(Users usersByEvaluUserBeId) {
		this.usersByEvaluUserBeId = usersByEvaluUserBeId;
	}

	public Users getUsersByEvaluUserId() {
		return this.usersByEvaluUserId;
	}

	public void setUsersByEvaluUserId(Users usersByEvaluUserId) {
		this.usersByEvaluUserId = usersByEvaluUserId;
	}

	public String getEvaluContent() {
		return this.evaluContent;
	}

	public void setEvaluContent(String evaluContent) {
		this.evaluContent = evaluContent;
	}

	public Timestamp getEvaluTime() {
		return this.evaluTime;
	}

	public void setEvaluTime(Timestamp evaluTime) {
		this.evaluTime = evaluTime;
	}

}