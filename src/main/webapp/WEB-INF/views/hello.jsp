<%--
  Created by IntelliJ IDEA.
  User: zhou
  Date: 2020/6/26
  Time: 9:41
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
</head>
<body class="easyui-layout">
<div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>
<div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
<div data-options="region:'east',title:'East',split:true" style="width:100px;"></div>
<div data-options="region:'west',title:'West',split:true" style="width:100px;"></div>
<div data-options="region:'center',title:'center title'" iconCls="icon-save" style="padding:5px;background:#eee;"></div>
</body>
</html>
