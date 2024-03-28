<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String su1Str = request.getParameter("su1");
	String su2Str = request.getParameter("su2");
	
	int su1 = 0;
	int su2 = 0;
	int n = 1;
	
	try
	{
		su1 = Integer.parseInt(su1Str);
		su2 = Integer.parseInt(su2Str);
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
<title>TableOk.jsp</title>

<link rel="stylesheet" type="text/css" href="css/main.css">

<style type="text/css">
	* {color: white; font-weight: bold; margin: 4.5cm;}
	table {width: 500px; height: 300px; text-align: center; background-color: cornflowerBlue;}
</style>

</head>
<body>

<div>
	<table border="1">
		<%
			for(int i = 1; i<=su2; i++)
			{
		%>
				<tr><%
					for(int j=1; j<=su1; j++)
					{%>
					<td><%=n++ %></td>
				  <%}
					%></tr>		
		<% 
			}		
		%>
		
	</table>

</div>

</body>
</html>