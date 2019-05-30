<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원동록</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<header>쇼핑몰 회원관리 ver 1.0</header>
	<nav class="menu">
		<a href="register.jsp">회원등록</a>
		<a href="list.jsp">회원목록조회/수정</a>
		<a href="sales.jsp">회원매출조회</a>
		<a href="index.jsp">홈으로</a>
	</nav>
	<footer>
		<span>HRDKOREA Copyright@2016 All nights reserved, Human Resources Development
		 Service of Korea.</span>
	</footer>
	<h3>홈쇼핑 회원 등록</h3>
	<form method="post" id="member">
	<table>
	<tr>
	<th><label>회원번호(자동발생)</label></th>
	<td><input type="text"></td>
	</tr>
	<tr>
	<th><label>회원성명</label></th>
	<td><input type="text" id="name"></td>
	</tr>
	<tr>
	<th><label>회원전화</label></th>
	<td><input type="text"></td>
	</tr>
	<tr>
	<th><label>회원주소</label></th>
	<td><input type="text"></td>
	</tr>
	<tr>
	<th><label>가입일자</label></th>
	<td><input type="text"></td>
	</tr>
	<tr>
	<th><label>고객등급[A:VIP,B:일반,C:직원]</label></th>
	<td><input type="text"></td>
	<tr>
	<th><label>도시코드</label></th>
	<td><input type="text"></td>
	</tr>
	<tr>
	<td colspan="2">
	<input type="submit" value="등 록" />
	<input type="button" id="list" value="조 회" />
	</td>
	</tr>
	</table>
	</form>
	
	<script>
	document.getElementById("member").addEventListener("submit",function(e){
		var name = document.getElementById("name")
		if(name.value.trim().length < 1){
			alert("회원성명이 입력되지 않았습니다.")
			name.focus()
			e.preventDefault();
		}	
	});
	doucument.getElementById("list").addEventListener("clcik",function(e){
		alert("list")
	});
	</script>
	
</body>
</html>