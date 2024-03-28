<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%	
	// 자기 자신 페이지(SendAndReceive07.jsp)로부터 데이터 수신
	// → year, month
	String sYear = request.getParameter("year");
	String sMonth = request.getParameter("month");

	// Calendat 객체 생성
	Calendar cal = Calendar.getInstance();

	// 현재 년, 월, 일 확인
	int nowYear = cal.get(Calendar.YEAR);		//--2023
	int nowMonth = cal.get(Calendar.MONTH)+1;	//-- 12
	int nowDay= cal.get(Calendar.DATE);
	
	if(sYear == null && sMonth == null)
	{
		sYear = String.valueOf(nowYear);
		sMonth = String.valueOf(nowMonth);
	}
	
	// 표시할 달력의 년, 월 구성 → 페이지 최초 요청을 감안한 코드
	int selectYear = nowYear;
	int selectMonth = nowMonth;
	
	// 페이지에 대한 요청이 최초 요청이 아닐 경우
	// → Line 6 ~ 7 을 통해 수신한 데이터로 표시할 달력의 년, 월 구성
	if(sYear != null || sMonth != null)
	{
		selectYear = Integer.parseInt(sYear);
		selectMonth = Integer.parseInt(sMonth);
	}
	
	// 테스트
	//out.print("<h1>selectYear : " + selectYear + "</h1>");
	//out.print("<h1>selectMonth : " + selectMonth + "</h1>");
	
	// 확인한 날짜로 년도 select option 구성
	
   
   int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   if(selectYear%4==0 && selectYear%100!=0 || selectYear%400==0)
   {
	   months[1] = 29;
   }
   
   int nalsu;
   
   String[] weekNames = {"日", "月", "火", "水", "木", "金", "土"};
   
   nalsu = (selectYear-1)*365 + (selectYear-1)/4 - (selectYear-1)/100 + (selectYear-1)/400;
   
   for(int i=0; i<selectMonth-1; i++)
	   nalsu += months[i];
   
   nalsu++;
   
   int week = nalsu%7;
   int lastDay = months[selectMonth-1];
   
   // 달력 그리기 -------------------------------------------------------
   String calStr = "";
   calStr += "<table border='1'>"; //- start table
   
   // 요일 이름 발생
   calStr += "<tr>";
   for(int i=0; i<weekNames.length; i++)
   {
      if(i==0)// 일요일 빨간색
      {
         calStr += "<th style='color:red;'>" + weekNames[i] + "</th>";
      }
      else if(i==6)// 토요일 파란색
      {
         calStr += "<th style='color:blue;'>" + weekNames[i] + "</th>";
      }
      else // 평일
      {
         calStr += "<th>" + weekNames[i] + "</th>";
      }
   }
   
   calStr += "</tr>";
   
   // 빈 칸 공 백 td 발생
   calStr += "<tr>";
   for (int i=1; i<=week; i++)
	   calStr += "<td></td>";
   
   // 날짜 td 발생
    for(int i =1; i<=lastDay; i++)
   {
      week++;

      //토요일인 오늘
      if(selectYear ==nowYear && selectMonth==nowMonth && i ==nowDay&& week%7==0)
      {
         calStr += "<td class='nowSat' >"+i+"</td>";
      }
    //일요일 오늘
      else if(selectYear ==nowYear && selectMonth==nowMonth && i ==nowDay&& week%7==1)
      {
         calStr += "<td class='nowSun' >"+i+"</td>";
      }
    //평일인 오늘
      else if(selectYear ==nowYear && selectMonth==nowMonth && i ==nowDay)
      {
         calStr += "<td class='now' >"+i+"</td>";
      }
      //오늘이 아닌 토요일
      else if(week%7==0)
      {
         calStr += "<td class='sat' style='color:blue'>"+i+"</td>";
      }
    //오늘이 아닌 일요일
      else if(week%7==1)
      {
         calStr += "<td class='sun' style='color:red'>"+i+"</td>";
      }
    //오늘이 아닌 평일
      else
      {
         calStr += "<td>"+i+"</td>";
      }
    //일요일을 찍고 개행하는 곳
      if(week%7 ==0)
         calStr += "</tr><tr>";// 닫고 여는 코드가 들어가야함
   }
   
   // 빈 칸 공백 td 발생
   for (int i=0; i<=week; i++, week++)
   {	
	   if(week%7==0)
	   {
		   break;
	   }
	   
	   calStr += "<td></td>";
   }
   
   calStr += "</table>"; //- end table
 
   
  int y = selectYear;
  int m = selectMonth-1;
  
  if(m == 0)
  {
	  y -= 1;
	  m = 12;
  }
  
  int y2 = selectYear;
  int m2 = selectMonth+1;
  
  if(m2 == 13)
  {
	  y2 += 1;
	  m2 = 1;
  }
   
   
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
	<form action="" method="get" name="calendar" class="client">
		<a class="atag" href="http://localhost:3306/WebApp07/SendAndReceive08.jsp?year=<%=y %>&month=<%=m %>" onclick="submit()">◀</a>
		<input type="text" id="year" name="year" readonly="readonly" value="<%=sYear %>" class="inputtag">
		년
		<input type="text" id="month" name="month" readonly="readonly" value="<%=sMonth %>" class="inputtag">
		월
		<a class="atag" href="http://localhost:3306/WebApp07/SendAndReceive08.jsp?year=<%=y2 %>&month=<%=m2 %>" onclick="submit()">▶</a>
		<br>
	</form>
</div>

<div>
<%=calStr %>
</div>
 	

</body>
</html>