
package com.Test.delegate.impl;

import com.Test.common.Response;
import com.Test.delegate.UserDeligate;
import com.Test.request.entity.UserRequest;
import com.Test.service.UserRegisterDetailsService;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class UserDeligateImpl.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserDeligateImpl implements UserDeligate {

	/** The service. */
	@Autowired
	UserRegisterDetailsService service;

	/**
	 * Creates the user.
	 *
	 * @param userRequest the user request
	 * @return the response
	 * @throws ParseException the parse exception
	 */
	@Override
	public Response createUser(UserRequest userRequest) throws ParseException {

		return service.createUser(userRequest);
	}

	/**
	 * Update user.
	 *
	 * @param userRequest the user request
	 * @return the response
	 * @throws ParseException the parse exception
	 */
	@Override
	public Response updateUser(UserRequest userRequest) throws ParseException {

		return service.updateUser(userRequest);
	}

	/**
	 * Gets the user byuser id.
	 *
	 * @param userId the user id
	 * @return the user byuser id
	 */
	@Override
	public Response getUserByuserId(String userId) {

		return service.getUserByuserId(userId);
	}

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
	@Override
	public Response getAllUser(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey,
			String userId, String partnerId) {

		return service.getAllUser(pageSize, pageNumber, sortOrder, sortKey, searchKey, userId, partnerId);
	}

	/**
	 * Delete user byuser id.
	 *
	 * @param userId the user id
	 * @return the object
	 */
	@Override
	public Response deleteUserByuserId(String userId) {

		return service.deleteUserByuserId(userId);

	}

}
