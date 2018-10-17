#基础镜像
FROM tomcat:8

#作者
MAINTAINER "zhang <123@qq.com>"

# pom 中的参数
ARG JAR_FILE

# 环境变量
ENV PROFILE default

# 删除 webapps 下的目录
RUN rm -rf /usr/local/tomcat/webapps/*

# 复制 war 变改名为 ROOT.war
ADD target/${JAR_FILE} /usr/local/tomcat/webapps/ROOT.war

# 容器暴露的端口
EXPOSE 8080

# 指定启动容器时默认执行的命令
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]