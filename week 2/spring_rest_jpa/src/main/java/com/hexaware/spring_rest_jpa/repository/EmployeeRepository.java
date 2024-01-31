package com.hexaware.spring_rest_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.spring_rest_jpa.entities.Employee;

@Repository // not mandatory
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByEname(String ename);

	List<Employee> findBySalaryGreaterThan(double salary);

    //custom query
	//native named everything works here
	@Query("select e from Employee e where e.salary Between ?1 and ?2")
	List<Employee> getBySalRange(double min, double max);
	
	@Modifying                  //for dml or ddl queries in pairig with annotation transactional
	@Query("delete from Employee e where e.ename=?1")
	int deleteByEname(String ename);

}
