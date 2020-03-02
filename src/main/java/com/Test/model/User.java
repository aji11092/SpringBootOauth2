
package com.Test.model;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

import io.swagger.annotations.ApiModelProperty;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
@Entity
@Table(name = "user_details")
public class User {

	/** The Constant serialVersionUID. */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	/** The test id. */
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "user_id")
	@ApiModelProperty(value = "userId for the user_details")
	private UUID userId;

	/** The name. */
	@ApiModelProperty(value = "name for the user_details")
	@Column(name = "name")
	private String name;

	/** The father name. */
	@ApiModelProperty(value = "fatherName for the user_details")
	@Column(name = "father_name")
	private String fatherName;

	/** The mother name. */
	@ApiModelProperty(value = "motherName for the user_details")
	@Column(name = "mother_name")
	private String motherName;

	/** The mobile number. */
	@ApiModelProperty(value = "mobileNumber for the user_details")
	@Column(name = "mobile_number")
	private String mobileNumber;

	/** The test description. */
	@ApiModelProperty(value = "description for the user_details")
	@Column(name = "description", columnDefinition = "TEXT")
	private String description;
	
	 @ApiModelProperty(value = "createdDate for the user_details")
	    @Column(name = "created_date")
	    private Date createdDate;

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public UUID getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(UUID userId) {
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	

}
