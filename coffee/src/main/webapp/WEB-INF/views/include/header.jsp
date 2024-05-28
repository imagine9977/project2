<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE>
<html lang="ko">
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<style>
body {
	background: #f9f8fd;
	font-family: "Lexend Exa", sans-serif;
	   z-index: 6;
}

#first_line {
	background: #cbcbcb;
	height: 20px;
	text-align: right; 
	padding-right: 50px;  
}

#navHeader {
	position: absolute; 
	top: 45px;
	left: 50%;
	justify-content: center;
	transform: translateX(-50%);
	display: inline-block;
	border: 2px solid #ebecf1;
	border-radius: 30px;
	animation: slide-in 1s ease-out;
	   z-index: 6;
} 
  
ul { 
	position: relative;
	display: flex;
	flex: 1 1 auto;
	margin: 0;
	padding: 0;
	list-style-type: none! imporant;
	   z-index: 6;
}

ul li:not(:last-child) {
	margin-right: 40px;
}

ul li {
	border: 2px solid transparent;
	border-radius: 5px;
	padding: 10px;
	transition: background 0.2s;
	list-style-type: none;
}

ul li a {
	color: #2375d8;
	text-decoration: none;
	text-transform: uppercase;
	transition: color 0.2s;
}

ul li ul {
	visibility: hidden;
	opacity: 0;
	position: absolute;
	display: block;
	margin: 12px -12px;
	padding: 0;
	background: #cbcbcb;
	border: 2px solid##262626;
	border-right: 2px solid##262626;
	border-bottom: 2px solid##262626;
	border-radius: 5px;
	transition: opacity 0.2s, visibility 0.2s;
	   z-index: 6;
}

ul li ul li {
	margin: -2px 0 0 -2px;
	width: calc(100% - 20px);
	line-height: 1.7;
	list-style-type: none;
	   z-index: 6;
}

ul li ul li a {
	color: #2375d8;
	   z-index: 6;
}

ul li:hover {
	background: #ec4138;
	border: 2px solid #f05749;
	border-right: 2px solid #e02a21;
	border-bottom: 2px solid #e02a21;
	   z-index: 6;
}

ul li:hover a {
	color: #f9f8fd;
	   z-index: 6;
}

ul li:hover ul {
	visibility: visible;
	opacity: 1;
	box-shadow: 0px 3px 5px 2px #ebecf1;
	   z-index: 6;
}

ul li:hover ul li a {
	color: #f9f8fd;
	   z-index: 6;
}

@
keyframes slide-in { 0% {
	top: -50px;
}
40




%
{
top




:




20px


;
}
70




%
{
top




:




10px


;
}
100




%
{
top




:




15px


;
}
}
</style>
</head>
<body>
	<div id="first_line">
		<c:if test="${not empty sid }">
			<a href="${hpath }/Logout.do">로그아웃 </a>&nbsp;&nbsp;
		    <a href="${hpath }/EditMember.do?id=${sid}"> 회원정보</a>
			<a href="${hpath }/EditMember.do?id=${sid}"> 장바구니</a>
		</c:if>
		<c:if test="${empty sid }">
			<a href="${path1  }/member/login.do">로그인</a>&nbsp;&nbsp;
			<a href="${path1  }/member/term.do"> 회원가입</a>
		</c:if>
	</div>
	<div id="second_line">
		<a href="${path1 }"><img src="${hpath}/myapp/resources/images/favicon.ico"
			style="margin-left: 50px; width: 100px; height: 100px;"></a>
		<nav id="navHeader">
			<ul>
				<li><a href="#0">메뉴</a></li>
				<li><a href="#0">기업 소개</a></li>
				<li><a href="#0">Clients</a>
					<ul>
						<li><a href="#0">Burger King</a></li>
						<li><a href="#0">Southwest Airlines</a></li>
						<li><a href="#0">Levi Strauss</a></li>
					</ul></li>
				<li><a href="${path1 }/product/list.do">상점</a>
					<ul>
						<li><a href="${path1 }">상점</a></li>
						<li><a href="${path1 }">장바구니</a></li>
					
					</ul></li>
				<li><a href="${path1 }/board/list.do">게시판</a>
					<ul>
						<li> <a href="${path1 }/board/list.do" class="navbar-item">
                            Notice
                        </a></li>
						<li><a href="${path1 }/qna/list.do" class="navbar-item">
                            QnA
                        </a></li>
						<li><a href="${path1 }/free/list.do" class="navbar-item">
                            Free
                        </a></li>
                        <li> <a href="${path1 }/file/filelist1.do" class="navbar-item">
                            Fileboard
                        </a></li>
                        <hr class="navbar-divider">
                        <li> <a href="${path1 }/service/online.do" class="navbar-item">
                            Contact
                        </a></li>
					</ul></li>
			</ul>
		</nav>
	</div>

</body>

</html>