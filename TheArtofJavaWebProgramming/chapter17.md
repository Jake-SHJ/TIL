# 모델2 방식으로 효율적으로 개발하기

## 웹 애플리케이션 모델

- 모델2 방식의 특징
  - 각 기능이 서로 분리되어 있어 개발 및 유지보수가 쉬움
  - 각 기능(모듈)의 재사용성이 높음
  - 디자이너와 개발자의 작업을 분업화해서 쉽게 개발할 수 있음
  - 모델2 방식과 관련된 기능이나 개념의 학습이 필요함

## MVC 디자인 패턴

- Model-View-Controller, 화면, 요청 처리, 로직 처리로 나누어 개발
- MVC의 특징
  - 각 기능이 분리되어 있어 개발 및 유지보수가 편리
  - 각 기능의 재사용성이 높아짐
  - 디자이너와 개발자의 작업을 분업화해서 쉽게 개발할 수 있음
- Controller
  - 서블릿이 컨트롤러의 역할을 함
  - 클라이언트의 요청을 분석
  - 요청에 대해서 필요한 모델을 호출
  - Model에서 처리한 결과를 보여주기 위해 JSP를 선택
- Model
  - 데이터베이스 연동과 같은 비즈니스 로직을 수행
  - 일반적으로 DAO와 VO 클래스로 이루어져 있음
- View
  - JSP가 화면 기능을 담당
  - Model에서 처리한 결과를 화면에 표시

## MVC를 이용한 회원 관리

- 회원 정보 조회 기능 구현
  - [Model](chapter17/pro17/src/sec01/ex01/MemberDAO.java)
  - [View](chapter17/pro17/web/test01/listMembers.jsp)
  - [Controller](chapter17/pro17/src/sec01/ex01/MemberController.java)
- 회원 정보 추가 기능 구현
  - [Model](chapter17/pro17/src/sec02/ex01/MemberDAO.java)
  - [View](chapter17/pro17/web/test02/memberForm.jsp)
  - [Controller](chapter17/pro17/src/sec02/ex01/MemberController.java)
- 회원 정보 수정 및 삭제 기능 구현
  - [Model](chapter17/pro17/src/sec02/ex02/MemberDAO.java)
  - [View](chapter17/pro17/web/test03/modMemberForm.jsp)
  - [Controller](chapter17/pro17/src/sec02/ex02/MemberController.java)

## 모델2로 답변형 게시판 구현하기

- DAO는 데이터베이스에 접근하는 기능을 수행, Service는 트랜잭션(transaction, 실제 사용자 입장에서의 업무 단위)으로 작업을 수행
- 게시판 글 목록 보기 구현
  - [Model](chapter17/pro17/src/sec03/brd01/BoardDAO.java)
  - [View](chapter17/pro17/web/board01/listArticles.jsp)
  - [Controller](chapter17/pro17/src/sec03/brd01/BoardController.java)
  - [Service](chapter17/pro17/src/sec03/brd01/BoardService.java)
- 게시판 글쓰기 구현
  - [Model](chapter17/pro17/src/sec03/brd02/BoardDAO.java)
  - [View](chapter17/pro17/web/board02/articleForm.jsp)
  - [Controller](chapter17/pro17/src/sec03/brd02/BoardController.java)
  - [Service](chapter17/pro17/src/sec03/brd02/BoardService.java)
- 게시글별 이미지 파일 분기
  - [Model](chapter17/pro17/src/sec03/brd03/BoardDAO.java)
  - [Controller](chapter17/pro17/src/sec03/brd03/BoardController.java)
  - [Service](chapter17/pro17/src/sec03/brd03/BoardService.java)
