package in.quastech.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.quastech.bean.Address;
import in.quastech.bean.Employee;
@Configuration
public class SpringConfigFile {
	@Bean
	Address addObj() {
		Address add=new Address("Mulund",421306);
		return add;
		
	}
	
	
	@Bean
	Employee empObj() {
		Employee emp=new Employee(101, "Raj",addObj() );
		return emp;
		
	}

}
