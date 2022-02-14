# 스프링 MVC 기능

## 스프링 프레임워크 MVC의 특징

- 특징
  - 모델2 아키텍처 지원
  - 스프링과 다른 모듈과의 연계가 쉬움
  - 타일즈나 사이트메시 같은 View 기술과의 연계가 쉬움
  - 태그 라이브러리를 통해 message 출력, theme 적용 그리고 입력 폼을 보다 쉽게 구현 가능
- 구성 요소
  - DispatcherServlet: 클라이언트의 요청을 전달받아 해당 요청에 대한 컨트롤러를 선택하여 클라이언트의 요청을 전달 및 반환 값을 View에 전달하여 알맞은 응답 생성
  - HandlerMapping: 클라이언트가 요청한 URL을 처리할 컨트롤러를 지정
  - Controller: 클라이언트의 요청을 처리한 후 그 결과를 DispatcherServlet에 전달
  - ModelAndView: 컨트롤러가 처리한 결과 및 뷰 선택에 필요한 정보를 지정
  - ViewResolver: 컨트롤러의 처리 결과를 전달할 뷰를 지정
  - View: 컨트롤러의 처리 결과 화면을 생성
- 실행 과정
  - 브라우저가 DispatcherServlet에 URL로 접근하여 정보를 요청
  - HandlerMapping에서 해당 요청에 대해 매핑된 컨트롤러가 있는지 요청
  - 매핑된 컨트롤러에 대해 처리를 요청
  - 컨트롤러가 클라이언트의 요청을 처리한 결과와 View 이름을 ModelAndView에 저장해서 DispatcherServlet으로 반환
  - DispatcherServlet에서는 컨트롤러에서 보내온 View 이름을 ViewResolver로 보내 해당 View를 요청
  - ViewResolver는 요청한 View를 반환
  - View의 처리 결과를 DispatcherServlet으로 보냄
  - DispatcherServlet은 최종 결과를 브라우저로 전송

## SimpleUrlController 이용해 스프링 MVC 실습하기

- lib에 라이브러리 파일이 들어있어야 동작함
- [실습 파일](chapter21/pro21/src/com/spring/ex01/SimpleUrlController.java)

## MultiActionController 이용해 스프링 MVC 실습하기

- [실습 파일](chapter21/pro21/src/com/spring/ex02/UserController.java)
