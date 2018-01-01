package com.wrw.test.pojo;

/**
 * EvaluateuserId entity. @author MyEclipse Persistence Tools
 */

public class EvaluateuserId implements java.io.Serializable {

	// Fields

	private Integer evaluId;
	private Integer evaluUserBeId;
	private Integer evaluUserId;

	// Constructors

	/** default constructor */
	public EvaluateuserId() {
	}

	/** full constructor */
	public EvaluateuserId(Integer evaluId, Integer evaluUserBeId, Integer evaluUserId) {
		this.evaluId = evaluId;
		this.evaluUserBeId = evaluUserBeId;
		this.evaluUserId = evaluUserId;
	}

	// Property accessors

	public Integer getEvaluId() {
		return this.evaluId;
	}

	public void setEvaluId(Integer evaluId) {
		this.evaluId = evaluId;
	}

	public Integer getEvaluUserBeId() {
		return this.evaluUserBeId;
	}

	public void setEvaluUserBeId(Integer evaluUserBeId) {
		this.evaluUserBeId = evaluUserBeId;
	}

	public Integer getEvaluUserId() {
		return this.evaluUserId;
	}

	public void setEvaluUserId(Integer evaluUserId) {
		this.evaluUserId = evaluUserId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EvaluateuserId))
			return false;
		EvaluateuserId castOther = (EvaluateuserId) other;

		return ((this.getEvaluId() == castOther.getEvaluId()) || (this.getEvaluId() != null
				&& castOther.getEvaluId() != null && this.getEvaluId().equals(castOther.getEvaluId())))
				&& ((this.getEvaluUserBeId() == castOther.getEvaluUserBeId())
						|| (this.getEvaluUserBeId() != null && castOther.getEvaluUserBeId() != null
								&& this.getEvaluUserBeId().equals(castOther.getEvaluUserBeId())))
				&& ((this.getEvaluUserId() == castOther.getEvaluUserId())
						|| (this.getEvaluUserId() != null && castOther.getEvaluUserId() != null
								&& this.getEvaluUserId().equals(castOther.getEvaluUserId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEvaluId() == null ? 0 : this.getEvaluId().hashCode());
		result = 37 * result + (getEvaluUserBeId() == null ? 0 : this.getEvaluUserBeId().hashCode());
		result = 37 * result + (getEvaluUserId() == null ? 0 : this.getEvaluUserId().hashCode());
		return result;
	}

}