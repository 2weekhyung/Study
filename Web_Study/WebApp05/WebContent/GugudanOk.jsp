<%@ page contentType="text/html; charset=UTF-8"%>
<%	
	/*
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
	*/
	
	// 스크립릿 영역
	
	// 이전 페이지(Gugudan.jsp)로부터 데이터 수신 → dan
	
	String danStr = request.getParameter("dan");
	
	int n = 0;
	
	try
	{
		n = Integer.parseInt(danStr);
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
<title>GugudanOk.jsp</title>
</head>
<body>

<div>
	<h1>JSP를 이용한 데이터 송수신 실습 02</h1>
	<hr>
	<p>Gugudan.jsp → GugudanOk.jsp</p>
</div>

<!-- html 주석문 -->
<%-- jsp 주석문 --%>


<%--
	for(int i=1; i<=9; i++)
	{
		out.print(n + " * " + i + " = " + (n*i) + "<br>");
	}
--%>

<%
	for(int i=1; i<=9; i++)
	{
%>
		<%=n %> * <%=i %> = <%=(n*i) %><br>
<% 
	}
%>



</body>
</html>