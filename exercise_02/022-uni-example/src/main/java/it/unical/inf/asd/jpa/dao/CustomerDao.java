package it.unical.inf.asd.jpa.dao;

import it.unical.inf.asd.jpa.entities.other.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long> {}
