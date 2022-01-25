# 서블릿 확장 API 사용하기

## 서블릿 포워드 기능 사용하기

- 포워드(forward): 하나의 서블릿에서 다른 서블릿이나 JSP와 연동하는 방법
- 포워드의 용도
  - 요청에 대한 추가 작업을 다른 서블릿에게 수행하게 함
  - 요청에 포함된 정보를 다른 서블릿이나 JSP와 공유
  - 요청에 정보를 포함시켜 다른 서블릿에 전달
  - 모델2 개발 시 서블릿에서 JSP로 데이터를 전달하는 데 사용

## 서블릿의 여러가지 포워드 방법

- Redirect 방법
  - HttpServletResponse 객체의 sendRedirect() 메서드 이용
  - 웹 브라우저에 재요청하는 방식
  - 형식: sendRedirect("포워드할 서블릿 또는 JSP")
  - [Redirect 방법](chapter8/pro08/src/sec01/ex01/FirstServlet.java)
- Refresh 방법
  - HttpServletResponse 객체의 addHeader() 메서드 이용
  - 웹 브라우저에 재요청하는 방식
  - 형식: response.addHeader("Refresh", "경과시간(초); url=요청할 서블릿 또는 JSP);
  - [Refresh 방법](chapter8/pro08/src/sec01/ex02/FirstServlet.java)
- Location 방법
  - JS Location 객체의 href 속성을 이용
  - JS에서 재요청하는 방식
  - 형식: location.href="요청할 서블릿 또는 JSP"
  - [Location 방법](chapter8/pro08/src/sec01/ex03/FirstServlet.java)
- Dispatch 방법
  - 일반적으로 포워딩 기능을 지칭
  - 서블릿이 직접 요청하는 방법
  - RequestDispatcher 클래스의 forward() 메서드를 이용
  - 형식: RequestDispatcher dis = request.getRequestDispatcher("포워드할 서블릿 또는 JSP"); dis.forward(request, response);
  - [Dispatch 방법](chapter8/pro08/src/sec03/ex01/FirstServlet.java)

## 바인딩

- 서블릿에서 다른 서블릿 또는 JSP로 대량의 데이터를 공유하거나 전달하고 싶을 때 사용
- 웹 프로그램 실행 시 자원을 서블릿 관련 객체에 저장, 저장된 자원은 서블릿이나 JSP에서 공유하여 사용
- Redirect 방법은 웹 브라우저를 거치기 때문에 바인딩을 사용할 수 없음
- [Dispatch를 이용한 바인딩](chapter8/pro08/src/sec04/ex02/FirstServlet.java)

## ServletContext와 ServletConfig 사용법

- ServletContext 클래스의 특징
  - javax.servlet.ServletContext로 정의
  - 서블릿과 컨테이너 간의 연동을 위해 사용
  - 컨텍스트(웹 애플리케이션)마다 하나의 ServletContext가 생성
  - 서블릿끼리 자원을 공유하는 데 사용
  - 컨테이너 실행 시 생성되고 컨테이너 종료 시 소멸
- ServletContext가 제공하는 기능
  - 서블릿에서 파일 접근 기능
  - 자원 바인딩 기능
  - 로그 파일 기능
  - 컨텍스트에서 제공하는 설정 정보 제공 기능
