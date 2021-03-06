
package com.Test.service;

import java.text.ParseException;

import com.Test.common.Response;
import com.Test.request.entity.UserRequest;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserService.
 */
public interface UserRegisterDetailsService {

	/**
	 * Creates the user.
	 *
	 * @param userRequest the user request
	 * @return the response
	 * @throws ParseException the parse exception
	 */
	Response createUser(UserRequest userRequest) throws ParseException;

	/**
	 * Update user.
	 *
	 * @param userRequest the user request
	 * @return the response
	 * @throws ParseException the parse exception
	 */
	Response updateUser(UserRequest userRequest) throws ParseException;

	/**
	 * Gets the user byuser id.
	 *
	 * @param userId the user id
	 * @return the user byuser id
	 */
	Response getUserByuserId(String userId);

	/**
	 * Gets the all user.
	 *
	 * @param pageSize   the page size
	 * @param pageNumber the page number
	 * @param sortOrder  the sort order
	 * @param sortKey    the sort key
	 * @param searchKey  the search key
	 * @param userId     the user id
	 * @param partnerId  the partner id
	 * @return the all user
	 */
	Response getAllUser(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey, String userId,
			String partnerId);

	/**
	 * Delete user byuser id.
	 *
	 * @param userId the user id
	 * @return the object
	 */
	Response deleteUserByuserId(String userId);

}
