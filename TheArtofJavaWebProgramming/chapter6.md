# 서블릿 기초

## 서블릿의 세 가지 기본 기능

- 클라이언트로부터 요청을 받음 (HttpServletRequest)
- 데이터베이스 연동과 같은 비즈니스 로직을 처리
- 처리된 결과를 클라이언트에게 반환 (HttpServletResponse)

## <form> 태그 이용해 서블릿에 요청하기

- form 태그 설명 패스

## 서블릿에서 클라이언트의 요청을 얻는 방법

- [InputServlet](chapter6/pro6/src/sec01/ex01/InputServlet.java)
- [InputServlet2](chapter6/pro6/src/sec01/ex01/InputServlet2.java)
- [LoginServlet](chapter6/pro6/src/sec01/ex01/LoginServlet.java)

## 서블릿의 응답 처리 방법

- doGet()이나 doPost() 메서드 안에서 처리
- javax.servlet.http.HttpServletResponse 객체 이용
- setContentType()을 이용해 클라이언트에게 전송할 데이터 종류(MIME-TYPE)을 지정
- 클라이언트와 서블릿의 통신은 자바 I/O 스트림을 이용

- [LoginServlet2](chapter6/pro6/src/sec02/ex01/LoginServlet2.java)
- [CalcServlet](chapter6/pro6/src/sec02/ex01/CalcServlet.java)

## 웹 브라우저에서 서블릿으로 데이터 전송하기

- GET : URL 주소에 데이터를 파라미터로 붙여서 전송하는 방식, 보안 취약 (앞서 한 예제 서블릿은 전부 get 구현)
- POST : 데이터를 숨겨서 전송

- [LoginServlet3](chapter6/pro6/src/sec03/ex01/LoginServlet3.java)

## GET 방식과 POST 방식 요청 동시에 처리하기

- [LoginServlet4](chapter6/pro6/src/sec03/ex02/LoginServlet4.java)

## 자바스크립트로 서블릿에 요청하기

- 보통은 자바스크립트로 유효성 검사를 한 후 서블릿으로 요청함
- 값 유무 판단 후, submit 로직 js 구현 > 서블릿 doPost로 받아서 처리, html 반환(js만 추가된 예제라 스킵)

## 실습 예제 (스킵)

- 코드로 html 좀 그만 그려..
