package com.aradhyagupta25.SpringBootDemo2.repository;

import com.aradhyagupta25.SpringBootDemo2.model.Laptop;
import org.springframework.stereotype.Repository;


// this class is responsible for connection with the database and all the CRUD ops takes place here.
@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Saved In Database");
    }


}
