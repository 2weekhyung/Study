<%@ page contentType="text/html; charset=UTF-8"%>
<%	
	// 이전 페이지(TestSession02.jsp)로부터 넘어온 데이터 수신
	// → userId, userPwd

	request.setCharacterEncoding("UTF-8");

	String userId = request.getParameter("userId");
	String userPwd = request.getParameter("userPwd");

	String userName = (String)session.getAttribute("userName");
	String userTel = (String)session.getAttribute("userTel");
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TestSession03.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">

</head>
<body>

<div>
	<h1>이름, 전화번호, 아이디, 패스워드 출력</h1>
	<h2>(TestSession03.jsp)</h2>
	<hr>
</div>

<div>
이름: <%=userName %><br><br>
전화번호: <%=userTel %><br><br>
아이디: <%=userId %><br><br>
비밀번호: <%=userPwd %><br><br>
</div>

</body>
</html>