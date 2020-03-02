/*
 * FileName: CeResponse.java
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

import java.util.List;
import java.util.Map;

/**
 * The Class CeResponse.
 */
public class CeResponse {

    /** The success. */
    private boolean success;

    /** The message. */
    private String message;

    /** The data. */
    private Object data;

    /** The success code. */
    private String successCode;

    /** The extras. */
    private Map<String, Object> extras;

    /** The modified. */
    private boolean modified;

    /** The param errors. */
    private List<ParamErrors> paramErrors;

    /**
     * Gets the error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     *
     * @param errorCode the new error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /** The error code. */
    private String errorCode;

    /**
     * Checks if is success.
     *
     * @return true, if is success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the success.
     *
     * @param success the new success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     *
     * @param message the new message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the new data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Gets the success code.
     *
     * @return the success code
     */
    public String getSuccessCode() {
        return successCode;
    }

    /**
     * Sets the success code.
     *
     * @param successCode the new success code
     */
    public void setSuccessCode(String successCode) {
        this.successCode = successCode;
    }

    /**
     * Gets the extras.
     *
     * @return the extras
     */
    public Map<String, Object> getExtras() {
        return extras;
    }

    /**
     * Sets the extras.
     *
     * @param extras the extras
     */
    public void setExtras(Map<String, Object> extras) {
        this.extras = extras;
    }

    /**
     * Checks if is modified.
     *
     * @return true, if is modified
     */
    public boolean isModified() {
        return modified;
    }

    /**
     * Sets the modified.
     *
     * @param modified the new modified
     */
    public void setModified(boolean modified) {
        this.modified = modified;
    }

    /**
     * Gets the param errors.
     *
     * @return the param errors
     */
    public List<ParamErrors> getParamErrors() {
        return paramErrors;
    }

    /**
     * Sets the param errors.
     *
     * @param paramErrors the new param errors
     */
    public void setParamErrors(List<ParamErrors> paramErrors) {
        this.paramErrors = paramErrors;
    }

}
