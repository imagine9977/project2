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
</head>
<body>
	<pre>
		6/25 수업 11:40~
	
	
	
	
	
		$.ajax({
			속성명:
			속성명
			속성명
		});
		
		-url
		-type
		-data
		-success
		---------------------------
		-error: AJAX 통신 실패 시 롤백함수를 정의
		-complete : AJX 실패 유무 상관없이 끝나면 하는 함수
		-async
		-contentTYpe	
		-dataType
			-xml
			-json
			-script
			-html
			-text
			...
	</pre>

	<script>
		$.ajax({
			
		});
	</script>
	<h4>ajax로 요청 보내고 응답 받기</h4>
	<h5>1. 서버로 요청시 인자값을 전달하고 응답데이터를 받아서 화면에 출력</h5>


	<label>오늘 먹을거: </label>알밥, 돈까스, 서브웨이, 김치찜
	<br /> 메뉴:
	<input type="text" />
	<br /> 가격:
	<input type="text" />
	<br />

	<div></div>

	<button id='btn'>서버로 전송</button>
	<script> 
		document.getElementById('btn').onclick = () => {
			$.ajax({
				url: 'ajax1.do', //필수 정의 속성
				type: 'get' , 
				data: {
					menu:document.getElementById('menu').value,
						amount: document.getElementById('amount').value
				},
				
				success : result => {
					console.log(result);
					document.getElementById('resultMsg;').innerHTML = '값';
				},
				error : result =>{
					
					console.log('오타남??');
				}
				
			
			
			})
		}
		
		
	</script>

	<!-- 6/27 오전 수업  -->
	<h3>2. DB에서 SELECT문을 이용해서 조회했다는 가정하에 VO객체를 응답받아서 화면상에 출력해보기</h3>
	<input id="menuNo">
	<button id="select-btn">조회하기</button>
	<script>
		window.onload = () => {
			document.getElementById('select-btn').onclick() =() => {
				$.ajax({
					url: 'ajax2.do',
					type='get',
					data: {
						menuNumber : document.getElementById('menuNo').value;
					},
					
					success:result => {
						console.log(result);
						const obj = {
							"menuNumber" : "1",
							"menuName" : "순두부",
							"price" : "9500",
							"material" : "순두부"
						};
						console.log(obj);
						const menu = '<ul>오늘의 메뉴: '
						+'<li>' + result.menuName + '</li>'
						+'<li>' + result.price + '</li>'
						+'<li>' + result.material + '</li>'
						+'</ul>';
						document.getElementById('today-menu').innerHTML = menu;
					},
					error :e => {
						console.log(e);
						
					}
					
				
				});
			
			};
		}
		
		
	</script>

	<br>
	<br>
	<br>




	<h3>조회 후 리스트를 받아서 출력</h3>
	<button onclick="findAll()">메뉴 전체 조회</button>
	<br>
	<br>
	<br>
	<table border="1" id="find-result">
		<tbody>
		<thead>
			<tr>
				<th>메뉴볌ㅇ</th>
				<th>가격</th>
				<th>재료</th>
			</tr>
		</thead>
		</tbody>

	</table>
	<script>
		function findAll() {
			$.ajax ({
				url:'find.do',
				type:'get',
				success:  result =>{
					console.log(result);	
					
					const tbodyE1 = document.createElement('tbody');
					
					for(let 1=0; i<10; i++){
						
					}
					
					result.map(o => {
						const trE1 = document.createElement('tr');
						console.log(trE1);
						const tdFirst = document.createElement('td');
						const firstText = document.createTextNode(result[0].menuName);
						tdFirst.style.width= '200px';
						tdFirst.appendChild(firstText);
						
						const tdSecond = document.createElement('td');
						const secondText = document.createTextNode(result[0].price);
						tdSecond.style.width= '200px';
						tdSecond.appendChild(secondText);
						
						const tdThird = document.createElement('td');
						const thirdText = document.createTextNode(result[0].material);
						tdThird.style.width= '100px';
						tdThird.appendChild(thirdText);
						
						trE1.appendChild(tdFirst);
						trE1.appendChild(tdSecond);
						trE1.appendChild(tdThird);
						console.log(trE1);
						tbodyE1.appendChild(trE1); 
					});
				}
				
			})
		}
	</script>



</body>
</html>