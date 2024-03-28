<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String danStr = request.getParameter("dan");

	String result = "";
	
	try
	{
		int dan = Integer.parseInt(danStr);
		
	
		for(int i=1; i<=9; i++)
		{
			result += danStr + " * " + i + " = " + (dan*i) + "<br>";
		}
		
		
	}	
	catch(Exception e)
	{	
		System.out.println(e.toString());
		
		getServletContext().log("오류 : "+ e.toString());
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receive05.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
<div>
	<h1>데이터 송수신 실습 05</h1>
	<hr>
</div>

<div>
	<h2>구구단 출력</h2>
	<div><%=result %></div>
</div>

</body>
</html>