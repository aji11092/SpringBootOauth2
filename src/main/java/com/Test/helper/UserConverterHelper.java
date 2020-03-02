package com.Test.helper;

import java.text.ParseException;
import java.util.UUID;
import com.Test.model.User;
import com.Test.request.entity.UserRequest;
import com.Test.response.entity.UserResponse;
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
	public static User getUserRequest(UserRequest userRequest) throws ParseException {
		User user = new User();
		if (!Strings.isNullOrEmpty(userRequest.getUserId())) {
			user.setUserId(UUID.fromString(userRequest.getUserId()));
		}
		if (!Strings.isNullOrEmpty(userRequest.getName())) {
			user.setName(userRequest.getName());
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
	public static UserResponse getUserFromEntity(User user) {

		UserResponse userResponse = new UserResponse();
		if (!Strings.isNullOrEmpty(user.getUserId().toString())) {
			userResponse.setUserId(user.getUserId().toString());
		}
		if (!Strings.isNullOrEmpty(user.getName())) {
			userResponse.setName(user.getName());
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

}
