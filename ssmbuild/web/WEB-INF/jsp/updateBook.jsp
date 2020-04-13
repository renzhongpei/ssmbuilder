
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <!--导入BootStrap-->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

    </div>
    <form action="${pageContext.request.contextPath}/book/updatingBook" method="post">

        <input type="hidden"name="bookID" value="${Qbooks.bookID}">
        <div class="form-group">
            <label>书籍名称</label>
            <input name = "bookName" class="form-control" value="${Qbooks.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input name = "bookCounts" class="form-control" value="${Qbooks.bookCounts}"required>
        </div>
        <div class="form-group">
            <label>书籍描述</label>
            <input name = "detail"  class="form-control" value="${Qbooks.detail}"required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>
</body>
</html>
