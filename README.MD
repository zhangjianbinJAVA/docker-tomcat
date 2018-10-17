### 启动命令
```
docker run -d -p 9080:8080 --name docker-tomcat zhangjianbin/springcloud-cn/docker-tomcat:1.0-SNAPSHOT
```


## java 环境信息
```
java -version 

openjdk version "1.8.0_181"
OpenJDK Runtime Environment (build 1.8.0_181-8u181-b13-1~deb9u1-b13)
OpenJDK 64-Bit Server VM (build 25.181-b13, mixed mode)
```

## tomcat 环境信息
```
/usr/local/tomcat/bin/version.sh

Using CATALINA_BASE:   /usr/local/tomcat
Using CATALINA_HOME:   /usr/local/tomcat
Using CATALINA_TMPDIR: /usr/local/tomcat/temp
Using JRE_HOME:        /docker-java-home/jre
Using CLASSPATH:       /usr/local/tomcat/bin/bootstrap.jar:/usr/local/tomcat/bin/tomcat-juli.jar
Server version: Apache Tomcat/8.5.34
Server built:   Sep 4 2018 22:28:22 UTC
Server number:  8.5.34.0
OS Name:        Linux
OS Version:     3.10.0-229.20.1.el7.x86_64
Architecture:   amd64
JVM Version:    1.8.0_181-8u181-b13-1~deb9u1-b13
JVM Vendor:     Oracle Corporation
```