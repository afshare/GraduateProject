<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2017/3/6
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html lang="zh-CN">
<head>
    <meta charest="utf-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE-edge">
    <meta name="viewport" content="with=device-width.initial-scale=1">
    <!--上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 底层设备管理</title>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<div class="content">
    <h1>SpringMVC 实验室信息管理系统-底层设备管理</h1>
    <hr/>
    <h3>所有底层设备<a hreaf="/bottomdev/bottomdevinfo/add" type="button" class="btn btn-primary btn-sm">添加</a></h3>

    <!--如果用户列表为空 -->
    <c:if test="${empty bottomDevList}">
        <div class="alert alert-warning" role="alert">
            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>底层设备表为空，请<a hreaf="/bottomdev/bottomdevinfo/add" type="button" class="btn btn-primary btn-sm">添加</a>
        </div>
    </c:if>

    <!-- 如果列表非空 -->
    <c:if test="${!empty bottomDevList}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>ID</th>
                <th>设备名称</th>
                <th>房间信息</th>
                <th>使用者</th>
                <th>在房间的坐标</th>
                <th>安装人员</th>
                <th>安装时间</th>
                <th>第一次使用时间</th>
                <th>是否正常</th>
                <th>是否在线</th>
                <th>是否由于心跳包丢失下线</th>
                <th>剩余电量</th>
                <th>详细信息链接</th>
                <th>当前命令</th>
            </tr>

            <c:forEach items="${bottomDevList}" var="bottomDev">
                <tr>
                    <td>${bottomDev.id}</td>
                    <td>${bottomDev.devname}</td>
                    <td>${bottomDev.roominfo}</td>
                    <td>${bottomDev.user}</td>
                    <td>${bottomDev.coordinate}</td>
                    <td>${bottomDev.installPerson}</td>
                    <td>${bottomDev.installTime}</td>
                    <td>${bottomDev.firstrunTime}</td>
                    <td>${bottomDev.wetherNormal}</td>
                    <td>${bottomDev.wetherOnline}</td>
                    <td>${bottomDev.wHeartlostTooffline}</td>
                    <td>${bottomDev.repower}</td>
                    <td>
                        <a href="${bottomDev.detailedInfoLinks}" type="button" class="btn btn-sm btn-success">${bottomDev.devname}的详细信息</a>
                    </td>
                    <td>${bottomDev.orderAttime}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>




<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>






</body>
</html>
