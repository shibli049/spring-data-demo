package com.elegantly.rocks.springdatademo;

import com.elegantly.rocks.springdatademo.entity.Employee;
import com.elegantly.rocks.springdatademo.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataDemoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringDataDemoApplication.class);

	@Autowired
	EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			repository.save(new Employee("Maqsudul", "Alam", 50000));
			repository.save(new Employee("Hideshi", "Alam", 25000));
			repository.save(new Employee("John", "Doe", 22000 ));
			repository.save(new Employee("Jane", "Bose", 18000));
			repository.save(new Employee("Satten", "Bose", 55000));


			log.info("------------------ findAll ------------------");
			for (Employee employee : repository.findAll()) {
				log.info(employee.toString());
			}
			log.info("");

			Employee employee = repository.findOne(1);
			log.info("------------------  findOne ------------------");
			log.info(employee.toString());
			log.info("");

			log.info("------------------ findByLastNameIgnoreCase ------------------");
			for (Employee alam : repository.findByLastNameIgnoreCase("bose")) {
				log.info(alam.toString());
			}
			log.info("");

			log.info("------------------ findTop2ByOrderBySalaryDesc ------------------");
			for (Employee emp : repository.findTop2ByOrderBySalaryDesc()) {
				log.info(emp.toString());
			}
			log.info("");
		};
	}
}
