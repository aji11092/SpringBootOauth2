

package com.Test.request.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * The Class TestRequest.
 */
public class UserRequest {

    /** The test id. */
    @ApiModelProperty(value = "testId for the TestRequest")
    private String testId;

    /** The name. */
    @ApiModelProperty(value = "name for the TestRequest")
    private String name;

    /** The test description. */
    @ApiModelProperty(value = "testDescription for the TestRequest")
    private String testDescription;

    /**
     * Gets the test id.
     *
     * @return the test id
     */
    public String getTestId() {
        return testId;
    }

    /**
     * Sets the test id.
     *
     * @param testId the new test id
     */
    public void setTestId(String testId) {
        this.testId = testId;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the test description.
     *
     * @return the test description
     */
    public String getTestDescription() {
        return testDescription;
    }

    /**
     * Sets the test description.
     *
     * @param testDescription the new test description
     */
    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

}
