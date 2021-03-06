
package com.Test.service.impl;

import com.Test.common.ErrorCode;
import com.Test.common.ErrorMessages;
import com.Test.common.Response;
import com.Test.exception.CommonException;
import com.Test.helper.ResponseHelper;
import com.Test.helper.UserConverterHelper;
import com.Test.model.UserRegisterDetails;
import com.Test.repository.UserRegisterDetailsRepository;
import com.Test.request.entity.UserRequest;
import com.Test.service.UserRegisterDetailsService;
import com.Test.util.Constants;
import com.Test.util.ParamErrors;
import com.Test.util.TextUtil;
import com.Test.util.Util;
import com.google.common.base.Strings;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
/**
 * The Class UserServiceImpl.
 */
@Service
public class UserServiceImpl implements UserRegisterDetailsService {

	/** The user repository. */
	@Autowired
	UserRegisterDetailsRepository userRepository;

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
		UserRegisterDetails user = new UserRegisterDetails();

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
		UserRegisterDetails user = new UserRegisterDetails();

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
		UserRegisterDetails user = new UserRegisterDetails();

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
	@SuppressWarnings("unused")
	@Override
	public Response getAllUser(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey,
			String userId, String partnerId) {
		List<ParamErrors> paramErrorsList = new ArrayList<>();
		ParamErrors paramErrors = new ParamErrors();
		Sort sort = null;
		List<UserRegisterDetails> userList = null;
		long totalCount = 0;
		Page<UserRegisterDetails> pages = null;
		Pageable pageRequest = null;

		try {

			if (!TextUtil.isEmpty(sortKey)) {
				sort = new Sort(sortOrder.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC, sortKey);
			}
			if (TextUtil.isEmpty(sortKey)) {
				sort = new Sort("desc".equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC,
						"createdDate");
			}
			pageRequest = new PageRequest(pageNumber, pageSize, sort);
			if (Strings.isNullOrEmpty(searchKey)) {
				pages = userRepository.findAll(pageRequest);
			}
			if (pages != null && !Util.isNullOrEmpty(pages.getContent())) {
				totalCount = pages.getTotalElements();
				userList = pages.getContent();

			}

		} catch (DataIntegrityViolationException e) {
			throw new CommonException(ErrorCode.DUPLICATION.toString(), Constants.USER_NOT_EXIST, null);
		}
		return ResponseHelper.getSuccessResponse(Constants.ALL_USER_FETCH,
				UserConverterHelper.getUserResponseListFromEntity(userList, totalCount),
				Constants.ALL_USER_FETCH_SUCCESS);
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
		UserRegisterDetails user = new UserRegisterDetails();

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
		return ResponseHelper.getSuccessResponse(Constants.USER_DELETED, "DELETED", Constants.USER_DELETED_SUCCESS);
	}

}
