package com.elegantly.rocks.springdatademo.repositories;

import com.elegantly.rocks.springdatademo.entity.Employee;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by github.com/shibli049 on 2/22/18.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

  List<Employee> findByLastNameIgnoreCase(String lastName);

  List<Employee> findTop2ByOrderBySalaryDesc();
}
