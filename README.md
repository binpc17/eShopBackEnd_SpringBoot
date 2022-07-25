# eShopBackEnd_SpringBoot

<h3>*This is a Spring Boot Backend App.* </h3>

<h4>Keyword: Spring Boot, Spring Data, Spring Data Rest, Spring Security, Spring Cloud, JPA Hihernate, Swagger Documentation (openApi 3)</h4>

In this simple <strong>eShopBackEnd_SpringBoot</strong> I’m using a H2 database to help you to execute and test this without any problem (with less configurations).
This project is linked to <strong>eShop-Web</strong> project as FrontEnd.. <h5>Soo you need to download eShop-Web </h5>

By default the server port is: <em>8087</em>
<h4>HOW TO USE THIS PROJECT ? </h4>

STEP 1: Clone this repository LIKE THIS: <strong>git clone git@github.com:binpc17/eShopBackEnd_SpringBoot.git</strong><br>

STEP 2:  Run this project, With the right click <br>
<img src="https://github.com/binpc17/eShopBackEnd_SpringBoot/blob/main/HowToRunTheBackend.png" alt="HowToRunTheBackend">
STEP 3: After running this current project ( <strong>eShopBackEnd_SpringBoot</strong>), you will find all  
backend REST FULL API documentation at these address:

http://localhost:8087/swagger-ui.html  OR 

http://localhost:8087/v3/api-docs  

<h4>NOTE:</h4> 
You can also use any Available data base LIKE <strong>Mysql, ORACLE, Mongo DB, ….</strong> 

You only just need to edit the <strong>application.properties </strong> file and everything will be okay.

<h3>For Mysql You can do LIKE THIS: </h3>

spring.datasource.url = jdbc:mysql://localhost:3306/YourDataBaseName?serveTimezone=UTC <br>
spring.datasource.username = root <br>
spring.datasource.password = <br>
spring.datasource.driver-class-name=com.mysql.jdbc.Driver <br>
spring.jpa.hibernate.ddl-auto= update <br>
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MysqlDialect <br>
server.port=8087 <br>

IF you need more assistance please email at : binpc17@gmail.com AND hello@egozola.com
