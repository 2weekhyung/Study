<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("userName");
	String korStr = request.getParameter("kor");
	String engStr = request.getParameter("eng");
	String matStr = request.getParameter("mat");
	
	int kor = 0;
	int eng = 0;
	int mat = 0;
	int tot = 0;
	double avg = 0;
	
	try
	{
		kor = Integer.parseInt(korStr);
		eng = Integer.parseInt(engStr);
		mat = Integer.parseInt(matStr);
		
		tot = (kor + eng + mat);
		avg = tot/3.0;
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
<title>Receive01.jsp</title>

<style type="text/css">

	* {font-size: 20px;}
	th{background-color: Cadetblue; color: white;}
</style>

</head>
<body>

<div>
	<h1>데이터 송수신 실습02</h1>
	<hr>
</div>

<div>
	<%=name %>님 성적 처리가 완료되었습니다.<br>
	회원님의 점수는 국어:<%=kor %>, 영어:<%=eng %>, 수학:<%=mat %>점 입니다.
	총점은 <%=tot %>점, 평균은 <%=String.format("%.1f",avg)%>점 입니다.
</div>
<br><br>

<div>
	<table style="text-align: center; width: 250px;">
		<tr>
			<th>이름</th>
			<td><%=name %></td>
		</tr>
		<tr>
			<th>국어</th>
			<td><%=kor %></td>
		</tr>
		<tr>
			<th>영어</th>
			<td><%=eng %></td>
		</tr>
		<tr>
			<th>수학</th>
			<td><%=mat %></td>
		</tr>
		<tr>
			<th>총점</th>
			<td><%=tot %></td>
		</tr>
		<tr>
			<th>평균</th>
			<td><%=avg %></td>
		</tr>
	</table>
</div>

</body>
</html>