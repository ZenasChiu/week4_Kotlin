# Week4 (3)

- ### Week1-2 [Resourse GitLAB](https://gitlab.com/ZenasChiu/Week1_project)
- ### Week3 bulid a Spring boot Java login api with database
  - Development tools : Intellij + mySQL database
  
- ### Week4 learning about Kotlin
- ### Extra topic :
  - Encryption : one way / two way(data that can be return)
    - 1 : MD5
      - [介紹 MD5 ](https://ithelp.ithome.com.tw/articles/10293072)
    - 2 : Advanced Encryption Standard AES 
      - [對稱式加密演算法 - 大家都愛用的 AES](https://ithelp.ithome.com.tw/articles/10249488)
  - Login : JWT Token 
    - [什麼是JWT？認識 JSON Web Token 認證機制](https://tw.alphacamp.co/blog/jwt-json-web-token)
    - [Medium 透過 JWT 實作驗證機制 ](https://medium.com/%E9%BA%A5%E5%85%8B%E7%9A%84%E5%8D%8A%E8%B7%AF%E5%87%BA%E5%AE%B6%E7%AD%86%E8%A8%98/%E7%AD%86%E8%A8%98-%E9%80%8F%E9%81%8E-jwt-%E5%AF%A6%E4%BD%9C%E9%A9%97%E8%AD%89%E6%A9%9F%E5%88%B6-2e64d72594f8)
    - [Day 29 - Spring Boot 想要資料令牌要先帶來!－ JWT ](https://ithelp.ithome.com.tw/articles/10250968)
    
  
## Week 3 Spring information : 
Spring --> Framework (sets of rulse)
Spring boot help solving the dependency problem

### @ Inversion of Control (IoC) / Dependency Injection (DI)
[Inversion of Control (IoC) 的那一兩個心得](https://medium.com/jastzeonic/inversion-of-control-ioc-%E7%9A%84%E9%82%A3%E4%B8%80%E5%85%A9%E5%80%8B%E5%BF%83%E5%BE%97-d2324cb8b5f1)

IoC :
- where scan and create a set of "Service"/"Dependency" Bean(class) that required to use after in the controller first
  - Flexable 
  - Not bulid-in
  - 
DI :
- Get and inject the Bean(class) from controller to required class to use
  - Changeable while runtime


### @ Aspected-Oriented Programming (AOP)
[來談談 AOP (Aspect-Oriented Programming) 的精神與各種主流實現模式的差異](https://tech-blog.cymetrics.io/posts/maxchiu/aop/)

Mainly different concept of OOP
- OOP using to - Redundant / + Reusable, Code development divide and manage
- AOP using to adding consistent program base on time flow
- Actually AOP is added into OOP (reduce logging / security / database action)
  - Example : 
    - Each program required to log (Start and Finish)
    - OOP : adding print/log in Front and End
    - AOP : adding a annotation and detect by Spring AOP 
      - where autolog while tracker the Startpoint and Endpoint

### @ Spring Annotation
[30天帶你潮玩Spring Boot Zone系列 第 1 篇 - Spring Boot 是什麼 ](https://ithelp.ithome.com.tw/articles/10213097)

#### Main Practice of create a user loginSystem 
[My project(GitHub)](https://github.com/ZenasChiu/Quiz3)

For starting scan:
- @SpringBootApplication
- @ComponentScan({"com.example.quiz3","com.example.quiz3.web.model","com.example.quiz3.web.controller","com.example.quiz3.services","com.example.quiz3.repository"})
- @EntityScan({"com.example.quiz3","com.example.quiz3.web.model","com.example.quiz3.web.controller","com.example.quiz3.services","com.example.quiz3.repository"})


For IoC :
- @Service 
- @Bean
- @Component


For DI :
- @Autowired
    
For Database :
- @Repository
- @Entity
- @Id 
- @Column(unique=true,length = 50)
- @GeneratedValue(strategy = GenerationType.IDENTITY)
- @JsonProperty("id")

For RESTapi:
- @Repository
- @RequestMapping("uri")
- @GetMapping
- @PostMapping


## Week 4 KotLin
Different with JAVA
- set Variable : 
  - Var : changable Variable
  - Val : Only Read
      ```
      var {data_name} : Data_type = {data}
      {data_name} = {new data}
  
      val {data_name} : Data_type = {data}
      Can't --> {data_name} = {new data}
      ```

- set Control flow :
  - when like Switch(JAVA)
    ```
       val button = "A"
       println( 
       when(button){
       "A" -> "Yes"
       "B" -> "NO"
       "X" -> "Menu"
       "Y" -> "Nothing"
       else -> "There is no such button"})
    ```
- 

# System Rebuild with KOTLIN : 
[AWS 什麼是 RESTful API？](https://aws.amazon.com/tw/what-is/restful-api/)

[My Project Link](https://github.com/ZenasChiu/KotlinQuiz3/tree/W4D4)


Rebulid with 
- [ ] Kotlin + spring boot
  - source :[]() 
- [ ] Hibernate instruction
  - source :[]() 
- [ ] JWT token
  - source :[]() 
- [ ] Aes 256 for password
  - source :[]() 
- [ ] AOP :
  - source :[Declear cut point](https://docs.spring.io/spring-framework/reference/core/aop/ataspectj/pointcuts.html)
- [ ] MD5
  - source :[]()

Task : 
- *Package.Class*
  - [ ] Service 
    - [x] Auth
    - [x] Test
  - [x] Entity / Component

    - [x] Users
      - id long 20 no null Key auto_increment 
      - email string 50 UNI key
      - password string 120
      - username string 20 UNI key

    - [x] Roles
      - id int 11 no null key auto_increment
      - name string 20 

    - [x] User_Roles
      - user_id long 20 key 
      - role_id int 11 key 

  - [ ] Controller 
    - [x] Auth
    - [x] Test
  - [ ] Repository
    - [x] 
  
- *Function* 
  - /auth/
    - [ ] signin
    - [x] signup
    - [ ] signout
  - /test/
    - [ ] all
    - [ ] user
    - [ ] mod
    - [ ] admin