/*
 * FileName: Constants.java
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

package com.Test.util;

/**
 * The Class Constants.
 */
public class Constants {


    public static final String USERID = "USERID";

    public static final String USERID_IS_REQUIRED = "USERID_IS_REQUIRED";
    
    public static final String MOBILE_NUMBER = "MOBILE_NUMBER";

    public static final String MOBILE_NUMBER_IS_REQUIRED = "MOBILE_NUMBER_IS_REQUIRED";
    public static final String NAME = "NAME";
    
    public static final String NAME_IS_REQUIRED = "NAME_IS_REQUIRED";
    public static final String INVALID_REQUEST = "INVALID_REQUEST";
    public static final String USER_CREATED = "USER_CREATED";
    public static final String USER_NOT_EXIST = "USER_NOT_EXIST";
    public static final String USER_CREATE_SUCCESS = "USER_CREATE_SUCCESS";

  
    private Constants() {
        throw new IllegalStateException("Constants");
    }
}
