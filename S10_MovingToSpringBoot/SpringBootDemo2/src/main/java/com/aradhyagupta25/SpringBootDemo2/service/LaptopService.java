package com.aradhyagupta25.SpringBootDemo2.service;

import com.aradhyagupta25.SpringBootDemo2.repository.LaptopRepository;
import com.aradhyagupta25.SpringBootDemo2.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service       // will behave same as Component.
public class LaptopService {

    @Autowired
    private LaptopRepository repository;

    public void addLaptop(Laptop lap1){
        System.out.println("Service method called.");
        repository.save(lap1);
    }

    public boolean isGoodForProg(Laptop lap1){
        return true;
    }

}
