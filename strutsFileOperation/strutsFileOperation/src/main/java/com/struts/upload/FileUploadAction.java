package com.struts.upload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private File fileupload;                     
    private String fileuploadFileName;           
    private String localDirectory = "E:" + File.separator + "javaFiles" + File.separator + "upload";

    public String doUpload() {
        File directory = new File(localDirectory);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File saveFilePath = new File(localDirectory + File.separator + fileuploadFileName);

        try {
            FileUtils.copyFile(fileupload, saveFilePath);
        } catch (IOException e) {
            System.out.println("Couldn't save file: " + e.getMessage());
            return ERROR;
        }

        return SUCCESS;
    }

    // Getters and Setters
    public File getFileupload() {
        return fileupload;
    }

    public void setFileupload(File fileupload) {
        this.fileupload = fileupload;
    }

    public String getFileuploadFileName() {
        return fileuploadFileName;
    }

    public void setFileuploadFileName(String fileuploadFileName) {
        this.fileuploadFileName = fileuploadFileName;
    }
}
