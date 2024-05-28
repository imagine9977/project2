<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:set var="path0" value="<%=request.getContextPath() %>" />    
<!DOCTYPE>
<html lang="ko">
<html>
<head>
<meta charset="UTF-8">
    <title>게시판 목록</title>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
    <link rel="stylesheet" href="resources/css/normalize.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation-prototype.min.css">
    <link href='https://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css' rel='stylesheet' type='text/css'>
    <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/js/foundation.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.js"></script>
    
    
    <style>
    	body {
    		width: 1200px;
    		 font-size:8px !important;
    		 background:#E2E2E2;
    	}
    	h2 {
    		font-weight: bold;
    		
  color: #D1681A; 
  font-size: 12px;
    	}
    </style>
</head>
<body>

			<div class="inner_footer" > 
				
				<div class="sitemap">
					<div> 
						<div style="width: 205px">
							<h2>Buy Online</h2>
							<ul>
								<li><a href="/product/list.asp">VIEW ALL</a></li>
								<li><a href="/product/list.asp?no=4">커피</a></li>
								<li><a href="/product/list.asp?no=3">티</a></li>
								<!--li><a href="/product/list.asp?no=2">CBTL 시스템</a></li-->
								<li><a href="/product/list.asp?no=5">상품</a></li>
								
							</ul>
						</div>

						<div style="width: 240px">
							<h2>Member`s Club</h2>
							<ul>
								<li><a href="/card/about.asp">커피빈 멤버스 클럽</a></li>
								<li><a href="/mypage/my_club.asp">나의 커피빈</a></li>
								
							</ul>
						</div>

						<!-- <div>
							<h2>Promotion</h2>
							<ul>
								<li><a href="/promotion/list.asp">PROMOTION</a></li>
								<li><a href="/promotion/list.asp">PROMOTION DRINKS</a></li>
							</ul>
						</div> -->

						<div style="width: 165px">
							<h2>Menu</h2>
							<ul>
								<li><a href="/menu/list.asp">음료</a></li>
								<li><a href="/menu/list.asp?category2=2">푸드</a></li>
								<li><a href="/product/list.asp?no=5">상품</a></li>
								<li><a href="/card/e_gift.asp">카드</a></li>
							</ul>
						</div>

						<div style="width: 160px">
							<h2>Store & 서비스</h2>
							<ul>
								<li><a href="/catering/catering.asp">케이터링 서비스</a></li>
								<li><a href="/store/store.asp">매장 찾기</a></li>
								<li><a href="/store/store.asp?category=2">신규 매장</a></li>
							</ul>
						</div>
<!-- 					</div>
					
					<div class="sitemap_bottom"> -->
						<div style="width: 250px">
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

					<!-- 	<div>
							<h2>Customer Relations</h2>
							<ul>
								<li><a href="/customer/faq_list.asp">FAQ</a></li>
								<li><a href="/mypage/qna_write.asp">고객의 소리</a></li>
								<li><a href="/mypage/qna_write.asp">CBTL SERVICE</a></li>
								<li><a href="/customer/barcode.asp">상품권 잔액확인</a></li>
								<li><a href="/customer/heavybuying.asp">기업 및 단체구매</a></li>
							</ul>
						</div> -->

						<!--div style="width: 180px">
							<h2>CBTL</h2>
							<ul>
								<li><a href="/cbtl/cbtl.asp">CBTL 가이드</a></li>
								<li><a href="/cbtl/overview.asp">CBTL 서비스</a></li>
								<li><a href="/cbtl/as_service.asp">AS 안내</a></li>
								<li><a href="/cbtl/as_self.asp">AS 신청</a></li>
								<li><a href="/cbtl/faq_list.asp">CBTL FAQ</a></li>
								<li><a href="/cbtl/manual.asp">제품설명서</a></li>
								
							</ul>
						</div-->

						<!-- <div>
							<h2>Social Media</h2>
							<ul>
								<li><a href="https://www.facebook.com/thecoffeebeankorea/" target="_blank">FACEBOOK</a></li>
								<li><a href="https://www.instagram.com/coffeebeankorea/" target="_blank">INSTAGRAM</a></li>
								<li><a href="http://blog.naver.com/coffeebeankorea" target="_blank">BLOG</a></li>
								<li><a href="https://twitter.com/coffeebean_kr" target="_blank">TWITTER</a></li>
							</ul>
						</div> -->

						<!-- <div>
							<h2>Site Terms</h2>
							<ul>
								<li><a href="/member/agree.asp">이용약관</a></li>
								<li><a href="/member/privacy.asp" class="fc03">개인정보취급방침</a></li>
								<li><a href="/etc/policy.asp">영상정보처리기기운영방침</a></li>
								<li><a href="/member/memberscard_agree.asp">멤버스카드이용약관</a></li>
							</ul>
						</div> -->
					</div>
				</div>
				
				<div class="sns_box sns_style">
					<a href="https://www.facebook.com/thecoffeebeankorea/" class="ico_facebook" target="_blank">FACEBOOK</a>
					<a href="https://www.instagram.com/coffeebean_kr/" class="ico_instagram" target="_blank">INSTAGRAM</a>
					<a href="http://blog.naver.com/coffeebeankorea" class="ico_blog" target="_blank">BLOG</a>
					<a href="https://twitter.com/coffeebean_kr" class="ico_twitter" target="_blank">TWITTER</a>
					
					<!-- <a href="javascript:;" class="btn_top">TOP</a> -->
				</div>
				

				<div class="txt_box">
					<div class="link">
						<!--a href="/member/agree.asp">이용약관</a>ㅣ<a href="/member/privacy.asp" class="fc01">개인정보처리방침</a>ㅣ<a href="/etc/policy.asp">영상정보처리기기운영방침</a>ㅣ<a href="/member/memberscard_agree.asp">멤버스카드이용약관</a-->

						<!--19-12-30 위치기반 서비스 추가&변경-->
						<a href="/member/agree.asp">홈페이지 이용약관</a>ㅣ<a href="/member/privacy.asp" class="fc01">개인정보처리방침</a>ㅣ<a href="/etc/policy.asp">영상정보처리기기운영방침</a>ㅣ<a href="/member/memberscard_agree.asp">멤버스카드이용약관</a>ㅣ<a href="/member/location.asp">위치기반서비스 이용약관</a>
						<!--//19-12-30 위치기반 서비스 추가-->

					</div>

				<!--2018-07-02 패밀리사이트 추가-->			
					<div class="f-familysite"> <!--패밀리사이트 오픈시 클래스 open-->
						<div class="inner">
							<div>
								<a href="#" class="btn-family">Family Site</a>
								
								<div class="family-box">
									<div class="family-box--top">
										<p class="tit">FAMILY SITE</p>
										<a href="#">CLOSE</a>
									</div>

									<div class="fashion-box">
										<p><span>---FASHION---</span></p>
										<ul>
											<li><a href="http://www.cathkidstonkorea.co.kr/" target="_blank">캐스키드슨</a></li>
											<li><a href="http://www.nealsyardkorea.com/" target="_blank">닐스야드 레머디스</a></li>
											<li><a href="http://www.aldoshoeskorea.com/" target="_blank">알도</a></li>
											<li><a href="http://www.lesportsackorea.com/" target="_blank">레스포색</a></li>
											<li><a href="https://www.etamkorea.com/" target="_blank">에탐</a></li>
											<li><a href="http://www.kinkirobot.com/" target="_blank">킨키로봇</a></li>
											<li><a href="http://www.monicavinader.co.kr/" target="_blank">모니카비니더</a></li>
											<li><a href="https://www.repetto.kr/" target="_blank">레페토</a></li>
											<li><a href="http://www.lancasterkorea.com/" target="_blank">랑카스터</a></li>
											<li><a href="http://www.agathakorea.com/" target="_blank">아가타</a></li>
											<li><a href="http://www.fauxpaspariskorea.com/" target="_blank">뽀빠파리</a></li>
											<li><a href="http://www.bricskorea.co.kr/" target="_blank">브릭스</a></li>
											<li><a href="#" target="_blank">판도라</a></li>
										</ul>
									</div>

									<div class="beauty-box">
										<p><span>---BEAUTY---</span></p>
										<ul>
											<li><a href="http://www.aippo.co.kr/" target="_blank">아이뽀</a></li>
										</ul>
									</div>

									<div class="fnb-box">
										<p><span>----F&amp;b----</span></p>
										<ul>
											<li><a href="http://www.kyotokatsugyu.com/" target="_blank">교토가츠규</a></li>
											<li><a href="http://www.kusmiteakorea.com/" target="_blank">쿠스미</a></li>
										</ul>
									</div>

<!-- 									<div class="etc-box">
										<p><span>---자매회사---</span></p>
										<ul>
											<li><a href="http://www.coffeebeankorea.com/main/main.asp" target="_blank">커피빈</a></li>
										</ul>
									</div> -->
								</div>
							</div>
						</div>
					</div>		
				<!--//2018-07-02 패밀리사이트 추가-->				
					<div class="address">
						(주)커피빈코리아 대표이사 감종철  <span class="m_hidden">ㅣ</span><br class="d_hidden t_hidden"/>  사업자등록번호 120-86-07029  <span class="m_hidden">ㅣ</span><br class="d_hidden t_hidden"/>  통신판매업신고 제 2010-서울강남-00560<br/>
						서울시 강남구 봉은사로 99길 7  <span class="m_hidden">ㅣ</span><br class="d_hidden t_hidden"/>  고객센터 02-1577-4708 (09:00  - 18:00) <span class="m_hidden">ㅣ</span><br class="d_hidden t_hidden"/>E-mail : cbk@coffeebeankorea.com<br/>
						<!--호스팅사업자 : SK브로드밴드<br/>-->
						ⓒ 2021. The Coffee Bean. All rights reserved. 
							
					</div>
				</div>
				
			</div>


</body>
</html>