<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%	
	// 이전 페이지(SendAndReceive08.jsp)로부터 데이터 수신
	// → year, month
	String strYear = request.getParameter("year");
	String strMonth = request.getParameter("month");

	// Calendat 객체 생성
	Calendar cal = Calendar.getInstance();

	// 현재 년, 월, 일 확인
	int nowYear = cal.get(Calendar.YEAR);		//--2023
	int nowMonth = cal.get(Calendar.MONTH)+1;	//-- 12
	int nowDay= cal.get(Calendar.DATE);
	
	int year = nowYear;
	int month = nowMonth;
	
	if (strYear!=null)
		year = Integer.parseInt(strYear);
	if (strMonth!=null)
		month = Integer.parseInt(strMonth);
	
	// 이전과 이후 구성
	int preYear = year;
	int preMonth = month-1;
	
	if(preMonth < 1)
	{
		preYear = year - 1;
		preMonth = 12;
	}
	
	int nextYear = year;
	int nextMonth = month+1;
	
	if(nextMonth > 12)
	{
		nextYear = year+1;
		nextMonth = 1;
	}
	
	int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   
	   if(year%4==0 && year%100!=0 || year%400==0)
	   {
		   months[1] = 29;
	   }
	   
	   int nalsu;
	   
	   String[] weekNames = {"日", "月", "火", "水", "木", "金", "土"};
	   
	   nalsu = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
	   
	   for(int i=0; i<month-1; i++)
		   nalsu += months[i];
	   
	   nalsu++;
	   
	   int week = nalsu%7;
	   int lastDay = months[month-1];
	
	String calStr = "";
	
	calStr += "<tr>";
	   for (int i=1; i<=week; i++)
		   calStr += "<td></td>";
   
   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SendAndReceive08.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">

<style type="text/css">

	a {text-decoration: none}

</style>
</head>
<body>

<!-- 
	○ 데이터 송수신 실습 08
	
	   - 달력을 출력하는 JSP 페이지를 구성한다.
	   - 전송한 내용을 수신해서 출력해주는 형태의 단독 페이지로 구성한다.
	   - submit 버튼 없이 이벤트 처리를 한다.
	   
	   ◀ 2023 년 12 월 ▶
	   
	   -----------------------------------------
	   -----------------------------------------
	   -----------------------------------------
	   -----------------------------------------
	   -----------------------------------------
	   
	   - 『◀』 이나 『▶ 』클릭 시
	      해당 년 월의 달력을 출력해주는 형태의 페이지로 구현한다.
	      
	   - 사용자 최초 요청 주소는
	     http://localhost:3306/WebApp07/SendAndReceive08.jsp  로 한다.
	     
	 ○ SendAndReceive08.jsp

 -->
 
<div>
	<h1>데이터 송수신 실습 08</h1>
	<hr>
</div>


<div>
	<form>
		<table>
			<tr>
				<td>
					<a href="SendAndReceive08_1.jsp?year=<%=preYear %>&month=<%=preMonth%>">◀</a>
					<span><%=year %>년 <%=month %>월</span>
					<a href="SendAndReceive08_1.jsp?year=<%=nextYear %>&month=<%=nextMonth%>">▶</a>
				</td>
			</tr>
		</table>
		<br>
		
		<table>
			<tr>
				<th style="background-color: #e6e4e6; color: red;">일요일</th>
				<th style="background-color: #e6e4e6;">월요일</th>
				<th style="background-color: #e6e4e6;">화요일</th>
				<th style="background-color: #e6e4e6;">수요일</th>
				<th style="background-color: #e6e4e6;">목요일</th>
				<th style="background-color: #e6e4e6;">금요일</th>
				<th style="background-color: #e6e4e6; color: blue;">토요일</th>
			</tr>
			<%=calStr %>
		</table>
	</form>
</div>
 	

</body>
</html>