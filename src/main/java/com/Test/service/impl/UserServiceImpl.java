
package com.Test.service.impl;

import com.Test.common.ErrorCode;
import com.Test.common.ErrorMessages;
import com.Test.common.Response;
import com.Test.exception.CommonException;
import com.Test.helper.ResponseHelper;
import com.Test.helper.UserConverterHelper;
import com.Test.model.User;
import com.Test.repository.UserRepository;
import com.Test.request.entity.UserRequest;
import com.Test.service.UserService;
import com.Test.util.Constants;
import com.Test.util.ParamErrors;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
/**
 * The Class UserServiceImpl.
 */
@Service
public class UserServiceImpl implements UserService {

	/** The user repository. */
	@Autowired
	UserRepository userRepository;

	/**
	 * Creates the user.
	 *
	 * @param userRequest the user request
	 * @return the response
	 * @throws ParseException the parse exception
	 */
	@Override
	public Response createUser(UserRequest userRequest) throws ParseException {
		List<ParamErrors> paramErrorsList = new ArrayList<>();
		ParamErrors paramErrors = new ParamErrors();
		User user = new User();

		try {

			if (userRequest.getName() == null) {
				paramErrors.setParamName(Constants.NAME);
				paramErrors.setError(Constants.NAME_IS_REQUIRED);
				paramErrorsList.add(paramErrors);
			}

			if (userRequest.getMobileNumber() == null) {
				paramErrors.setParamName(Constants.MOBILE_NUMBER);
				paramErrors.setError(Constants.MOBILE_NUMBER_IS_REQUIRED);
				paramErrorsList.add(paramErrors);
			}

			if (!paramErrorsList.isEmpty()) {
				throw new CommonException(ErrorMessages.INVALID_PARAMETERS, Constants.INVALID_REQUEST, paramErrorsList);
			}
			user = UserConverterHelper.getUserRequest(userRequest);

			user = userRepository.save(user);

		} catch (DataIntegrityViolationException e) {
			throw new CommonException(ErrorCode.DUPLICATION.toString(), Constants.USER_NOT_EXIST, null);
		}
		return ResponseHelper.getSuccessResponse(Constants.USER_CREATED, UserConverterHelper.getUserFromEntity(user),
				Constants.USER_CREATE_SUCCESS);
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
		List<ParamErrors> paramErrorsList = new ArrayList<>();
		ParamErrors paramErrors = new ParamErrors();
		User user = new User();

		try {
			if (userRequest.getUserId() == null) {
				paramErrors.setParamName(Constants.USERID);
				paramErrors.setError(Constants.USERID_IS_REQUIRED);
				paramErrorsList.add(paramErrors);
			}

			if (userRequest.getName() == null) {
				paramErrors.setParamName(Constants.NAME);
				paramErrors.setError(Constants.NAME_IS_REQUIRED);
				paramErrorsList.add(paramErrors);
			}

			if (userRequest.getMobileNumber() == null) {
				paramErrors.setParamName(Constants.MOBILE_NUMBER);
				paramErrors.setError(Constants.MOBILE_NUMBER_IS_REQUIRED);
				paramErrorsList.add(paramErrors);
			}

			if (!paramErrorsList.isEmpty()) {
				throw new CommonException(ErrorMessages.INVALID_PARAMETERS, Constants.INVALID_REQUEST, paramErrorsList);
			}
			user = UserConverterHelper.getUserRequest(userRequest);

			user = userRepository.save(user);

		} catch (DataIntegrityViolationException e) {
			throw new CommonException(ErrorCode.DUPLICATION.toString(), Constants.USER_NOT_EXIST, null);
		}
		return ResponseHelper.getSuccessResponse(Constants.USER_UPDATED, UserConverterHelper.getUserFromEntity(user),
				Constants.USER_UPDATED_SUCCESS);
	}

	/**
	 * Gets the user byuser id.
	 *
	 * @param userId the user id
	 * @return the user byuser id
	 */
	@Override
	public Response getUserByuserId(String userId) {
		List<ParamErrors> paramErrorsList = new ArrayList<>();
		ParamErrors paramErrors = new ParamErrors();
		User user = new User();

		try {
			if (userId == null) {
				paramErrors.setParamName(Constants.USERID);
				paramErrors.setError(Constants.USERID_IS_REQUIRED);
				paramErrorsList.add(paramErrors);
			}

			if (!paramErrorsList.isEmpty()) {
				throw new CommonException(ErrorMessages.INVALID_PARAMETERS, Constants.INVALID_REQUEST, paramErrorsList);
			}
			user = userRepository.getUserByUserId(UUID.fromString(userId));
			if (user == null) {
				paramErrors = new ParamErrors();
				paramErrors.setParamName(Constants.USER_NOT_EXIST);
				paramErrors.setError(Constants.USER_NOT_EXIST);
				paramErrorsList.add(paramErrors);
				throw new CommonException(ErrorMessages.INVALID_PARAMETERS, Constants.INVALID_REQUEST, paramErrorsList);
			}

		} catch (DataIntegrityViolationException e) {
			throw new CommonException(ErrorCode.DUPLICATION.toString(), Constants.USER_NOT_EXIST, null);
		}
		return ResponseHelper.getSuccessResponse(Constants.USER_FETCHED, UserConverterHelper.getUserFromEntity(user),
				Constants.USER_FETCHED_SUCCESS);
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
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Delete user byuser id.
	 *
	 * @param userId the user id
	 * @return the object
	 */
	@Override
	public Response deleteUserByuserId(String userId) {
		List<ParamErrors> paramErrorsList = new ArrayList<>();
		ParamErrors paramErrors = new ParamErrors();
		User user = new User();

		try {
			if (userId == null) {
				paramErrors.setParamName(Constants.USERID);
				paramErrors.setError(Constants.USERID_IS_REQUIRED);
				paramErrorsList.add(paramErrors);
			}

			if (!paramErrorsList.isEmpty()) {
				throw new CommonException(ErrorMessages.INVALID_PARAMETERS, Constants.INVALID_REQUEST, paramErrorsList);
			}
			user = userRepository.getUserByUserId(UUID.fromString(userId));
			if (user == null) {
				paramErrors = new ParamErrors();
				paramErrors.setParamName(Constants.USER_NOT_EXIST);
				paramErrors.setError(Constants.USER_NOT_EXIST);
				paramErrorsList.add(paramErrors);
				throw new CommonException(ErrorMessages.INVALID_PARAMETERS, Constants.INVALID_REQUEST, paramErrorsList);
			}
			userRepository.delete(user);

		} catch (DataIntegrityViolationException e) {
			throw new CommonException(ErrorCode.DUPLICATION.toString(), Constants.USER_NOT_EXIST, null);
		}
		return ResponseHelper.getSuccessResponse(Constants.USER_DELETED,"DELETED",
				Constants.USER_DELETED_SUCCESS);
	}

}
