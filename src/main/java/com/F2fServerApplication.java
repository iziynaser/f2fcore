package com;

import com.f2f.config.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * https://projects.spring.io/spring-security-oauth/docs/oauth2.html
 * https://spring.io/guides/tutorials/spring-boot-oauth2/
 */
@EnableScheduling
@SpringBootApplication
//@PropertySource("classpath:mysqlFile.properties")
@PropertySource("classpath:postgresFile.properties")
@EnableConfigurationProperties(StorageProperties.class)
public class F2fServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(F2fServerApplication.class, args);
    }
}
