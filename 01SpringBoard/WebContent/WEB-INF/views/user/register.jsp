	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<%@include file="../include/header.jsp"%>
	<section class="content">
		<!-- 회원가입 form : 유효성 검사를 위해서 id를 부여
		enctype은 file을 전송할 때 사용
		최근에는 form의 전송방식은 거post
		조회할 때 입력받는 부분만 get -->
		<form id="registerform" enctype="multipart/form-data" method="post">
			<p align="center">
			<table border="1" width="50%" height="80%" align='center'>
				<tr>
					<td colspan="3" align="center"><h2>회원 가입</h2></td>
				</tr>
				<tr>
				<!-- rowspan은 행을 합치는 것 -->
					<td rowspan="5" align="center">
						<p></p> 
						<img id="img" width="100" height="100" border="1" /> <br />
						<br />
						<!-- accept 속성은 파일 선택을 제한 : 확장자를 가지고 제한 -->
						 <input type='file' id="image" name="image"
						accept=".jpg,.jpeg,.gif,.png" /><br />
					</td>
				</tr>

				<tr>
					<td bgcolor="#f5f5f5">
					<font size="2">&nbsp;&nbsp;&nbsp;&nbsp;이메일</font>
					</td>
					<td>&nbsp;&nbsp;&nbsp; 
					<!-- HTML5에서 input의 type을  추가된 형태를 설정하면
					형식 검사도 수행해 줍니다.
					name은 서버에게 전달할 이름이고 id는 스크립트가 사용할 이름 
					2개를 동일하게 설정하는 것이 코딩할 때 수월합니다. -->
					<input type="email" name="email"
						id="email" size="30" maxlength=50 required="required" />
					</td>
				</tr>
				<tr>
					<td bgcolor="#f5f5f5">
					<font size="2">&nbsp;&nbsp;&nbsp;&nbsp;비밀번호</font>
					</td>
					<td>&nbsp;&nbsp;&nbsp; 
					<input type="password" name="pw" id="pw" 
					size="20"  maxlength="15" required="required" />
					</td>
				</tr>

				<tr>
					<td bgcolor="#f5f5f5">
					<font size="2">&nbsp;&nbsp;&nbsp;&nbsp;비밀번호 확인</font></td>
					<td>&nbsp;&nbsp;&nbsp; 
					<input type="password" id="pwconfirm"
						size="20" required="required" />
					</td>
				</tr>
				<tr>
					<td width="17%" bgcolor="#f5f5f5">
					<font size="2">&nbsp;&nbsp;&nbsp;&nbsp;닉네임</font>
					</td>
					<td>&nbsp;&nbsp;&nbsp;
					<!-- pattern은 정규식 패턴을 설정해서 유효성 검사 수행
					title은 유효성 검사에 실패했을 때 보여지는 텍스트 인데 브라우저에 잘 적용이 안됨  -->
					 <input type="text" name="nickname"
						id="nickname" size="20" pattern="([a-z, A-Z, 가힣]){2,}"
						required="required" title="닉네임은 문자 2자 이상입니다." />
					</td>
				</tr>

				<tr>
					<td align="center" colspan="3">
						<p></p> 
						<!-- 부트스트랩에서는 버튼 class를 적용하면 색상이 변경됩니다  -->
						<input type="submit" value="회원가입" class="btn btn-warning" />
						<!-- 인라인 이벤트 처리 방식으로  클릭이벤트 처리 
						간단한 구문에는 유용하지만 태그 안에 스크립트코드가 있어서 가독성이 떨어지기 때문에 최근에는 비추천 -->
						<input type="button" value="메인으로" 
						class="btn btn-success"
						onclick="javascript:window.location='/'">
						<p></p>
					</td>
				</tr>
			</table>
		</form>
		<br /> <br />
	</section>
	<%@include file="../include/footer.jsp"%>
	
	<script>
	 document.getElementById("image").addEventListener(
	 "change", function(e){
		//파일 선택 여부 확인 
		//프로그래밍 언어 들 중에는 데이터가 없으면 false를 리턴하기도 합니다.
		if(this.files && this.files[0]){
			//파일의 내용을 읽는 객체를 생성
			var reader = new FileReader();
			//파일을 읽는 것은 비동기적으로 동작 -  CallBack 함수가 필요합니다.
			reader.readAsDataURL(this.files[0])
			//파일을 읽는 동작이 종료되면 처리
			reader.addEventListener("load", function(e){
				//읽은 내용을 img 태그에 출력
			document.getElementById("img").src = e.target.result;
			});
		}
	 });
	</script>
	
	
	
