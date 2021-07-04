package com.ash.programming.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages = {"com"})
@MapperScan("com.ash.programming.dao.mapper")
public class OrganisationApplication  extends SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OrganisationApplication.class);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(OrganisationApplication.class, args);
	}

}
