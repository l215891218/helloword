<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hellwwwwwdsddddoddd ${msg}</h2>

<form:form action="/hell/shiro/login" modelAttribute="user">
<table>
    <tr>
        <td>用户名</td>
        <td><input name="loginName"/> </td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input name="loginPassword"/> </td>
    </tr>
    <tr>
        <td>记住我</td>
        <td><input name="remame"/> </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td><button type="submit">提交</button> </td>
    </tr>
    </form:form>

</table>




</body>
</html>
