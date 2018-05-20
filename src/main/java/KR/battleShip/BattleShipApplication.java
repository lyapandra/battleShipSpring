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
ShipRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BattleShipApplication.class, args);
	}

	@PostConstruct
	private void init(){
		Ship ship1 = new Ship();
		ship1.setFirstPart("A1");
		ship1.setLastPart("A3");
		ship1.setName("Admiral");
		ship1.setType("3rd");
		repository.save(ship1);
		
		Ship ship2 = new Ship();
		ship2.setFirstPart("C1");
		ship2.setLastPart("C2");
		ship2.setName("Carol");
		ship2.setType("2nd");
		repository.save(ship2);

		Ship ship3 = new Ship();
		ship3.setFirstPart("E1");
		ship3.setLastPart("E1");
		ship3.setName("Eagle");
		ship3.setType("1st");
		repository.save(ship3);


	}
}
