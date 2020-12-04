package com.example.restbasedjpaspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restbasedjpaspringboot.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
