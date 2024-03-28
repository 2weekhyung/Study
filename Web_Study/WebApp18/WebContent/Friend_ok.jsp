<%@ page contentType="text/html; charset=UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="ob" class="com.test.FriendDTO"></jsp:useBean>
<jsp:setProperty property="*" name="ob"/>

<!-- 번복문 필요(다중 선택으로 넘어온 결과값을 출력하기 위한 처리) -->
<%
	String result = "";
	
	if(ob.getType() != null)
	{
		for(String type : ob.getType())
		{
			result += "[" + type + "]";
		}
	}
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Friend_ok.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>

<div>
	<h1>등록 수신결과 확인</h1>
	<hr />
</div>

<body>

	<h3>이름: <%=ob.getUserName() %></h3>
	<h3>나이: <%=ob.getAge() %></h3>
	<h3>성별 : <%=ob.getGender() %></h3>
	<h3>이상형 : <%=result %></h3>

</body>
</html>