1.Purpose
	（1）学习Spring MVC 的使用，理解MVC思想
	（2）Spring MVC RESTful 风格使用，实现用户的增删改查
	（3）增删该查结合mybatis的使用

2.Usage:
	http://localhost:8080/user/users  (Show All Users)
	http://localhost:8080/user/add  (Add an user and click to submit)
	http://localhost:8080/user/update  (Modify an user)
	delete users in page http://localhost:8080/user/users (click delete href)

3.总结
（1）创建SqlSession，对数据库进行增删改后，需要进行commit，否则数据没有更新到DB。
（2）代码中先一版创建了UserDaoImpl,后来删除UserDaoImpl，直接使用SqlSession.getMapper(UserDao.class)获取UserDao的实例
 (3)RESTful 风格  /user/add       -->Controller 解析 /user/add
 				  /user/username  -->Controller 解析: /user/{username}


个人刚开始学习 Spring ，Spring MVC，Mybatis，能力有限，欢迎指教。