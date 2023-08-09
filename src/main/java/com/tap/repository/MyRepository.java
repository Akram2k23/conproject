package com.tap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tap.entity.Employe;

@Repository
public interface MyRepository extends JpaRepository<Employe, Integer> {
	
	@Query(value = "select * from employe where emp_name like 'A%'", nativeQuery = true)
	List<Employe> getEmployeStartWithA();

}
