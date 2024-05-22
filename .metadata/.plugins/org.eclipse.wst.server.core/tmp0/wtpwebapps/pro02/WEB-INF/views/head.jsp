<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ipath" value="<%=request.getContextPath()%>" />
<script src="${ipath}/js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="${ipath}/css/bootstrap.min.css" />
<script src="${ipath }/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="subject"
	content="커피빈이 운영하는 홈페이지를 바탕으로 만든 연습용 홈페이지">
<meta name="description" content="커피빈, 커피, 상점, 카페" />
<meta name="keywords" content="커피빈, 커피, 상점, 카페" />
<link rel="icon" href="${ipath}/images/favicon.png">
<link rel="shortcut icon" href="${ipath}/images/favicon.png">
<meta property="og:type" content="website" />
<meta property="og:title" content="coffeebean" />
<meta property="og:description" content="커피빈, 커피, 상점, 카페" />
<meta property="og:image" content="${ipath}/images/favicon.png" />
<meta property="og:url" content="http://localhost:8091" />
<link rel="stylesheet" href="${ipath }/css/common.css" />