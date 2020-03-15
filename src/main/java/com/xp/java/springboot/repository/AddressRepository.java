package com.xp.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xp.java.springboot.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
