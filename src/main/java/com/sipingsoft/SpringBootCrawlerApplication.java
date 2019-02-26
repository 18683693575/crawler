package com.sipingsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @author Chuan.Chen
 * @version 1.0.0
 * @description
 * @contact chuan.chen@sipingsoft.com
 * @createTime 2019年02月26日 14:41:00
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class SpringBootCrawlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrawlerApplication.class, args);
    }
}
