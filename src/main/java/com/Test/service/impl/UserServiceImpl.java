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

import com.Test.common.Response;
import com.Test.repository.TestRepository;
import com.Test.request.entity.UserRequest;
import com.Test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TestRepository testRepository;

	@Override
	public Response createUser(UserRequest userRequest) {
		// TODO Auto-generated method stub
		return null;
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
