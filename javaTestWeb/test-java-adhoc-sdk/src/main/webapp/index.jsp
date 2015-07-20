<%@ page import="com.appadhoc.javasdk.AdhocSdk" %>
<%--
  Created by IntelliJ IDEA.
  User: dongyuangui
  Date: 15/7/15
  Time: 下午2:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String client_id = AdhocSdk.getInstance().generateClientId();
session.setAttribute("client_id",client_id);
%>
<html>
<head>
    <title>Test appadhoc - java sdk</title>
</head>
<body>
<br/>
<p>adhoc java sdk demo Test</p>
<br/>
<a href="/getflag">获取flag</a>
<br/>
<br/>

<a href="/increament">increament 统计</a>

<br/>


</body>
</html>