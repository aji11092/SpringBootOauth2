

package com.Test.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.Test.common.Response;
import com.Test.delegate.UserDeligate;
import com.Test.exception.CommonException;
import com.Test.request.entity.UserRequest;
import com.google.common.base.Strings;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class TestController.
 */
@RestController
@RequestMapping({"/core/v1.0/user"})
@Api(tags = "TestController")
@CrossOrigin
public class UserController {

    /** The test deligate. */
    @Autowired
    UserDeligate testDeligate;

    /**
     * create Test.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    @PostMapping
    @ResponseBody
    @ApiOperation(value = "To save a createTest", notes = "A createTest can be created with its fields")
    public Response createUser(@RequestBody UserRequest userRequest) throws ParseException {
        Response responseObj = null;
        try {

            responseObj = testDeligate.createUser(userRequest);
        } catch (CommonException e) {
        }
        return responseObj;
    }

    /**
     * update Test.
     *
     * @param testRequest the test request
     * @return the response
     * @throws ParseException the parse exception
     */
    @PutMapping
    @ApiOperation(value = "To update a updateTest", notes = "A updateTest  with its fields")
    public Response updateUser(@RequestBody UserRequest userRequest) throws ParseException {
        Response responseObj = null;
        try {

            responseObj = testDeligate.updateUser(userRequest);
        } catch (CommonException e) {
        }
        return responseObj;
    }

    /**
     * get Test By using testId.
     *
     * @param groupId the group id
     * @return the test bytest id
     */
    @GetMapping
    @ApiOperation(value = "To find a testDetails", notes = "Selecting testDetails using testId")
    public Response getUserByuserId(@RequestParam("userId") String userId) {
        Response responseObj = null;
        try {
            responseObj = testDeligate.getUserByuserId(userId);
        } catch (CommonException e) {
            // responseObj = Util.turfException(e);
        }
        return responseObj;

    }

    /**
     * get All Test.
     *
     * @param pageSize the page size
     * @param pageNumber the page number
     * @param sortOrder the sort order
     * @param sortKey the sort key
     * @param searchKey the search key
     * @param userId the user id
     * @param partnerId the partner id
     * @return the all test
     * @throws JsonProcessingException the json processing exception
     * @throws ParseException the parse exception
     * @throws UnsupportedEncodingException the unsupported encoding exception
     */
    @GetMapping(value = "/all")
    @ApiOperation(value = "To get all test", notes = "Fetching all test by giving page size and page")
    public Response getAllUser(@RequestParam(value = "pageSize", required = false) int pageSize,
        @RequestParam(value = "pageNumber", required = false) int pageNumber,
        @RequestParam(value = "sortOrder", required = false) String sortOrder,
        @RequestParam(value = "sortKey", required = false) String sortKey,
        @RequestParam(value = "searchKey", required = false) String searchKey,
        @RequestParam(value = "userId", required = false) String userId,
        @RequestParam(value = "partnerId", required = false) String partnerId)
        throws JsonProcessingException, ParseException, UnsupportedEncodingException {
        Response responseObj = null;
        try {
            if (!Strings.isNullOrEmpty(searchKey)) {
                searchKey = URLDecoder.decode(searchKey, "UTF-8");
            }
            responseObj =
                testDeligate.getAllUser(pageSize, pageNumber, sortOrder, sortKey, searchKey, userId, partnerId);

        } catch (CommonException e) {
            // responseObj = Util.turfException(e);
        }
        return responseObj;
    }

    /**
     * delete Test By using testId.
     *
     * @param testId the test id
     * @return the response
     */
    @DeleteMapping
    @ApiOperation(value = "To delete a test", notes = "Deleting test selecting it by using testId")
    public Response deleteUserByuserId(@RequestParam("userId") String userId) {
        @SuppressWarnings("unused")
        Response responseObj = null;
        try {
            testDeligate.deleteUserByuserId(userId);
        } catch (CommonException e) {
            // responseObj = Util.turfException(e);
        }
        return null;
        // ResponseHelper.getSuccessResponse("test Deleted", "DELETED", "TEST_DELETED_SUCCESS");
    }

    

}
