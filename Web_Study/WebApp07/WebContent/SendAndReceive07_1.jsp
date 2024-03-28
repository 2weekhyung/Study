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
	
	String yOptions="";
	
   for(int year=(selectYear-10); year<=(selectYear+10); year++)
   {   
	   // 상황1. 페이지 최초 요청일 때
	   if(sYear==null && year==nowYear) // sYear 는 null / 현재 년도와 옵션이 같을 때 
	   {
	       yOptions += "<option value='"+year+"'selected='selected'>"+year+"</option>";
	   }
	   // 상황2. 페이지 최초 요청이 아닐 때
	   else if(sYear!=null && year==Integer.parseInt(sYear)) // sYear 는 null 아님 / 선택 년도와 옵션이 같을 때
	   {
	       yOptions += "<option value='"+year+"'selected='selected'>"+year+"</option>";
	   }
	   // 상황3. 나머지
	   else
	   {
	       yOptions += "<option value='"+year+"'>"+year+"</option>";   
	   }
   }
   
   String mOptions="";
   for(int month=1; month<=12; month++)	// 1 ~ 12
   {
	   if(sMonth==null && month==nowMonth)
	   {
		   mOptions += "<option value='"+month+"'selected='selected'>"+month+"</option>";
	   }
	   else if(sMonth != null && month==Integer.parseInt(sMonth))
	   {
		   mOptions += "<option value='"+month+"'selected='selected'>"+month+"</option>";
	   }
	   else
	   {
		   mOptions += "<option value='"+month+"'>"+month+"</option>"; 
	   }
   }
   
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
   
   
   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SendAndReceive07.jsp</title>

<style type="text/css">
	* {font-size: 42pt; font-family: 궁서;}
	table {width: 1000px; height: 600px;}
	td {text-align: center;}
	td.now{background-color: aqua; font-weight: bold;} /* 평일인 오늘 */
	td.nowSat{background-color: aqua; font-weight: bold; color: blue;} /* 토요일인 오늘 */
	td.nowSun{background-color: aqua; font-weight: bold; color: red;}
</style>

<script type="text/javascript">

	function formCalendar(obj)
	{
		// 유효성 검사가 필요할 경우 삽입할 수 있는 영역~!!!
		
		// ...
		
		obj.submit();
	}

</script>

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
	<form action="" method="get">
		<select id="year" name="year" onchange="formCalendar(this.form)">
		<%=yOptions %>
		</select> 년
		<select id="month" name="month" onchange="formCalendar(this.form)">
		<%=mOptions %>
		</select> 월
	</form>
</div>
<br>

<div>
	<%=calStr %>
</div>

</body>
</html>