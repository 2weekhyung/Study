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
<title>MemberInsertForm.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<div>
	<h2>JSTL 코어(Core)를 활용한 회원 정보 입력</h2>
	<hr>
</div>
<!-- 
<div>
	<form action="MemberInsert.jsp" method="post">
	
		(이름, 전화번호, 주소) * 5명 분
		→ submit 액션 처리
		<table>
			<tr>
				<td>첫번째 회원 이름</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>첫번째 회원 전화번호</td>
				<td>
					<input type="text" name="tel">
				</td>
			</tr>
			<tr>
				<td>첫번째 회원 주소</td>
				<td>
					<input type="text" name="addr">
				</td>
			</tr>
			<tr>
				<td>두번째 회원 이름</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>두번째 회원 전화번호</td>
				<td>
					<input type="text" name="tel">
				</td>
			</tr>
			<tr>
				<td>두번째 회원 주소</td>
				<td>
					<input type="text" name="addr">
				</td>
			</tr>
			<tr>
				<td>세번째 회원 이름</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>세번째 회원 전화번호</td>
				<td>
					<input type="text" name="tel">
				</td>
			</tr>
			<tr>
				<td>세번째 회원 주소</td>
				<td>
					<input type="text" name="addr">
				</td>
			</tr>
			<tr>
				<td>네번째 회원 이름</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>네번째 회원 전화번호</td>
				<td>
					<input type="text" name="tel">
				</td>
			</tr>
			<tr>
				<td>네번째 회원 주소</td>
				<td>
					<input type="text" name="addr">
				</td>
			</tr>
			<tr>
				<td>다섯번째 회원 이름</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>다섯번째 회원 전화번호</td>
				<td>
					<input type="text" name="tel">
				</td>
			</tr>
			<tr>
				<td>다섯번째 회원 주소</td>
				<td>
					<input type="text" name="addr">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">전송</button>
				</td>
			</tr>
		</table>
		
	</form>	
</div>
 -->
 
 <div>
	<form action="MemberInsert.jsp">
	
		<!-- (이름, 전화번호, 주소) * 5명 분 -->
		<!-- → submit 액션 처리 -->
		<table class="table">
			<tr>
				<th>이름</th>
				<td>
					<!-- 
					<input type="text" name="name1">
					<input type="text" name="name2">
					<input type="text" name="name3">
					<input type="text" name="name4">
					<input type="text" name="name5">
					-->
					<c:set var="i" value="1"></c:set>
					<c:forEach var="a" begin="1" end="5" step="1">
						<%-- <input type="text" name="name${a }"/>--%>
						<input type="text" name="name${i }">
						<c:set var="i" value="${i+1 }"></c:set>
					</c:forEach>
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>
					<!-- 
					<input type="text" name="name1">
					<input type="text" name="name2">
					<input type="text" name="name3">
					<input type="text" name="name4">
					<input type="text" name="name5">
					-->
					<c:set var="i" value="1"></c:set>
					<c:forEach var="a" begin="1" end="5" step="1">
						<%-- <input type="text" name="name${a }"/>--%>
						<input type="text" name="tel${i }">
						<c:set var="i" value="${i+1 }"></c:set>
					</c:forEach>
				</td>
			</tr>
			<tr>
				<th>주소</th>
				<td>
					<!-- 
					<input type="text" name="name1">
					<input type="text" name="name2">
					<input type="text" name="name3">
					<input type="text" name="name4">
					<input type="text" name="name5">
					-->
					<c:set var="i" value="1"></c:set>
					<c:forEach var="a" begin="1" end="5" step="1">
						<%-- <input type="text" name="name${a }"/>--%>
						<input type="text" name="addr${i }">
						<c:set var="i" value="${i+1 }"></c:set>
					</c:forEach>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit" class="btn" style="width: 100%">입력</button>
			</tr>
		</table>
	
	</form>	
</div>
 
</body>
</html>