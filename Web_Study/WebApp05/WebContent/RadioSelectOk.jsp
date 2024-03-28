<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%	
	// 스크립 릿 영역
	// 이전 페이지(RadioSelect.jsp)로부터 데이터 수신
	// → name
	
	// 한글 깨짐 방지 처리
	request.setCharacterEncoding("UTF-8");	// check~!!!
	
	String name = request.getParameter("name");
	String genderStr = request.getParameter("gender");
	String major = request.getParameter("major");
	
	String[] hobbyArr=request.getParameterValues("hobby");	// 선택상자... 다중 데이터 수신
	//-- 다중 선택이 가능한 선택상자일 경우...
	//   『getParameterValues()』로 데이터 수신
	//   → 배열 반환
	String hobby = "";
	
	// gender 수신 및 처리
	String gender = "";
	
	if(genderStr.equals("M"))
	{
		gender ="남자";
	}
	else if(genderStr.equals("F"))
	{
		gender ="여자";
	}
	else
	{
		gender = "확인불가";
	}
	
	if(hobbyArr != null)
	{	
		for (String item : hobbyArr)
			hobby += "[" + item  + "]";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RadioSelectOk.jsp</title>
</head>
<body>

<div>
	<h1>JSP를 이용한 데이터 송수신 실습 03</h1>
	<hr>
	<p>RadioSelect.jsp → RadioSelectOk.jsp</p>
</div>

<div>
	<h2>radio, select 데이터 수신 결과 확인</h2>
	<div>
		<p>이름: <%=name %></p>
		<p>성별: <%=gender %></p>
		<p>전공: <%=major %></p>
		<p>취미: <%=hobby %></p>
	</div>
</div>

</body>
</html>





















