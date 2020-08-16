<%--
  Created by IntelliJ IDEA.
  User: zhou
  Date: 2020/8/16
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();
   String basePath = request.getScheme() + "://" +
           request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<html>
<head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="resources/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="resources/easyui/jquery.easyui.min.js"></script>

    <link rel="stylesheet" type="text/css" href="resources/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="resources/easyui/themes/icon.css">

    <title>Title</title>
    <script type="text/javascript">
        $(function(){
            $('#dd').dialog({
                modal:true
            });
        });
    </script>
</head>
<body>
<h2>testtset</h2>
    <div id="dd" title="My Dialog" style="width:400px;height:200px;">asdfasdf</div>
</body>
</html>
