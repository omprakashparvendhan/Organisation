package com.ash.programming.application;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jndi.JndiObjectFactoryBean;


@SpringBootApplication(scanBasePackages = {"com"})
@MapperScan("com.ash.programming.dao.mapper")
public class OrganisationApplication  extends SpringBootServletInitializer{
	
	private String JNDI_DS = "java:jboss/organisationDS";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(OrganisationApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(OrganisationApplication.class);
    }
	
	@Bean
	public DataSource dataSource() throws IllegalArgumentException, NamingException {
		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName(JNDI_DS);
		jndiObjectFactoryBean.setProxyInterface(DataSource.class);
		jndiObjectFactoryBean.setResourceRef(true);
		jndiObjectFactoryBean.afterPropertiesSet();
		return (DataSource)jndiObjectFactoryBean.getObject();
		
	}
	
}
