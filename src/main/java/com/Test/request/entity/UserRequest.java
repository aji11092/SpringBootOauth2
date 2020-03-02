

package com.Test.request.entity;

import java.util.UUID;

import javax.persistence.Column;

import io.swagger.annotations.ApiModelProperty;

/**
 * The Class TestRequest.
 */
public class UserRequest {

	@ApiModelProperty(value = "userId for the UserRequest")
	private String userId;

	/** The name. */
	@ApiModelProperty(value = "name for the UserRequest")
	private String name;

	/** The father name. */
	@ApiModelProperty(value = "fatherName for the UserRequest")
	private String fatherName;

	/** The mother name. */
	@ApiModelProperty(value = "motherName for the UserRequest")
	private String motherName;

	/** The mobile number. */
	@ApiModelProperty(value = "mobileNumber for the UserRequest")
	private String mobileNumber;

	/** The test description. */
	@ApiModelProperty(value = "description for the UserRequest")
	private String description;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
