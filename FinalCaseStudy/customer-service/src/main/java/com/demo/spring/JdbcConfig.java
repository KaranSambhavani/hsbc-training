 package com.demo.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.demo.spring")
public class JdbcConfig {

	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		ds.setUrl("jdbc:derby://localhost:1527/demodb");
		
		return ds;
		
		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds)
	{
		return new JdbcTemplate(ds);
	}
}
