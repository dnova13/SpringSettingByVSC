#vsc로 스프링 초기 설정 정리

## 로컬 개발 feat. MYSQL

`application.properties` 설정을 일부 덮어쓰기 위해서
`src/main/resources/application-dev.properties` 

생성하고 다음 내용 입력

```application-dev.properties
spring.datasource.url=jdbc:mysql://localhost:3306/[스키마 이름]]?useSSL=false
spring.datasource.username=root
spring.datasource.password=root
```

## mvn Commands

- Use `mvn install` to build both the front-end and the back-end
- Use `mvn test` to run the tests of the back-end and the front-end
- Use `mvn spring-boot:run` to start the back-end
- Use `npm run serve` inside the `front-end` directory to start the front-end
- Use `java -jar target/app-0.0.1-SNAPSHOT.jar` to start the bundled application