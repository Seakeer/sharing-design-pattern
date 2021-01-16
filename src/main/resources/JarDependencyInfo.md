# JarDependencyInfo

- cglib
  - 代理模式
- mysql-connector-java
  - 抽象工厂模式
- tomcat-catalina
  - 责任链模式
- tomcat-jasper
  - `org.apache.jasper.servlet.JspServlet`
  - 为启动tomcat
- jakarta-ee
  - 门面模式
- javaee & jsf-impl
  - 状态模式
  - 不使用jakartaee & jakarta.faces 是因为jakarta.faces没有`ActionLifecycle`，jsf-impl需要javaee-api

```xml

<properties>
  <java.version>1.8</java.version>
  <maven.plugin.version>3.6.1</maven.plugin.version>
  <cglib.version>3.3.0</cglib.version>
  <jdbc.version>8.0.22</jdbc.version>
  <tomcat.version>10.0.0</tomcat.version>
  <tomcat-jasper.version>10.0.0</tomcat-jasper.version>
  <jakartaee.version>9.0.0</jakartaee.version>
  <javaee.version>8.0.1</javaee.version>
  <jsf.version>2.2.20</jsf.version>
</properties>

<dependencies>
<!-- https://mvnrepository.com/artifact/cglib/cglib -->
<dependency>
  <groupId>cglib</groupId>
  <artifactId>cglib</artifactId>
  <version>${cglib.version}</version>
</dependency>

<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <version>${jdbc.version}</version>
</dependency>


<!-- https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-catalina -->
<dependency>
  <groupId>org.apache.tomcat</groupId>
  <artifactId>tomcat-catalina</artifactId>
  <version>${tomcat.version}</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jasper -->
<dependency>
  <groupId>org.apache.tomcat</groupId>
  <artifactId>tomcat-jasper</artifactId>
  <version>${tomcat-jasper.version}</version>
</dependency>

<!-- https://mvnrepository.com/artifact/jakarta.platform/jakarta.jakartaee-api -->
<dependency>
  <groupId>jakarta.platform</groupId>
  <artifactId>jakarta.jakartaee-api</artifactId>
  <version>${jakartaee.version}</version>
  <scope>provided</scope>
</dependency>

<!-- https://mvnrepository.com/artifact/javax/javaee-api -->
<dependency>
  <groupId>javax</groupId>
  <artifactId>javaee-api</artifactId>
  <version>${javaee.version}</version>
  <!--参与编译会导致tomcat有问题-->
  <scope>test</scope>
</dependency>

<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-impl -->
<dependency>
  <groupId>com.sun.faces</groupId>
  <artifactId>jsf-impl</artifactId>
  <version>${jsf.version}</version>
</dependency>

<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-api -->
<!--        <dependency>-->
<!--            <groupId>com.sun.faces</groupId>-->
<!--            <artifactId>jsf-api</artifactId>-->
<!--            <version>2.2.20</version>-->
<!--        </dependency>-->
  
 <!-- https://mvnrepository.com/artifact/org.glassfish/jakarta.faces -->
 <!--        <dependency>-->
 <!--            <groupId>org.glassfish</groupId>-->
 <!--            <artifactId>jakarta.faces</artifactId>-->
 <!--            <version>3.0.0</version>-->
 <!--        </dependency>-->
  
</dependencies>
```

