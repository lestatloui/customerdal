package com.bharath.student.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.bharath.student.dal.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
