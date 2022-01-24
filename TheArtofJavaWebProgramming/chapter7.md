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

- [MemberServlet](chapter7/pro07/src/sec01/ex01/MemberServlet.java)
- [MemberDAO](chapter7/pro07/src/sec01/ex01/MemberDAO.java)
- [MemberVO](chapter7/pro07/src/sec01/ex01/MemberVO.java)

- PreparedStatement 인터페이스를 사용하면 SQL문을 미리 컴파일해서 재사용하므로 Statement 인터페이스보다 훨씬 빠르게 데이터베이스 작업을 수행

- [PreaparedStatement가 적용된 MemberDAO](chapter7/pro07/src/sec01/ex02/MemberDAO.java)

## DataSource 이용해 데이터베이스 연동하기

- 앞절까지는 웹 애플리케이션이 필요할 때마다 데이터베이스에 연결하여 작업하는 방식, 시간 소모가 큼
- 웹 애플리케이션이 실행됨과 동시에 연동할 데이터베이스와의 연결을 미리 설정
- 커넥션풀(ConnectionPool): 미리 데이터베이스와 연결시킨 상태를 유지하는 기술

- 커넥션풀 동작 과정
  - 톰캣 컨테이너를 실행한 후 응용 프로그램 실행
  - 톰캣 컨테이너 실행 시 ConnectionPool 객체를 생성
  - 생성된 커넥션 객체는 DBMS와 연결
  - 데이터베이스와의 연동 작업이 필요한 경우 응용 프로그램은 ConnectionPool에서 제공하는 메서드를 호출하여 연동
- 톰캣 컨테이너는 자체적으로 ConnectionPool 기능을 제공

- JNDI(Java Naming and Directory Interface): 톰캣이 생성한 ConnectionPool 객체에 접근할 때 이용
- 필요한 자원을 키/값 쌍으로 저장한 후 필요할 때 키를 이용해 값을 얻는 방법

- [DataSource를 이용한 MemberDAO](chapter7/pro07/src/sec02/ex01/MemberDAO.java)

## DataSource 이용해 회원 정보 등록하기

- html에서 form 생성, Servlet 클래스에서 hidden input으로 어떤 명령인지 전달 받음 (ex. name = "command", value = "addMember" or "delMember")
- 회원 정보를 VO 객체에 저장한 후, DAO에서 insert 쿼리 생성

## 회원 정보 삭제하기

- html에서 삭제 버튼을 누르면 Servlet에 href의 파라미터로 "?command=delMember&id={userId}" 전달
- DAO에서 delete 쿼리 생성

- [정보 등록 및 삭제 MemberServlet](chapter7/pro07/src/sec02/ex02/MemberServlet.java)
- [정보 등록 및 삭제 MemberDAO](chapter7/pro07/src/sec02/ex02/MemberDAO.java)
