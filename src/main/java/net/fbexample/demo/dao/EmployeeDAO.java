package net.fbexample.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.fbexample.demo.model.EmployeeModel;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeModel, Long> {

}
