
package com.Test.response.entity;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class TestResponseList.
 */
public class UserResponseList {

	/** The test responses. */
	private List<UserResponse> testResponses;

	/** The total count. */
	private long totalCount;

	/**
	 * Gets the test responses.
	 *
	 * @return the test responses
	 */
	public List<UserResponse> getTestResponses() {
		return testResponses;
	}

	/**
	 * Sets the test responses.
	 *
	 * @param testResponses the new test responses
	 */
	public void setTestResponses(List<UserResponse> testResponses) {
		this.testResponses = testResponses;
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
