o<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2017/3/7
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="zh_CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 添加底层设备</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

+++    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>SpringMVC 添加底层设备</h1>
    <hr/>




    <form:form action="/bottomdev/bottomdevinfo/addP" method="post" commandName="bottomdev" role="form">
        <div class="form-group">
            <label for="installTime">安装时间</label>
            <input type="date" class="form-control" id="installTime" name="installTime" />
        </div>
        <div class="form-group">
            <label for="devname">设备名称</label>
            <input type="text" class="form-control" id="devname" name="devname" placeholder="Enter devname:"/>
        </div>
        <div class="form-group">
            <label for="roominfo">房间信息</label>
            <input type="text" class="form-control" id="roominfo" name="roominfo" placeholder="Enter roominfo:"/>
        </div>
        <div class="form-group">
            <label for="user">使用者</label>
            <input type="text" class="form-control" id="user" name="user" placeholder="Enter User:"/>
        </div>
        <div class="form-group">
            <label for="coordinate">房间内坐标</label>
            <input type="text" class="form-control" id="coordinate" name="" placeholder="Enter coordinate:"/>
        </div>
        <div class="form-group">
            <label for="installPerson">安装人员</label>
            <input type="text" class="form-control" id="installPerson" name="installPerson" placeholder="Enter installPerson:"/>
        </div>
        <div class="form-group">
            <label for="wetherNormal">是否正常</label>
            <input type="text" class="form-control" id="wetherNormal" name="wetherNormal" placeholder="Enter wetherNormal:"/>
        </div>
        <div class="form-group">
            <label for="wHeartlostTooffline">是否由于心跳包丢失导致下线</label>
            <input type="text" class="form-control" id="wHeartlostTooffline" name="wHeartlostTooffline" placeholder="Enter wHeartlostTooffline:"/>
        </div>
        <div class="form-group">
            <label for="wetherOnline">是否在线</label>
            <input type="text" class="form-control" id="wetherOnline" name="wetherOnline" placeholder="Enter wetherOnline:"/>
        </div>
        <div class="form-group">
            <label for="repower">剩余电量</label>
            <input type="text" class="form-control" id="repower" name="repower" placeholder="Enter repower:"/>
        </div>
        <div class="form-group">
            <label for="detailedInfoLinks">设备设计细节链接</label>
            <input type="text" class="form-control" id="detailedInfoLinks" name="detailedInfoLinks" placeholder="Enter detailedInfoLinks:"/>
        </div>
        <div class="form-group">
            <label for="orderAttime">当前命令</label>
            <input type="text" class="form-control" id="orderAttime" name="orderAttime" placeholder="Enter orderAttime:"/>
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>





<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


</body>
</html>
