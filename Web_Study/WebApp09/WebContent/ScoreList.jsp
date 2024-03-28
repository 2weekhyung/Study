<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.util.DBConn"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String str = "";

	Connection conn = DBConn.getConnection();
	
	String sql = "SELECT SID, NAME, KOR, ENG, MAT, (KOR+ENG+MAT) AS TOT, (KOR+ENG+MAT)/3 AS AVG FROM TBL_SCORE ORDER BY SID";
	
	Statement stmt = conn.createStatement();
	
	ResultSet rs = stmt.executeQuery(sql);
	double avg = 0;
	
	str += "<table class='table'>";
	str += "<tr>";
	str += "<th id='sidTitle'>번호</th>";
	str += "<th id='nameTitle'>이름</th>";
	str += "<th id='korTitle'>국어점수</th>";
	str += "<th id='engTitle'>영어점수</th>";
	str += "<th id='matTitle'>수학점수</th>";
	str += "<th id='totTitle'>총점</th>";
	str += "<th id='avgTitle'>평균</th>";
	str += "</tr>";
	
	while (rs.next())
	{
		str += "<tr>";
		str += "<td class='contentTd'>" + rs.getString("SID")+"</td>";
		str += "<td class='contentTd'>" + rs.getString("NAME")+"</td>";
		str += "<td class='contentTd'>" + rs.getString("KOR")+"</td>";
		str += "<td class='contentTd'>" + rs.getString("ENG")+"</td>";
		str += "<td class='contentTd'>" + rs.getString("MAT")+"</td>";
		str += "<td class='contentTd'>" + rs.getString("TOT")+"</td>";
		//str += "<td class='contentTd'>" + rs.getString("AVG")+"</td>";
		str += String.format("<td class='contentTd'> %.1f </td>", Double.parseDouble(rs.getString("AVG")));
		//Double.parseDouble(rs.getString("AVG"));  
		str += "</tr>";
	}
	
	str += "</table>";
	
	rs.close();
	stmt.close();
	DBConn.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ScoreList.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">

<style type="text/css">
	#sidTitle {width: 50px;}
	#nameTitle {width: 100px;}
	#korTitle {width: 100px;}
	#engTitle {width: 100px;}
	#matTitle {width: 100px;}
	#totTitle {width: 100px;}
	#avgTitle {width: 100px;}
	.errMsg{font-size: small; color: red; display: none}
	.contentTd {text-align: center;}
</style>

<script type="text/javascript">

	function formCheck()
	{
		//alert("함수호출 확인~!!!")
		
		var uName = document.getElementById("userName");
		var nameErr = document.getElementById("nameErr");
		
		var kor = document.getElementById("kor");
		var korErr = document.getElementById("korErr");
		
		var eng = document.getElementById("eng");
		var engErr = document.getElementById("engErr");
		
		var mat = document.getElementById("mat");
		var matErr = document.getElementById("matErr");
		
		nameErr.style.display = "none";
		korErr.style.display = "none";
		engErr.style.display = "none";
		matErr.style.display = "none";
		
		if(uName.value == "")
		{
			nameErr.style.display = "inline";
			return false;
		}
		
		if(Number(kor.value) > 100 || Number(kor.value) < 0 || kor.value == "")
		{
			korErr.style.display = "inline";
			return false;
		}
		
		if(Number(eng.value) > 100 || Number(eng.value) < 0 || eng.value == "")
		{
			engErr.style.display = "inline";
			return false;
		}
		
		if(Number(mat.value) > 100 || Number(mat.value) < 0 || mat.value == "")
		{
			matErr.style.display = "inline";
			return false;
		}
		
		return true;
	}

</script>
</head>
<body>

<!--
	○ WebApp 09
	
	   - 여러 명의 이름, 국어점수, 영어점수, 수학점수를 입력받아
	     총점과 평균을 계산하여 리스트를 출력해줄수 있는 프로그램을 구현한다.
	   - 리스트 출력시 번호 오름차순 정렬하여 출력할 수 있도록 한다.
	   - 데이터베이스 연동하여 처리한다.
	     (TBL_SCORE, SCORESEQ 활용)
	   - 즉, 성적 처리 프로그램을 데이터베이스 연동하여
	     JSP 로 구성할 수 있도록 한다.
	     
	   데이터 베이스 연결 및 데이터 처리
	   ------------------------------------------------------------------------------------------------------
	   성적 처리
	   
	   이름(*)	[textbox] → 이름 입력 확인
	   국어점수 [textbox] → 0 ~ 100 사이의 정수가 입력되었는지 확인
	   영어점수 [textbox] → 0 ~ 100 사이의 정수가 입력되었는지 확인
	   수학점수 [textbox] → 0 ~ 100 사이의 정수가 입력되었는지 확인
	   
	   <성적 추가>	→ button
	   
	   번호		이름		국어점수		영어점수		수학점수		총점		평균
	   1		임하성			90				80				70			xxx			xx.x
	   2		이윤수			80				70				60			xxx			xx.x
	   
	○ WebApp09_scott.sql
	   ScoreList.jsp
	   ScoreInser.jsp
	   com.util.DBConn.java
	   ------------------------------------------------------------------------------------------------------
-->

<div>
	<h1>성적 처리</h1>
	<hr>
</div>

<div>
	<form action="ScoreInsert.jsp" method="post" onsubmit="return formCheck()">
	<table>
		<tr>
			<th>이름(*)</th>
			<td>
				<input type="text" id="userName" name="userName" class="txt">
				<span class="errMsg" id="nameErr">이름을 입력해야 합니다.</span>
			</td>
		</tr>
		<tr>
			<th>국어점수</th>
			<td>
				<input type="text" id="kor" name="kor" class="txt">
				<span class="errMsg" id="korErr">1~100 사이의 점수를 입력해 주세요.</span>
			</td>
		</tr>
		<tr>
			<th>영어점수</th>
			<td>
				<input type="text" id="eng" name="eng" class="txt">
				<span class="errMsg" id="engErr">1~100 사이의 점수를 입력해 주세요.</span>
			</td>
		</tr>
		<tr>
			<th>수학점수</th>
			<td>
				<input type="text" id="mat" name="mat" class="txt">
				<span class="errMsg" id="matErr">1~100 사이의 점수를 입력해 주세요.</span>
			</td>
		</tr>
		<tr>
			<td>
				<button type="submit" id="btnAdd" class="btn control">성적 추가</button>
			</td>
		</tr>
	</table>
	</form>
</div>

<br><br>

<div>
	<%=str %>
</div>

</body>
</html>