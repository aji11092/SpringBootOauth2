

package com.Test.exception;

import com.Test.common.ErrorCode;
import com.Test.util.ParamErrors;
import java.util.List;

/**
 * The Class CommonException.
 */
public class CommonException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The error code. */
    private final String errorCode;

    /** The message. */
    private final String message;

    /** The param errors. */
    private final List<ParamErrors> paramErrors;

    /**
     * Instantiates a new common exception.
     *
     * @param errorCode the error code
     * @param message the message
     * @param paramErrors the param errors
     */
    public CommonException(String errorCode, String message, List<ParamErrors> paramErrors) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
        this.paramErrors = paramErrors;
    }

    /**
     * Instantiates a new common exception.
     *
     * @param code the code
     * @param ex the ex
     * @param paramErrors the param errors
     */
    public CommonException(ErrorCode code, Exception ex, List<ParamErrors> paramErrors) {
        super(ex);
        this.errorCode = code.toString();
        this.message = ex.getMessage();
        this.paramErrors = paramErrors;
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
     * Gets the param errors.
     *
     * @return the param errors
     */
    public List<ParamErrors> getParamErrors() {
        return paramErrors;
    }

    /* (non-Javadoc)
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage() {
        return message;
    }

}
