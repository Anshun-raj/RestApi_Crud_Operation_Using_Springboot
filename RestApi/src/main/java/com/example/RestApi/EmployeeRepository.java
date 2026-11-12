package com.example.RestApi;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<employee,Integer>
{

}
