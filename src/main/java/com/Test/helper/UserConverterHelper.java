package com.Test.helper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.Test.model.UserRegisterDetails;
import com.Test.request.entity.UserRequest;
import com.Test.response.entity.UserResponse;
import com.Test.response.entity.UserResponseList;
import com.Test.util.Util;
import com.google.common.base.Strings;

// TODO: Auto-generated Javadoc
/**
 * The Class UserConverterHelper.
 */
public class UserConverterHelper {

	/**
	 * Gets the user request.
	 *
	 * @param userRequest the user request
	 * @return the user request
	 * @throws ParseException the parse exception
	 */
	public static UserRegisterDetails getUserRequest(UserRequest userRequest) throws ParseException {
		UserRegisterDetails user = new UserRegisterDetails();
		if (!Strings.isNullOrEmpty(userRequest.getUserId())) {
			user.setUserId(UUID.fromString(userRequest.getUserId()));
		}
		else {
			user.setCreatedDate(Util.getTodayInCST());
		}
		if (!Strings.isNullOrEmpty(userRequest.getName())) {
			user.setUserName((userRequest.getName()));
		}
		if (!Strings.isNullOrEmpty(userRequest.getMotherName())) {
			user.setMotherName(userRequest.getMotherName());
		}
		if (!Strings.isNullOrEmpty(userRequest.getMobileNumber())) {
			user.setMobileNumber(userRequest.getMobileNumber());
		}
		if (!Strings.isNullOrEmpty(userRequest.getFatherName())) {
			user.setFatherName(userRequest.getFatherName());
		}
		if (!Strings.isNullOrEmpty(userRequest.getDescription())) {
			user.setDescription(userRequest.getDescription());
		}

		return user;
	}

	/**
	 * Gets the user from entity.
	 *
	 * @param user the user
	 * @return the user from entity
	 */
	public static UserResponse getUserFromEntity(UserRegisterDetails user) {

		UserResponse userResponse = new UserResponse();
		if (!Strings.isNullOrEmpty(user.getUserId().toString())) {
			userResponse.setUserId(user.getUserId().toString());
			
		}
		if (!Strings.isNullOrEmpty(user.getUserName())) {
			userResponse.setName(user.getUserName());
		}
		
		if (user.getCreatedDate()!=null) {
			userResponse.setCreatedDate(user.getCreatedDate().toString());
		}
		if (!Strings.isNullOrEmpty(user.getMotherName())) {
			userResponse.setMotherName(user.getMotherName());
		}
		if (!Strings.isNullOrEmpty(user.getMobileNumber().toString())) {
			userResponse.setMobileNumber(user.getMobileNumber());
		}
		if (!Strings.isNullOrEmpty(user.getFatherName())) {
			userResponse.setFatherName(user.getFatherName());
		}
		if (!Strings.isNullOrEmpty(user.getDescription())) {
			userResponse.setDescription(user.getDescription());
		}

		return userResponse;
	}

	/**
	 * Gets the group memberr response list from entity.
	 *
	 * @param userList   the user list
	 * @param totalCount the total count
	 * @return the group memberr response list from entity
	 */
	public static UserResponseList getUserResponseListFromEntity(List<UserRegisterDetails> userList, long totalCount) {
		UserResponseList userResponsesList = new UserResponseList();
		List<UserResponse> userResponses = new ArrayList<>();
		if (userList != null) {
			for (UserRegisterDetails user : userList) {
				userResponses.add(getUserFromEntity(user));

			}
		}
		userResponsesList.setUserResponses(userResponses);
		userResponsesList.setTotalCount(totalCount);
		return userResponsesList;
	}

}
