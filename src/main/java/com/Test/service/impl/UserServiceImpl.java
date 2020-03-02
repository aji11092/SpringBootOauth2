/*
 * FileName: TestServiceImpl.java
 * Author  : Ajimon
 * 
 * Using JRE 1.8.0_211
 * 
 * Copyright(c) 2020 Finance.
 * Duplication or distribution of this code in part or in whole by any media
 * without the express written permission of Finance or its agents is
 * strictly prohibited.
 *  
 * REVISION         DATE        NAME       DESCRIPTION
 * 511.101       2 Jan, 2020       Ajimon      Initial Code  
 */

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

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
        return ResponseHelper.getSuccessResponse(Constants.USER_CREATED,
        		UserConverterHelper.getUserFromEntity(user), Constants.USER_CREATE_SUCCESS);
	}

	@Override
	public Response updateUser(UserRequest userRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getUserByuserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getAllUser(int pageSize, int pageNumber, String sortOrder, String sortKey, String searchKey,
			String userId, String partnerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deleteUserByuserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

   
}
