/*
 * FileName: JMSErrorHandler.java
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

/**
 * The Class JMSErrorHandler.
 */
@Service
public class JMSErrorHandler implements ErrorHandler {

    /** The log. */
    private Logger log = LoggerFactory.getLogger(this.getClass().getName());

    /* (non-Javadoc)
     * @see org.springframework.util.ErrorHandler#handleError(java.lang.Throwable)
     */
    @Override
    public void handleError(Throwable t) {
        log.error("Error in JMS listener", t);
    }
}
