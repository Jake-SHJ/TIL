# 쿠키와 세션 알아보기

## 웹 페이지 연결 기능

- 웹 페이지를 연동하는 방법
  - <hidden> 태그: HTML의 hidden 태그를 이용해 웹 페이지들 사이의 정보를 공유
  - URL Rewriting: GET 방식으로 URL 뒤에 정보를 붙여서 다른 페이지로 전송
  - 쿠키: 클라이언트 PC의 Cookie 파일에 정보를 저장한 후 웹 페이지들이 공유
  - 세션: 서버 메모리에 정보를 저장한 후 웹 페이지들이 공유

## <hidden> 태그와 URL Rewriting 이용해 웹 페이지 연동하기

- [hidden 태그를 이용한 세션 트래킹](chapter9/pro09/src/sec01/ex01/LoginServlet.java)
- [URL Rewriting을 이용한 세션 트래킹](chapter9/pro09/src/sec01/ex02/LoginServlet.java)

## 쿠키를 이용한 웹 페이지 연동 기능

- 쿠키(Cookie)란 웹 페이지들 사이의 공유 정보를 클라이언트 PC에 저장해 놓고 필요할 때 여러 웹 페이지들이 공유해서 사용할 수 있도록 매개 역할을 하는 방법
- 쿠키의 특징
  - 정보가 클라이언트 PC에 저장
  - 저장 정보 용량에 제한
  - 보안이 취약
  - 클라이언트 브라우저에서 사용 유무를 설정 가능
  - 도메인당 쿠키 생성(웹 사이트당 하나의 쿠키가 생성)
- 쿠키 기능 실행 과정
  - 브라우저로 사이트 접속
  - 서버는 정보를 저장한 쿠키를 생성
  - 생성된 쿠키를 브라우저로 전송
  - 브라우저는 서버로부터 받은 쿠키 정보를 쿠키 파일에 저장
  - 브라우저가 다시 접속해 서버가 브라우저에게 쿠키 전송을 요청하면 브라우저는 쿠키 정보를 서버에 전송
  - 서버는 쿠키 정보를 이용해 작업
- 쿠키 관련 API 특징
  - javax.servlet.http.Cookie를 이용
  - HttpServletResponse의 addCookie() 메서드를 이용해 클라이언트 브라우저에 쿠키를 전송한 후 저장
  - HttpServletRequest의 getCookie() 메서드를 이용해 쿠키를 서버로 가져옴
- 서블릿에서 쿠키 사용하기

  - 세션 쿠키는 setCookie에서 c.setMaxAge(-1)로 설정
  - [setCookie](chapter9/pro09/src/sec02/ex01/SetCookieValue.java)
  - [getCookie](chapter9/pro09/src/sec02/ex01/GetCookieValue.java)

## 세션을 이용한 웹 페이지 연동 기능

- 세션의 특징
  - 정보가 서버의 메모리에 저장
  - 브라우저의 세션 연동은 세션 쿠키를 이용
  - 쿠키보다 보안에 유리
  - 서버에 부하를 줄 수 있음
  - 브라우저(사용자)당 한 개의 세션(세션 id)이 생성
  - 세션은 유효 시간을 가짐(기본 30분)
  - 로그인 상태 유지 기능이나 쇼핑몰의 장바구니 담기 기능 등에 주로 사용
- 세션 기능 실행 과정
  - 브라우저로 사이트에 접속
  - 서버는 접속한 브라우저에 대한 세션 객체를 생성
  - 서버는 생성된 세션 id를 클라이언트 브라우저에 응답
  - 브라우저는 서버로부터 받은 세션 id를 브라우저가 사용하는 메모리의 세션 쿠키에 저장(쿠키 이름은 jsessionId)
  - 브라우저가 재접속하면 브라우저는 세션 쿠키에 저장된 세션 id를 서버에 전달
  - 서버는 전송된 세션 id를 이용해 해당 세션에 접근하여 작업을 수행
- [서블릿에서 세션 API 이용하기](chapter9/pro09/src/sec03/ex01/SessionTest.java)
- [세션 유효 시간 설정하기](chapter9/pro09/src/sec03/ex02/SessionTest2.java)
- [강제로 세션 삭제하기](chapter9/pro09/src/sec03/ex03/SessionTest3.java)
- [세션을 이용한 로그인 정보 바인딩](chapter9/pro09/src/sec03/ex04/SessionTest4.java)

## encodeURL() 사용법

- 브라우저에서 쿠키 기능을 사용할 수 없게 설정했다면 쿠키 기능은 물론 세션 기능도 사용할 수 없음
- encodeURL() 메서드를 이용해 직접 서버에서 브라우저로 응답을 먼저 보낸 후 URL Rewriting 방법을 이용해 jsessionId를 서버로 전송하여 세션 기능을 사용
- [encodeURL() 메서드를 이용한 세션 사용](chapter9/pro09/src/sec04/ex01/SessionTest5.java)
