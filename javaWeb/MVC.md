## 10.2、MVC三层架构

![20200508154512751](F:\java_workspace\kuang_spring_code\javaWeb\20200508154512751.png)

**Model**

- 业务处理 ：业务逻辑（Service）

- 数据持久层：CRUD （Dao - 数据持久化对象）

  

**View**

- 展示数据

- 提供链接发起Servlet请求 （a，form，img…）

  

**Controller （Servlet）**

- 接收用户的请求 ：（req：请求参数、Session信息….）

- 交给业务层处理对应的代码

- 控制视图的跳转


```java
登录--->接收用户的登录请求--->处理用户的请求（获取用户登录的参数，username，password）---->交给业务层处理登录业务（判断用户名密码是否正确：事务）--->Dao层查询用户名和密码是否正确-->数据库
```



## 11、Filter （重点)

比如 Shiro安全框架技术就是用Filter来实现的

Filter：过滤器 ，用来过滤网站的数据；

处理中文乱码
登录验证….
（比如用来过滤网上骂人的话，我***我自己 0-0）

![20200508154536177](F:\java_workspace\kuang_spring_code\javaWeb\20200508154536177.png)




