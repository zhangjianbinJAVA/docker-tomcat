package com.myke.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author： zhangjianbin <br/>
 * ===============================
 * Created with IDEA.
 * Date： 2018/10/17 12:21
 * ================================
 */
@SpringBootApplication
public class DockerTomcatApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(DockerTomcatApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DockerTomcatApplication.class);
    }
}
