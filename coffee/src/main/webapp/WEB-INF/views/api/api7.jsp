<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상점 등록</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
	<div class="form">
	<input type="text" name="name" class="name" placeholder="이름 입력" /><br><br>
		<input type="number" name="stdNumber" class="num" placeholder="번호 입력" /><br><br>
		<input type="number" name="age" class="age" placeholder="나이 입력" /><br><br>
		<button type="button" class="btn1">등록</button>
	</div>
	<div class="form">
	<input type="text" name="name" class="name" placeholder="이름 입력" /><br><br>
		<input type="number" name="stdNumber" class="num" placeholder="번호 입력" /><br><br>
		<input type="number" name="age" class="age" placeholder="나이 입력" /><br><br>
		<button type="button" class="btn1">등록</button>
	</div>
	<div class="form">
	<input type="text" name="name" class="name" placeholder="이름 입력" /><br><br>
		<input type="number" name="stdNumber" class="num" placeholder="번호 입력" /><br><br>
		<input type="number" name="age" class="age" placeholder="나이 입력" /><br><br>
		<button type="button" id="btn1">등록</button>
	</div>
	<script>
	$(document).ready(function(){
		$("#btn1").click(function(){
			var student = { name:"아무개",stdNumber:0, age:0 };
			var stds = [student, student, student];
			
			$.each($(".foam"),function(index,value){
				var  name = $(this).find(".name").val();
				var  stdNumber = $(this).find(".num").val();
				var  age = $(this).find(".age").val();
				student = {stdnumber:num, name:name, age:age};
				stds[index] = student;
			});
			$.ajax({
				type:"post",
				url:"${path2}/api/api7.do",
				data:JSON.stringify(stds),
				dataType:"json",
			    contentType: 'application/json; charset=utf-8', 
				success:function(data) { }
			});
		});
	});
	</script>
</body>
</html>