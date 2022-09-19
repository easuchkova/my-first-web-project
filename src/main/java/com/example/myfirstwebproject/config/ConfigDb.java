package com.example.myfirstwebproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
public class ConfigDb implements WebMvcConfigurer /*пока осталась с этой имплементацией, без нее что-то куда-то летит*/{
    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {

            Properties prop = new Properties();

            if (input != null) {
                prop.load(input);
            } else {
                throw new FileNotFoundException("There is no property file");
            }

            dataSource.setDriverClassName(prop.getProperty("spring.datasource.driver-class-name"));
            dataSource.setUrl(prop.getProperty("spring.datasource.url"));
            dataSource.setUsername(prop.getProperty("spring.datasource.username"));
            dataSource.setPassword(prop.getProperty("spring.datasource.password"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource());
    }
}

