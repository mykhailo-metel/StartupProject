<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>

<table border="1" cellpadding="0" cellspacing="0" width = "70%" align="center">
    <tbody>
    <tr>
        <td style="width:312px;">
            <p align="center">&nbsp;</p>
            <p align="center"><b>Startup Systems</b></p>
            <p align="center">&nbsp;</p>
        </td>
        <td style="width:151px;">
            <form action="/login" method="get">
                <p><b>Login: <input name="login" type="text"/></b></p>
                <p><b>Password: <input name="password" type="text"/></b></p>
                <button>Submit</button>
            </form>
        </td>
    </tr>
    </tbody>
</table>

<p>&nbsp;</p>
<table border="0.1" cellpadding="0" cellspacing="0" width = "70%" align="center">
    <tbody>
    <tr>
        <td style="width:156px;">
            <p align="center"><b>Поиск проектов</b></p>
        </td>
        <td style="width:156px;">
            <p align="center"><b>Подать предложение</b></p>
        </td>
        <td style="width:156px;">
            <p align="center"><b>Новые проекты</b></p>
        </td>
        <td style="width:156px;">
            <p align="center"><b>Личные данные</b></p>
        </td>
    </tr>
    </tbody>
</table>

<table border="2" width="70%" cellpadding="2" align = "center">
    <c:forEach var="usr" items="${map}">
        <tr>
            <td>${usr.login}</td>
            <td>${usr.login}</td>
            <td>${usr.firstName}</td>
            <td>${usr.lastName}</td>
        </tr>
    </c:forEach>
</table>
<p>&nbsp;</p>

</body>

</html>
