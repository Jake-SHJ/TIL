# 마이바티스 프레임워크 사용하기

## 마이바티스란?

- 마이바티스 프레임워크의 특징
  - SQL 실행 결과를 자바 빈즈 또는 Map 객체에 매핑해 주는 Persistence 솔루션으로 관리, SQL을 소스 코드가 아닌 XML로 분리
  - SQL문과 프로그래밍 코드를 분리해서 구현
  - DataSource 기능과 트랜잭션 처리 기능을 제공
- 마이바티스 프레임워크의 구조
  - SqlMapConfig.xml에 각 기능별로 실행할 SQL문을 SqlMap.xml에 미리 작성한 후 등록
  - 애플리케이션에서 데이터베이스와 연동하는 데 필요한 데이터를 각각의 매개변수에 저장한 후 마이바티스에 전달
  - 애플리케이션에서 요청한 SQL문을 SqlMap.xml에서 선택
  - 전달한 매개변수와 선택한 SQL문을 결합
  - 매개변수와 결합된 SQL문을 DBMS에서 실행
  - DBMS에서 반환된 데이터를 애플리케이션에서 제공하는 적당한 매개변수에 저장한 후 반환

## 마이바티스 이용해 회원 기능 실습하기

- [SqlMapConfig](chapter23/pro23/src/mybatis/SqlMapConfig.xml)
- [member](chapter23/pro23/src/mybatis/mappers/member.xml)
