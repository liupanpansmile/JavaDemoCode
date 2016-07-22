# JavaDemoCode
学习计划

	知识点												状态
1.Java继承以及多态										 Y
2.Java内存分布											 
3.abstract interface									 Y
4.类及方法的访问权限									 Y
5.常用的集合类                                           部分
6.迭代器、遍历 Enumeration                               Y
7.文件读写  											 Y
8.异常处理 											     Y
9.多线程的基本使用
10.同步、互斥、锁
11.深拷贝 浅拷贝
12.instanceof ==  equals								 Y										
13.字符串使用  StringBuilder 及理解
14 泛型编程     										 Y
15. IClonable ISerializable   						     
16.Comparable Comparator							     Y
17.Collections
18.Java编程规范
19 WeakReference LocalThread
20.Date、时间格式转换




---------------------------
Tomcat  使用
--------------
Maven使用
-------------
MySql Redis使用
-------------
Spring使用



## 阶段一：（以《java 核心技术I／II》为主线，网上查询资料细化）
### 1. 泛型编程（泛型方法 泛型类，主要是自定义泛型方法，参数继承 参数约束）
### 2. 集合类（继承关系，实现原理，ArrayList LinkedList Queue HashMap HashTable Set）
### 3. 异常机制，异常继承关系，怎么合理的使用异常
### 4. IO操作（字节流 字符流 Apache Common CopyToStirng ） 资源文件的读取  ClassLoader 
### 5. XML 读取成对象，Attribute Element（可以结合后端的代码，metric-name xxx.xml）
### 6. 使用注解，自定义注解，反射获取注解的值，最好配合真实的势力
### 7. 多线程编程
### 8. apache 常用的工具包(CollectionUtils ... Joda Time)
### 9.mysql 使用 （常用的命令 多表查询 高效多表查询 索引）


## 阶段二：常用框架的深入学习
### 1.Tomcat 实现机制（之前看过一部分    
		GenericServet HttpServlet(service doGet doPost) ServletConfig
		ServletContext
		Filter
		Listener

### 2.Mybatis (优先级高)& Hibernate
		Mybatis与Spring结合
		数据库字段到Java类的映射
		多级缓存机制
### 3.Spring & Spring MVC
		DI（Ioc）：Spring容器管理，Bean初始化的时机， ApplicationContext  ClassPathXmlApplicationContext 
		AOP： 动态代理，cglib，Aspect JoinPoint CutPoint Advice  
		Transaction 管理

		DispatcherServlet 加载xml，初始化WebApplicationContext
		HandlerMapping HandlerAdapter HandlerExecutionChain  HandlerInterceptor(preHandler postHandler afterCimpetion)
		HttpMessageConverter (@RequestBody  @ResponseBody)
		Resolver
		ModelAndView


### 4. Kafka 
		topic broker partition producer consumer replication offset管理 KafkaOffsetMonitor 
### 5. Druid
		broker  historial real-time coordinate 
### 6. Zookeeper 作用

## 阶段三：高级篇 架构 代码设计
### 1. 重读 《 敏捷软件开发 》
###	2. 分析Spring Spring MVC源码
###	3. git上阅读 Spring MVC 项目
