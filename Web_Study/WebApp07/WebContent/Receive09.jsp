<%@ page contentType="text/html; charset=UTF-8"%>
<%
//이전 페이지로(Send10_re.jsp 또는 Send10_for.jsp)부터 데이터(userName, message) 수신

	request.setCharacterEncoding("UTF-8");

	String userName = request.getParameter("userName");
	
	
	// getAttribute("") 가 반환하는 것은 Object(객체임)
	// 따라서 String 으로 다운캐스팅 해서 변수에 담자
	String message = (String)request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receive09.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<div>
	<h1>데이터 송수신 실습 09</h1>
	<hr>
</div>

<div>
	<h2>최종 수신 페이지(Receive09.jsp)</h2>
</div>

<div>
	<p>이름 : <%=userName %></p>
	<p>내용 : <%=message %>
</div>

</body>
</html>