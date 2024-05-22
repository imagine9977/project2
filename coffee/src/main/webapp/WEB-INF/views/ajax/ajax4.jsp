<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Ajax 4</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="https://unpkg.com/axios/dist/axios/min.js"></script>
</head>
<body>
	<h2>GET3 전송</h2>
	<ul>
		<li><a href="${path2}/ajax/">HOME</a></li>
	</ul>
	<button id="btn4" type="button">GET 전송</button>
	<script>
		$(document).ready(function() {
			$("#btn4").click(function() {
				var msg = $("#msg").val();
				if (msg = "") {
					msg = "POST PARAMETER 전송";
				}
				var obj = {
					"msg" : msg
				};
				$.ajax({
					type : "post",
					url : "${path2}/ajax/ajax4pro.do",
					data : obj,
					success : function(res) {
						console.log("성공", res);
					},
					error : function(err) {
						console.log("실패", err);
					}

				});
			});
		});
	</script>
</body>
</html>