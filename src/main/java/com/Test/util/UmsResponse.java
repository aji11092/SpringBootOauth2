/*
 * FileName: UmsResponse.java
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
 * The Class UmsResponse.
 */
public class UmsResponse {

    /** The success. */
    private Boolean success;

    /** The messages. */
    private String messages;

    /** The return data. */
    private Object returnData;

    /** The code. */
    private int code;

    /**
     * Gets the success.
     *
     * @return the success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * Sets the success.
     *
     * @param success the new success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * Gets the messages.
     *
     * @return the messages
     */
    public String getMessages() {
        return messages;
    }

    /**
     * Sets the messages.
     *
     * @param messages the new messages
     */
    public void setMessages(String messages) {
        this.messages = messages;
    }

    /**
     * Gets the return data.
     *
     * @return the return data
     */
    public Object getReturnData() {
        return returnData;
    }

    /**
     * Sets the return data.
     *
     * @param returnData the new return data
     */
    public void setReturnData(Object returnData) {
        this.returnData = returnData;
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code the new code
     */
    public void setCode(int code) {
        this.code = code;
    }
}
