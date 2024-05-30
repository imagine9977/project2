<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path0" value="<%=request.getContextPath()%>" />
<!DOCTYPE>
<html lang="ko">
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<link rel="stylesheet" href="resources/css/normalize.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation-prototype.min.css">
<link
	href='https://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css'
	rel='stylesheet' type='text/css'>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/js/foundation.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.js"></script>


<style>
footer {
	width: 100%;
	font-size: 13px !important;
	background: #222322;
	white-space: nowrap;
	align-content: start; 
	display: inline-block;

}

h2 {
	font-weight: bold;
	color: #D1681A;
	font-size: 15px;
}

#sitemap {
	width: 1200px;
	margin-left:100px;
	margin-top: 20px;
	display: grid;
	grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
	justify-content: space-around;
}

.sitemap>#categoryFt {
	width: 15%;
}

li {
	display: block;
	list-style-type: none;
	padding-right: 10px;
} 
.sns_box, .txt_box{
	margin-left:100px; 
} 
</style>
</head>
<footer>

	<div class="inner_footer">

		<div id="sitemap">

			<div id="categoryFt">
				<h2>Buy Online</h2>
				<ul>
					<li><a href="/product/list.asp">VIEW ALL</a></li>
					<li><a href="/product/list.asp?no=4">커피</a></li>
					<li><a href="/product/list.asp?no=3">티</a></li>
					<!--li><a href="/product/list.asp?no=2">CBTL 시스템</a></li-->
					<li><a href="/product/list.asp?no=5">상품</a></li>

				</ul>
			</div>

			<div id="categoryFt">
				<h2>Member`s Club</h2>
				<ul>
					<li><a href="/card/about.asp">커피빈 멤버스 클럽</a></li>
					<li><a href="/mypage/my_club.asp">나의 커피빈</a></li>

				</ul>
			</div>


			<div id="categoryFt">
				<h2>Menu</h2>
				<ul>
					<li><a href="/menu/list.asp">음료</a></li>
					<li><a href="/menu/list.asp?category2=2">푸드</a></li>
					<li><a href="/product/list.asp?no=5">상품</a></li>
					<li><a href="/card/e_gift.asp">카드</a></li>
				</ul>
			</div>

			<div id="categoryFt">
				<h2>Store & 서비스</h2>
				<ul>
					<li><a href="/catering/catering.asp">케이터링 서비스</a></li>
					<li><a href="/store/store.asp">매장 찾기</a></li>
					<li><a href="/store/store.asp?category=2">신규 매장</a></li>
				</ul>
			</div>
			<!-- 					</div>
					
					<div class="sitemap_bottom"> -->
			<div id="categoryFt">
				<h2>The Coffee Bean</h2>
				<ul>
					<li><a href="/about/coffeebean.asp">커피빈 코리아</a></li>
					<li><a href="/news/list.asp">커피빈 소식</a></li>
					<li><a href="/about/responsibility.asp">사회공헌</a></li>
					<li><a href="/customer/marketing.asp"><b>제휴 마케팅 제안</b></a></li>
					<li><a href="/recruit/recruit.asp">채용안내</a></li>
					<li><a href="/about/standing_point.asp">신규 입점 제의</a></li>
					<li><a href="/about/finance.asp">결산공고</a></li>
				</ul>
			</div>

		</div>

		<div class="sns_box sns_style">
			<a href="https://www.facebook.com/thecoffeebeankorea/"
				class="ico_facebook" target="_blank">FACEBOOK</a> <a
				href="https://www.instagram.com/coffeebean_kr/"
				class="ico_instagram" target="_blank">INSTAGRAM</a> <a
				href="http://blog.naver.com/coffeebeankorea" class="ico_blog"
				target="_blank">BLOG</a> <a href="https://twitter.com/coffeebean_kr"
				class="ico_twitter" target="_blank">TWITTER</a>

			<!-- <a href="javascript:;" class="btn_top">TOP</a> -->
		</div>


		<div class="txt_box">
			<div class="link">
				<!--a href="/member/agree.asp">이용약관</a>ㅣ<a href="/member/privacy.asp" class="fc01">개인정보처리방침</a>ㅣ<a href="/etc/policy.asp">영상정보처리기기운영방침</a>ㅣ<a href="/member/memberscard_agree.asp">멤버스카드이용약관</a-->

				<!--19-12-30 위치기반 서비스 추가&변경-->
				<a href="/member/agree.asp">홈페이지 이용약관</a>ㅣ<a
					href="/member/privacy.asp" class="fc01">개인정보처리방침</a>ㅣ<a
					href="/etc/policy.asp">영상정보처리기기운영방침</a>ㅣ<a
					href="/member/memberscard_agree.asp">멤버스카드이용약관</a>ㅣ<a
					href="/member/location.asp">위치기반서비스 이용약관</a>
				<!--//19-12-30 위치기반 서비스 추가-->

			</div>

		</div>
	</div>
</footer>
</html>