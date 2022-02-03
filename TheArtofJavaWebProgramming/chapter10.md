# 서블릿의 필터와 리스너 기능

## 서블릿 속성과 스코프

- 서블릿 속성(attribute)
  - ServletContext
  - HttpSession
  - HttpServletRequest
- 서블릿의 스코프(scope)
  - 서블릿 API에 바인딩된 속성에 대한 접근 범위
  - 애플리케이션 스코프: ServletContext, 해당 API의 속성은 애플리케이션 전체에서 접근
  - 세션 스코프: HttpSession, 해당 API의 속성은 브라우저에서만 접근
  - 리퀘스트 스코프: HttpServletRequest, 해당 API의 속성은 요청/응답 사이클에서만 접근
- [SetAttribute](chapter10/pro10/src/sec01/ex01/SetAttribute.java)
- [GetAttribute](chapter10/pro10/src/sec01/ex01/GetAttribute.java)

## 서블릿의 여러가지 URL 패턴

- URL 패턴: 실제 서블릿의 매핑 이름
  - [정확히 이름까지 일치](chapter10/pro10/src/sec02/ex01/TestServlet1.java)
  - [디렉터리까지만 일치](chapter10/pro10/src/sec02/ex01/TestServlet2.java)
  - [확장자만 일치](chapter10/pro10/src/sec02/ex01/TestServlet3.java)

## Filter API

- 필터: 브라우저에서 서블릿에 요청하거나 응답할 때 미리 요청이나 응답과 관련해 여러 가지 작업을 처리하는 기능
- 요청 필터
  - 사용자 인증 및 권한 검사
  - 요청 시 요청 관련 로그 작업
  - 인코딩 기능
- 응답 필터
  - 응답 결과에 대한 암호화 작업
  - 서비스 시간 측정
- 필터 관련 API
  - javax.servlet.Filter
  - javax.servlet.FilterChain
  - javax.servlet.FilterConfig
- [EncoderFilter 구현](chapter10/pro10/src/sec03/ex01/EncoderFilter.java)

## 여러 가지 서블릿 관련 Listener API

- [HttpSessionBidingListener](chapter10/pro10/src/sec04/ex01/LoginImpl.java)
- [HttpSessionListener](chapter10/pro10/src/sec04/ex02/LoginImpl.java)
