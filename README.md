## How to run this project

Generated using spring io web - https://start.spring.io/


# steps

import this project as maven project & run it as spring boot application


# Status


Spring boot Auto Configuration

It automatically configure based on jar deps like session factory, data source, transaction manager beans.

for JSP, Thymleaf we will not have to configure Internal resource view resolver, dispatcher servlet. It will automatically configure

for Spring MVC we would need to configure
Component Scan, Dispatcher, View Resolver, Web Jars

when we use Hibernate/JPA we would need to configure
data source, entity manager factory/session factory
transaction manager among a host of other things.


```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

add above dependency to create spring web application. It will enable Embedded tomcat server

@ConditionalOnClass - Responsible to enable DispatcherServletAutoConfiguration


Jackson lib - Java to JSON, JSON to Java

spring-boot-autoconfigure.jar responsible for all the auto configuration implementations.

spring.factories - contains all the autoconfiguration classes

@SpringBootApplication
	@SpringBootConfiguration
		@Configuration - Java, !(Annotation, XML) based configuration - can define beans
	@EnableAutoConfiguration
	@ComponentScan
	
	
@Component - Class becomes spring component (@ComponentScan will scan this)






