package KR.battleShip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

//@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BattleShipApplication {
@Autowired
EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BattleShipApplication.class, args);
	}

	@PostConstruct
	private void init(){
		Employee employee = new Employee();
		employee.setFirstName("Andriy");
		employee.setLastName("Alast");
		employee.setTitle("administrator");
		repository.save(employee);


	}
}
