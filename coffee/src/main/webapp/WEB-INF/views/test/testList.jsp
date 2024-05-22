<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<h2>${mapper }</h2>
	<c:forEach var="sample" items="${list}">
		<p>번호 : ${test.num }</p>
		<p>제목 : <a href="${ path2}/test/getTest/do?num=${test.num }"> ${test.title }</a></p>
		<p>일시 : ${test.res }</p>
		<hr>
	</c:forEach>
	<a href="${path2 }/test/list.do">테스트 목록</a>
	<ul>
		<li><a href="${path2 }/test/testList.do">테스트 목록</a></li>
		<li><a href="${path2 }/test/getTest.do?num=1">테스트1</a></li>
		<li><a href="${path2 }/test/modTest.do?num=1">테스트 1수정</a></li>
		<li><a href="${path2 }/test/insTest.do">테스트 1수정</a></li>
		<li><a href="${path2 }/test/delTest.do?num=1">테스트 1수정</a></li>
	</ul>
</body>
</html>