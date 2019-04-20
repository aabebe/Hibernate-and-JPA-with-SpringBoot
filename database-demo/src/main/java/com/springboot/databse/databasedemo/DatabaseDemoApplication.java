package com.springboot.databse.databasedemo;

import com.springboot.databse.databasedemo.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        // get the data from repo and post it into the log
        logger.info("All users -> {}",personRepository.findAll());
        logger.info("User id 10001 -> {}",personRepository.findById(1001));

    }
}
