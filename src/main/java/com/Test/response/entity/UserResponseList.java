
package com.Test.response.entity;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class TestResponseList.
 */
public class UserResponseList {

	/** The test responses. */
	private List<UserResponse> userResponses;

	/** The total count. */
	private long totalCount;

	/**
	 * Gets the user responses.
	 *
	 * @return the user responses
	 */
	public List<UserResponse> getUserResponses() {
		return userResponses;
	}

	/**
	 * Sets the user responses.
	 *
	 * @param userResponses the new user responses
	 */
	public void setUserResponses(List<UserResponse> userResponses) {
		this.userResponses = userResponses;
	}

	/**
	 * Gets the total count.
	 *
	 * @return the total count
	 */
	public long getTotalCount() {
		return totalCount;
	}

	/**
	 * Sets the total count.
	 *
	 * @param totalCount the new total count
	 */
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

}
