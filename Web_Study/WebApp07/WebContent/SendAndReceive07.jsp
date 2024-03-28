<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	Calendar cal = Calendar.getInstance();

	String yearString = request.getParameter("year");
	String monthString = request.getParameter("month");
	
	int nowYear = cal.get(Calendar.YEAR);
	int nowMonth = cal.get(Calendar.MONTH)+1;
	
	if(yearString == null && monthString == null)
	{
		yearString = String.valueOf(nowYear);
		monthString = String.valueOf(nowMonth);
	}
	
	int year = Integer.parseInt(yearString);
	int month = Integer.parseInt(monthString);

	String yearOption = "";
	
	for(int i = (year-10); i <= year+10; i++)
	{	
		yearOption += "<option value='"+i+"'>"+i+"</option>";
		
		// yearOption += "<option value='"+(i)+"'selected='selected'>"+(i)+"</option>";
	}
	
	String monthOption = "";
	for(int i = 1; i <= 12; i ++)
	{
		monthOption += "<option value='"+i+"'>"+i+"</option>";
	}

	cal.set(year, month-1, 1);
	
	int yoil = cal.get(Calendar.DAY_OF_WEEK);
	int lastDay = cal.getActualMaximum(Calendar.DATE);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SendAndReceive07.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<!-- 
	○ 데이터 송수신 실습 07
	
	   - 달력을 출력하는 JSP 페이지를 구성한다.
	   - 페이지 레이아웃은 연도와 월을 입력받아 
	     화면에 출력해주는 형태의 페이지로 구성한다.
	   - 단, submit 버튼 없이 이벤트 처리를 할 수 있도록 한다.
	   - 전송한 내용을 스스로 수신해서 출력해주는 형태의 페이지로 구성한다.
	   - 연도 선택 기본 구성은 현재의 연도를 기준으로
	     이전 10년, 이후 10년 으로 구성한다.
	     (기본적으로 만년달력 형태로 구성하는데
	      현재의 연, 월은 달력 객체로부터 확인할 수 있도록 한다.)
	   - 월 선택 기본 구성은 1월 부터 12월 까지로 구성한다.
	   
	       2013
	         :
	     [ 2023 ▼] 년 [ 12 ▼] 월
	         :
	       2033
	       
	     -------------------------
	     -------------------------
	     -------------------------
	     -------------------------
	     
	  - 연도 select 나 월 select 의 내용이 변화되면
	    해당 연 월의 달력을 출력해주는 형태의 페이지로 구성한다.
	    
	  - 사용자 최초 요청 주소는
	    http://localhost:3306/WebApp07/SendAndReceive07.jsp 로 한다.
	         
	○ SendAndReceive07.jsp
	
-->

<div>
	<h1>데이터 송수신 실습 07</h1>
	<hr>
</div>


<div>
	<form action="" method="post">
		<select id="year" name="year" onchange="submit()">
		<%=yearOption %>
		</select> 년
		
		<select id="month" name="month" onchange="submit()">
		<%=monthOption %>	
		</select> 월
	</form>
</div>
<br>

<div>
	<table border="1" id="calendarTbl">
			<tr>
				<th>일</th>
				<th>월</th>
				<th>화</th>
				<th>수</th>
				<th>목</th>
				<th>금</th>
				<th>토</th>
			</tr>
			<tr>
			<%for(int i = 1; i< yoil; i++)
			{ %>
				<td></td>
			<%} %>
			<%
			for(int i = 1; i<=lastDay; i++)
			{
		%>
				<td><%=i %></td>
				<%yoil++; if(yoil%7== 1){%> <tr></tr><%}%>
		<% 
			}		
		%>
		</tr>
		</table>
</div>

</body>
</html>