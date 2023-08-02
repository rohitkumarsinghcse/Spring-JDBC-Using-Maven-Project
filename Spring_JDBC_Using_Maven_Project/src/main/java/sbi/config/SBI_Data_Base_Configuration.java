package sbi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SBI_Data_Base_Configuration 
{
					@Bean  
					 public JdbcTemplate  getJDBCTemplate()
					 {
						DriverManagerDataSource dataSource = new DriverManagerDataSource();
						
						dataSource.setUrl("Jdbc:oracle:thin:@localhost:1521:orcl");
						dataSource.setUsername("c##coder");
						dataSource.setPassword("coder");
						
						return  new JdbcTemplate(dataSource);
					 }
 
}
