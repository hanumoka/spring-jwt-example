# Spring jwt 토큰 예제

### 주요라이브러리
- spring boot
- jpa
- mysql
- security

### 대략 기능
- 로그인시 access_token, refresh_token 발급
- refresh_token으로 access_token 재발급
- 쿠키 사용하지 않음

### 도메인
User <--다대다--> Role
