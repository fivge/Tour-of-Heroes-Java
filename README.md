### gradle

> bin

linux&macOS `gradlew`

Windows `gradlew.bat`

Java `gradle\`

> config

`build.gradle`

> cli

```bash
# task
./gradlew task

# spring boot
./gradlew bootRun

# build
./gradlew build
java -jar build/libs/xxxx-0.1.0.jar
```

> refs

[用 Gradle 构建 Spring Boot 项目](https://www.cnblogs.com/davenkin/p/gradle-spring-boot.html)

### maven

<https://juejin.im/post/5a4a5e2bf265da4322418d7f>

[maven 2 gradle](http://sagioto.github.io/maven2gradle/)

### mysql

> install

Note : Starting with MariaDB 10.4.3, a pre-built data directory is no longer provided, and users need to run mysql_install_db.exe to create a data directory.[\_link](https://mariadb.com/kb/en/library/installing-mariadb-windows-zip-packages/)

```bash
### 初始化数据库
mysql_install_db
### 安装到 service
mysqld --install mariadb # mariadb 为自定义服务名
### 启停服务
net start mariadb
net stop mariadb
### 设置密码
mysqladmin -u root password "[enter your password here]";
```

more <https://www.jb51.net/article/152242.htm>

> client

##### `mycli`

```bash
mycli -u root -p1234
```

> config

##### user

```sql
mysql> create database db_example; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
```

###### time_zone

```sql
mariadb root@localhost:(none)> show variables like '%time_zone%';

+------------------+---------+
| Variable_name    | Value   |
+------------------+---------+
| system_time_zone | unknown |
| time_zone        | SYSTEM  |
+------------------+---------+
2 rows in set
Time: 0.017s
```

`mariadb-10.4.8-winx64\data\my.ini`

```ini
[mysqld]
default-time_zone='+8:00'
```

```powershell
net stop mariadb
net start mariadb
```

### spring boot 2.x

<https://github.com/dyc87112/SpringBoot-Learning/tree/2.x>

<https://github.com/JeffLi1993/springboot-learning-example>

#### Init

##### with gradle

<https://guides.gradle.org/building-spring-boot-2-projects-with-gradle/>

#### RESTful API

相比 1.x 版本教程中自定义 set 和 get 函数的方式，这里使用@Data 注解可以实现在编译器自动添加 set 和 get 函数的效果。该注解是 lombok 提供的

#### Mysql CRUD

##### Spring Data repository

[Accessing data with MySQL
](https://spring.io/guides/gs/accessing-data-mysql/#initial)

[CrudRepository JpaRepository PagingAndSortingRepository](https://www.jianshu.com/p/cbf0a7c5c985)

#### More

##### Arch

### wrk

[`wrk`](https://github.com/wg/wrk)
