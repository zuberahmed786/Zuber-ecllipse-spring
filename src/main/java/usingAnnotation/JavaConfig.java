package usingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="usingAnnotation")
public class JavaConfig {
	
	@Bean
	public Salary getSal()
	{
		return new Salary();
	}
	
	@Bean
	public Employee getEmp()
	{
		return new Employee(getSal());
	}

}
