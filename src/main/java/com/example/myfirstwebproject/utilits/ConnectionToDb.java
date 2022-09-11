package com.example.myfirstwebproject.utilits;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@Configuration
public class ConnectionToDb implements WebMvcConfigurer {
    @Bean
    public DataSource dataSource () {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("superpassword");

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate () {
        return new JdbcTemplate(dataSource());
    }


}
