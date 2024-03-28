<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gugudan.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">

<style type="text/css">

.btn {
  flex: 1 1 auto;
  margin: 10px;
  padding: 30px;
  text-align: center;
  text-transform: uppercase;
  transition: 0.5s;
  background-size: 200% auto;
  color: white;
 /* text-shadow: 0px 0px 10px rgba(0,0,0,0.2);*/
  box-shadow: 0 0 20px #eee;
  border-radius: 10px;
 }
 
 .btn:hover {
  background-position: right center; /* change the direction of the change here */
}

.btn {
  background-image: linear-gradient(to right, #f6d365 0%, #fda085 51%, #f6d365 100%);
}


</style>
</head>
<body>

<div>
	<h1>JSTL 코어(Core)를 활용한 구구단 출력</h1>
	<hr />
</div>

<div>
	<form action="">
		원하는 단 입력
		<input type="text" name="dan" class="txt"/>
		<br /><br />
		
		<button type="submit" class="btn">결과 확인</button>
	</form>
</div>
<br /><br />
<%-- 
<div>
	<!-- 결과 처리 -->
	<table style="text-align: center;" border="1">
		<c:if test="${!empty param.dan }">
				<tr>
					<td>
					${param.dan} 단
					</td>
				</tr>
				<c:forEach var="a" begin="1" end="9" step="1">
				<tr>
					<td>
						${param.dan} * ${a } = ${param.dan*a }
					</td>
				</tr>
				</c:forEach>
		</c:if>
	</table>
</div>

 --%>
 
 <div>
 	<!-- 결과 처리 -->
 	<!-- ${param.dan} -->
 	
 	<c:if test="${!empty param.dan }">
 	
 	<ul>
 		
 	</ul>
 		<c:forEach var="a" begin="1" end="9" step="1">
 		<li>
 			${param.dan} * ${a } = ${param.dan*a }
 		</li>
 		</c:forEach>
 	</c:if>
 </div>
</body>
</html>