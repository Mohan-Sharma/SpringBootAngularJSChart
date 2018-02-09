package org.msharma.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootApplication(exclude = DispatcherServletAutoConfiguration.class)
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = {"org.msharma.spring.config"})
public class SpringBootAngularJsChartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularJsChartApplication.class, args);
	}
}
