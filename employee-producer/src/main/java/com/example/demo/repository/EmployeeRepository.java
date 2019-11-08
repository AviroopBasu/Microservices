package com.example.demo.repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "employee" , viewName = "all")
public interface EmployeeRepository extends CouchbaseRepository<Employee,Integer> {

}
