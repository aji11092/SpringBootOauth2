/*
 * FileName: LRSUploader.java
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * The Class LRSUploader.
 */
public class LRSUploader {

    /**
     * Upload.
     *
     * @param mailId the mail id
     * @param name the name
     * @param verb the verb
     * @param verbId the verb id
     * @param objectId the object id
     * @param definitionName the definition name
     */
    public static void upload(String mailId, String name, String verb, String verbId, String objectId,
        String definitionName) {
        try {

            URL myURL = new URL("http://192.168.4.134/data/xAPI/statements");
            HttpURLConnection myURLConnection = (HttpURLConnection) myURL.openConnection();

            String userCredentials =
                "c68e73ef22715cb3d954c6784e8ed18ca53087cf:66fabb47cc6b2f78175c9c3c95633d848d444474";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));

            myURLConnection.setRequestProperty("Authorization", basicAuth);
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setRequestProperty("Content-Language", "en-US");
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestProperty("X-Experience-API-Version", "1.0.1");
            myURLConnection.setUseCaches(false);
            myURLConnection.setDoInput(true);
            myURLConnection.setDoOutput(true);
            String input = "{\"actor\":{\"mbox\":".concat("\"" + "mailto:" + mailId + "\"").concat(",")
                .concat("\"name\":".concat("\"" + name + "\"")).concat("}").concat(",").concat(
                    "\"verb\":".concat("{\"display\":".concat("{\"en-GB\":").concat("\"" + verb + "\"}")).concat(",")
                        .concat("\"id\":".concat("\"" + verbId + "\"}").concat(",")
                            .concat("\"object\":".concat("{\"id\":").concat("\"" + objectId + "\"").concat(",")
                                .concat("\"definition\":").concat("{\"name\":").concat("{\"en-GB\":")
                                .concat("\"" + definitionName + "\"").concat("}}}}"))));
            System.out.println(input);
            OutputStream os = myURLConnection.getOutputStream();
            os.write(input.getBytes());
            os.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader((myURLConnection.getInputStream())));
            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            myURLConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
