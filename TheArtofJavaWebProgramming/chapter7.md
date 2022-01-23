# 서블릿 비즈니스 로직 처리

## 서블릿의 비즈니스 로직 처리 방법

- 서블릿 비즈니스 처리 작업이란 서블릿이 클라이언트로부터 요청을 받으면 그 요청에 대해 작업을 수행하는 것
- 비즈니스 처리 과정
  - 클라이언트로부터 요청을 받음
  - 데이터베이스 연동과 같은 비즈니스 로직을 처리
  - 처리 결과를 클라이언트에게 반환

## 서블릿의 데이터베이스 연동하기

- 웹 브라우저가 서블릿에게 회원 정보 요청
- MemberServlet은 요청을 받은 후 MemberDAO 객체를 생성, listMembers() 메서드 호출
- listMembers()에서 다시 connDB() 메서드를 호출하여 데이터베이스와 연결한 후 SQL문을 실행해 회원 정보를 조회
- 조회된 회원 정보를 MemberVO 속성에 설정한 루 다시 ArrayList에 저장
- ArrayList를 다시 메서드를 호출한 MemberServlet으로 반환 후 ArrayList의 MemberVO를 차례대로 가져와 회원 정보를 HTML 태그의 문자열로 생성
- 만들어진 HTML 태그를 웹 브라우저로 전송해서 회원 정보를 출력

- [MemberServlet](chapter7/pro7/src/sec01/ex01/MemberServlet.java)
- [MemberDAO](chapter7/pro7/src/sec01/ex01/MemberDAO.java)
- [MemberVO](chapter7/pro7/src/sec01/ex01/MemberVO.java)
