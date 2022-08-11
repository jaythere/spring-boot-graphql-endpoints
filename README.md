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
	@EnableAutoConfiguration - enable auto configuration
	@ComponentScan - scan base package and sub package
	
	
@Component - Class becomes spring component (@ComponentScan will scan this)


Execution starts from main right ?
main method internally call run method (static method) - internally create object of spring boot app (ConfigurableApplicationContext)

	- Run (main method internally call to run method)
	- Start Stop Watch (Start)
	- Create BootstrapContext
	- arg get passed to getRunListeners - Application Runner and Command Line Runner
	- Prepare Environment - based on application.properties file
	- Print Banner
	- Create Application Context (run method create)
	- webApplicationType (Servlet in case of spring web)
	- AnnotationConfigServletWebServerApplicationContext created
	- refresh Context
	- Trigger Runners
	- Return Context (IOC Container )
	
Spring Boot Application automatically start/create applicationContext

application level configuration comes under application.properties file

@Controller
	to create controller
@ResponseBody
	to handle json data - return

we could also use @RestController in place of controller and response body

@GetMapping
	to serve as get request
	
Spring Boot internally uses converters to convert Java Object into JSON.. can see in `/student` get api's

MappingJackson2HttpMessageConverter










