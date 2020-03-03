
package com.Test.response.entity;

import io.swagger.annotations.ApiModelProperty;

// TODO: Auto-generated Javadoc
/**
 * The Class TestResponse.
 */
public class UserResponse {

	/** The user id. */
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

	/** The email. */
	@ApiModelProperty(value = "email for the user_details")
	private String email;

	/** The password. */
	@ApiModelProperty(value = "description for the user_details")
	private String password;

	/** The created date. */
	@ApiModelProperty(value = "createdDate for the UserRequest")
	private String createdDate;

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the father name.
	 *
	 * @return the father name
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * Sets the father name.
	 *
	 * @param fatherName the new father name
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * Gets the mother name.
	 *
	 * @return the mother name
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * Sets the mother name.
	 *
	 * @param motherName the new mother name
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * Gets the mobile number.
	 *
	 * @return the mobile number
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * Sets the mobile number.
	 *
	 * @param mobileNumber the new mobile number
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
