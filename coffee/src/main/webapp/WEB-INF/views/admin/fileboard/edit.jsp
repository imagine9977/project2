<%@ page language="java" contentType="text/html charset=UTF8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="path2" value="${pageContext.servletContext.contextPath }" />
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>자료실 글 수정</title>
	<jsp:include page="../../include/head.jsp"></jsp:include>
</head>
<body>
<div class="full-wrap">
    <!-- 헤더 부분 인클루드 -->
    <header id="hd">
    	<div class="container">
    		<jsp:include page="../../include/header.jsp"></jsp:include>
    	</div>
    </header>
    <main id="contents" class="contents">
    	<div id="breadcrumb" class="container breadcrumb-wrap clr-fix" style="height:60px; line-height:60px;">
	    	<nav class="breadcrumb" aria-label="breadcrumbs">
			  <ul>
			    <li><a href="${path2 }">Home</a></li>
			    <li><a href="${path2 }/fileboard/list.do?pageNo=1">자료실</a></li>
			    <li class="is-active"><a href="#" aria-current="page">글 수정</a></li>
			  </ul>
			</nav>
    	</div>
 	    <section class="page" id="page1">
    		<h2 class="page-title">자료실 글 수정</h2>
    		<div class="page-wrap">
	    		<div class="clr-fix">
	    			<br>
					<form action="${path2 }/admin/updateFileboardPro.do" method="post" enctype="multipart/form-data">
						<table class="table">
							<tbody>
								<tr>
									<th><label for="no">글 번호</label></th>
									<td>
										<input type="text" name="no" id="no" class="input" value="${board.no }" readonly>
									</td>
								</tr>
								<tr>
									<th><label for="title">제목</label></th>
									<td>
										<input type="text" name="title" id="title" class="input" maxlength="100" value="${board.title }" required>
									</td>
								</tr>
								<tr>
									<th><label for="content">내용</label></th>
									<td>
										<textarea name="content" id="content" rows="8" cols="80" class="textarea">${board.content }</textarea>
									</td>
								</tr>
								<tr>
									<th><label for="file">첨부 파일</label></th>
									<td>
										<input type="file" id="file" name="file" value="${path2}/resources/upload/${board.url}">
									</td>
								</tr>
								<tr>
									<th><label for="resdate">작성 일시</label></th>
									<td>
										<input type="text" name="resdate" id="resdate" class="input" value="${board.resdate }" disabled>
									</td>
								</tr>
								<tr>
									<th><label for="visited">읽은 횟수</label></th>
									<td>
										<input type="text" name="visited" id="visited" class="input" value="${board.hits }" disabled>
										<input type="hidden" value="${pageNo }" name="pageNo" />
									</td>
								</tr>
							</tbody>
						</table>
						<hr>
						<div class="buttons">
						  <button type="submit" class="button is-danger">글 수정</button>
						  <a href="${path2 }/fileboard/list.do?pageNo=${pageNo}" class="button is-primary">글 목록</a>
						  <a href="${path2 }/fileboard/detail.do?no=${board.no}&pageNo=${pageNo}" class="button is-success">글 상세보기</a>
						</div>
					</form>
				</div>
    		</div>
    	</section>
    </main>
    <!-- 푸터 부분 인클루드 -->
    <footer id="ft">
    	<jsp:include page="../../include/footer.jsp"></jsp:include>
    </footer>
    <script>
    $(document).ready(function(){
    	$("#tb1_length, #tb1_filter").css("margin-bottom", "20px");
    });
    </script>
</div>    
</body>
</html>