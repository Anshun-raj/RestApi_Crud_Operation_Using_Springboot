package com.example.RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class RestApiApplication {

    @Autowired
    EmployeeRepository emprep;
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

    @GetMapping("/getdata")
    public Iterable<employee> getData()
    {
        return emprep.findAll();
    }

    @PostMapping("/postdata")
    public employee postData(@RequestBody employee emp)
    {
        return emprep.save(emp);
    }

    @DeleteMapping("/deldata/{id}")
    public String delData(@PathVariable int id)
    {
        emprep.deleteById(id);
        return "Record Deleted";
    }

    @PutMapping("/updatedata/{age}")
    public employee updateData(@RequestBody employee emp)
    {
        return emprep.save(emp);
    }


}
