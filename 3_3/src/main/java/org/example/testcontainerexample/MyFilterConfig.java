package org.example.testcontainerexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.JdbcClient;

@Configuration
public class MyFilterConfig {

    @Bean
    public MyFilter filterOne(JdbcClient jdbcClient) {
        return new MyFilter();
    }
//
//    @Bean
//    public MyFilter filterTwo() {
//        return new MyFilter();
//    }

}
