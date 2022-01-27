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
  - [setCookie](chapter9/pro09/src/sec02/ex01/setCookie.java)
  - [getCookie](chapter9/pro09/src/sec02/ex01/getCookie.java)
