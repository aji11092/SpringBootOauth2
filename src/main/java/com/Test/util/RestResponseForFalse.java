/*
 * FileName: RestResponseForFalse.java
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

import java.io.Serializable;
import java.util.List;

/**
 * The Class RestResponseForFalse.
 */
public class RestResponseForFalse implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3392828328687879107L;

    /** The summary. */
    private String summary;

    /** The description. */
    private String description;

    /** The error code. */
    private String errorCode;

    /** The status code. */
    private Integer statusCode;

    /** The param errors. */
    private List<ParamErrors> paramErrors;

    /**
     * Gets the summary.
     *
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the summary.
     *
     * @param summary the new summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

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

    /**
     * Gets the status code.
     *
     * @return the status code
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the status code.
     *
     * @param statusCode the new status code
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
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

    /**
     * Instantiates a new rest response for false.
     *
     * @param summary the summary
     * @param description the description
     * @param errorCode the error code
     * @param statusCode the status code
     * @param paramErrors the param errors
     */
    public RestResponseForFalse(String summary, String description, String errorCode, Integer statusCode,
        List<ParamErrors> paramErrors) {
        this.summary = summary;
        this.description = description;
        this.errorCode = errorCode;
        this.statusCode = statusCode;
        this.paramErrors = paramErrors;
    }
}
