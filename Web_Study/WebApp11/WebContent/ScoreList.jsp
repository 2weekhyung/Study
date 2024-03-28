<%@page import="com.test.ScoreDTO"%>
<%@page import="com.test.ScoreDAO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@page import="java.sql.Connection"%>
<%
	String str = "";
	
	ScoreDAO dao = null;
	
	String memberCount = "<span id='memberCount'>전체 인원 수 : ";
	
	try
	{
		dao = new ScoreDAO();
		
		memberCount += dao.count() + "명</span>";
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
		
		for (ScoreDTO member : dao.lists())
		{
			str += "<tr>";
			str += "<td class='contentTd'>" + member.getSid()+"</td>";
			str += "<td class='contentTd'>" + member.getName()+"</td>";
			str += "<td class='contentTd'>" + member.getKor()+"</td>";
			str += "<td class='contentTd'>" + member.getEng()+"</td>";
			str += "<td class='contentTd'>" + member.getMat()+"</td>";
			str += "<td class='contentTd'>" + member.getTot()+"</td>";
			str += "<td class='contentTd'>" + String.format("%.1f", member.getAvg())+"</td>";
			
			str += "</tr>";
		}
		
		str += "</table>";
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
	finally
	{
		try
		{	
			// 데이터 베이스 연결 종료
			dao.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	
	
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
	
	.btn {
  border: none;
  display: block;
  text-align: center;
  cursor: pointer;
  text-transform: uppercase;
  outline: none;
  overflow: hidden;
  position: relative;
  color: #fff;
  font-weight: 700;
  font-size: 15px;
  background-color: #222;
  padding: 17px 60px;
  margin: 0 auto;	
  box-shadow: 0 5px 15px rgba(0,0,0,0.20);
}

.btn span {
  position: relative; 
  z-index: 1;
  color: #fff;
}

.btn:after {
  content: "";
  position: absolute;
  left: 0;
  top: 0;
  height: 490%;
  width: 140%;
  background: #78c7d2;
  -webkit-transition: all .5s ease-in-out;
  transition: all .5s ease-in-out;
  -webkit-transform: translateX(-98%) translateY(-25%) rotate(45deg);
  transform: translateX(-98%) translateY(-25%) rotate(45deg);
}

.btn:hover:after {
  -webkit-transform: translateX(-9%) translateY(-25%) rotate(45deg);
  transform: translateX(-9%) translateY(-25%) rotate(45deg);
}
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
				<button type="submit" id="btnAdd" class="btn"><span>성적 추가</span></button>
			</td>
		</tr>
	</table>
	</form>
</div>

<br><br>

<div>
	<%=memberCount %>
	<%=str %>
</div>

</body>
</html>