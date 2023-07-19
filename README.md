# Week4(3)

## Week 3 Spring information :
Spring --> Framework (sets of rulse)
Spring boot help solving the dependency problem

### @ IoC 
where scan and create a set of "Service"/"Dependency" Bean(class) that required to use after in the controller first
- Flexable 
- Not bulid-in

### @ Dependency Injection
Get and inject the Bean(class) from controller to required class to use
- Changeable while runtime

### @ AOP
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
#### Main Practice of create a user loginSystem 
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



