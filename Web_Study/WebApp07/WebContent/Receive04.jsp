<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String uId = "";

	String uPwd = "";
	String uName = "";
	String uTel = "";
	String uGender = "";
	String uCity ="";
	String [] uMajor = request.getParameterValues("userSubject");
	String major = "";

	try
	{
		
		uId = request.getParameter("userId");	
		uPwd = request.getParameter("userPw");
		uName = request.getParameter("userName");
		uGender = request.getParameter("userGender");
		uTel = request.getParameter("userTel");
		uCity = request.getParameter("userCity");
		
		if( uMajor != null)
		{
			for(int i =0; i<uMajor.length; i++)
				major += "[ " + uMajor[i] + " ]" + ""; 	
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receive04.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<div>
	<h1>데이터 송수신 실습04</h1>
	<hr>
</div>

<div>
	<h2> 가입 승인 내역 </h2>
	<p>아이디 : <%=uId  %></p>
	<p>비밀번호 : <%=uPwd  %></p>
	<p>이름 : <%=uName  %></p>
	<p>전화번호 : <%=uTel  %></p>
	<p>성별 : <%=uGender  %></p>
	<p>지역 : <%=uCity  %></p>
	<p>수강과목 : <%=major  %></p>
</div>

</body>
</html>