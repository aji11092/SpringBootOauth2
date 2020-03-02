/*
 * FileName: FileUtilities.java
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

import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class FileUtilities.
 */
public class FileUtilities {

    /**
     * Gets the file extension.
     *
     * @param fileName the file name
     * @return the file extension
     */
    public static String getFileExtension(String fileName) {

        return fileName.substring(fileName.lastIndexOf(".") + 1);

    }

    /**
     * Upload file.
     *
     * @param uploadfile the uploadfile
     * @param fileName the file name
     * @param uploadFolder the upload folder
     */
    public static void uploadFile(MultipartFile uploadfile, String fileName, String uploadFolder) {
        BufferedOutputStream stream = null;
        String dirAbsolutePath = getDirectoryAbsolutePath(uploadFolder);
        try {
            byte[] bytes = uploadfile.getBytes();
            File serverFile = new File(dirAbsolutePath + Constants.FILE_PATH_SEPERATOR + fileName);
            stream = new BufferedOutputStream(new FileOutputStream(serverFile));
            try {
                stream.write(bytes);
            } finally {
                stream.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage() + "File not found");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage() + "Failed to upload file!");
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Gets the directory absolute path.
     *
     * @param uploadFolder the upload folder
     * @return the directory absolute path
     */
    private static String getDirectoryAbsolutePath(String uploadFolder) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String today = dateFormat.format(date);
        File dir = null;

        dir = new File(uploadFolder + Constants.FILE_PATH_SEPERATOR + today);

        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir.getAbsolutePath();
    }
}
