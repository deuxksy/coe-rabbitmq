# RabbitMQ
> RabbitMQ spring boot client sample project

본 예제는 Spring boot 기준으로 메세지를 보내고 받는 샘플 프로젝트이다.

## Getting started

- System Requirements

| Type      	| Tool         	| Version      	|
|-----------	|--------------	|--------------	|
| Compiler  	| JDK         	| 1.8 이상     	|
| Builder   	| maven        	| 3.2 이상     	|
| Framework 	| Spring Boot  	| 2.0.2        	|

- Initial Configuration

```yml
spring:
  rabbitmq:
    host: localhost
    port: 5670
    username: guest
    password: guest
```

## Related Links

- [MSA CoE Guide](https://coe.gitbook.io/guide/messaging/rabbitmq)

- [Official site](https://www.rabbitmq.com/)
