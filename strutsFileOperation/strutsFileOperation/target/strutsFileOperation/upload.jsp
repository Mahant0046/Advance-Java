<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Upload the assignments here</title>
</head>
<body>
    <center>
        <h1>Upload the assignments here..!</h1>
        <s:form action="uploadfile" enctype="multipart/form-data" method="post">
            <s:file name="fileupload" label="Select a file to upload" />
            <br/><br/>
            <s:submit value="Upload" />
        </s:form>
    </center>
</body>
</html>
