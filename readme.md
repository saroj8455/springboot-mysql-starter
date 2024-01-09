## Spring Boot MySql Starter Project

##### application.properties

```application.properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/<Database Name>
spring.datasource.username=<Username>
spring.datasource.password=<Password>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql: true
```

##### Dependency 
- [x] Spring Web
- [x] MySql Driver 
- [x] Lombok
- [x] Spring Data JPA