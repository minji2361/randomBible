 < ToyProject - randomBible >
 * 간단한 기능 사용을 해보기 위해 만들어본 프로젝트
 * 22년 8월 18일 9시 ~ 22년 8월 18일 17시


< 목표 >
1. 스프링 부트 프로젝트 세팅 하기
2. 오라클 DB 사용해보기 및 스프링 연동
3. DB에 넣은 데이터 불러오기


< RandomBible > 
버튼 클릭 시 랜덤으로 성구 한 절 불러와서 보여주기


< 사용한 기능 > - ( 사용하고 싶었던 기능 )
1. 오라클 DB & 마이바티스
  - DB 연동
  - 랜덤으로 값 1개 불러오기 쿼리문
  - 마이바티스 연동
2. 간단한 javascript 
  - 버튼 클릭 이벤트와 ajax 
3. mvc 기능
  - Controller, Service, Mapper, Model 작성
4. css
  - bootstrap으로 버튼 모양 변경
  - 배경 색상 변경
  - 가운데 정렬


< 진행 방향 >
1. 메이븐 프로젝트 생성 후 pom.xml 설정
  - pom.xml은 기존 petboard 프로젝트의 pom.xml을 사용함
  - 추가된 내용 : 내장 톰캣 (org.apache.tomcat.embed)
2. 오라클 DB 설정
  - 오라클 DB 18c 설치 및 계정 설정
  - 성경 DB 생성 - 2개 (책번호, 장, 절, 성구 테이블 / 책번호, 책이름 테이블)
  - application.properties #DataSource 설정과 연결 확인
  - 마이바티스 설정 : application.properties #Mybatis
3. 연결 확인
  - 구동 되는지 확인 
4. Controller, Service, Model, Mapper, Mybatis를 통해 작성
  - lombok을 설정하여 getter와 setter 자동 생성
5. javascript를 통해 버튼 클릭 이벤트 추가
6. 버튼 클릭 시 Controller로 연결하기 위한 ajax 작성
7. css추가하여 배경에 색상을 넣어주고 bootstrap으로 버튼 디자인 설정


< 문제점 >
1. lombok 설정
  - 문제 : lombok을 설치를 하고 @Getter, @Setter까지 import 되었는데 계속 오류가 발생했었음
  - 해결방법 : 이클립스 help에서 lombok을 설치해보기도 하고, maven project update도 해보고, 다양한 방법으로 해결했음
    정확히 어떠한 방법을 통해 해결됬는지 파악은 못했으나 만들 당시 검색해서 찾아본 페이지 링크를 참조하겠습니다
    https://sunny-jang.tistory.com/35
2. DB 연결하기
  - 문제 : 아이디/비밀번호 오류로 연결이 안됨
  - 해결방법 : 아이디/비밀번호를 확인하고 접속할 DB도 다시 확인하여 연결함 (DB는 XEPDB1)
3. ajax 문제
  - 문제 : map 형식으로 값이 넘어오지를 않아서 출력에 오류가 있었음
  - 해결방법 : 마이바티스에서부터 map으로 받게끔 모두 변경후 해결 
4. css, js 연결 문제
  - 문제 : link로 연결하여 사용하고 싶었으나 js와 css를 계속 읽지 못했다
  - 해결방법 : 절대경로를 설정하여 파일 위치를 읽어왔다.
    <c:set var="path" value="${pageContext.request.contextPath}"/>
    <link href="${path}/resources/css/custom.css" rel="stylesheet"/>
    <script type="text/javascript" src="${path}/resources/js/bible.js"></script>
5. 첫 구동 시 로그인 페이지가 생성됨
   - 문제 : 첫 구동시 로그인하라는 페이지가 나온다
            아이디는 user, 비밀번호는 이클립스 콘솔창에 찍혀서 나온다
   - 해결방법 : 아직 해결 중입니다.
