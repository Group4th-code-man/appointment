<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>显示所有商品</title>
</head>
<body>

    <table border="1">
        <tr><td>商品号</td><td>商品名</td><td>品牌</td>
            <td>价格</td><td>数量</td></tr>
        <c:forEach var="product" items="${products}" >
            <tr><td>${product.id}</td>
                <td>${product.pname}</td>
                <td>${product.brand}</td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
