
package com.Test.helper;

import com.Test.common.Response;

/**
 * The Class ResponseHelper.
 */
public class ResponseHelper {

    /**
     * Instantiates a new response helper.
     */
    private ResponseHelper() {

    }

    /**
     * Used to get error response.
     * 
     * @param message The error message
     * @return error response
     */
    public static Response getErrorResponse(String message) {
        Response response = new Response();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }

    /**
     * Used to get success response.
     *
     * @param message The success message
     * @param data The response data
     * @param successCode the success code
     * @return success response
     */
    public static Response getSuccessResponse(String message, Object data, String successCode) {
        Response response = new Response();
        response.setMessage(message);
        response.setData(data);
        response.setSuccess(true);
        response.setSuccessCode(successCode);
        return response;
    }

}
