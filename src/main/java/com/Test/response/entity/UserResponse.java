

package com.Test.response.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * The Class TestResponse.
 */
public class UserResponse {

	@ApiModelProperty(value = "userId for the UserResponse")
	private String userId;

	/** The name. */
	@ApiModelProperty(value = "name for the UserResponse")
	private String name;

	/** The father name. */
	@ApiModelProperty(value = "fatherName for the UserResponse")
	private String fatherName;

	/** The mother name. */
	@ApiModelProperty(value = "motherName for the UserResponse")
	private String motherName;

	/** The mobile number. */
	@ApiModelProperty(value = "mobileNumber for the UserResponse")
	private String mobileNumber;

	/** The test description. */
	@ApiModelProperty(value = "description for the UserResponse")
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
