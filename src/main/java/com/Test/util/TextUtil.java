/*
 * FileName: TextUtil.java
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
 * The Class TextUtil.
 */
public class TextUtil {

    /**
     * Instantiates a new text util.
     */
    private TextUtil() {
        throw new IllegalStateException("TextUtil class");
    }

    /**
     * Performs null and empty check.
     *
     * @param value the value
     * @return true, if is empty
     */
    public static boolean isEmpty(String value) {
        return value == null || value.isEmpty() || value == "";
    }

}
