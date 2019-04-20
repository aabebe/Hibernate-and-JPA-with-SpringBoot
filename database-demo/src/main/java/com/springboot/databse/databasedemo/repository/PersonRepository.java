package com.springboot.databse.databasedemo.repository;

import com.springboot.databse.databasedemo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    // select * form person
    public List<Person> findAll(){

       return
               jdbcTemplate.query("select * from person",
                       new BeanPropertyRowMapper<>(Person.class));
    }
    public Person findById(int userId){
        return
                jdbcTemplate.queryForObject("select * from person where id=?",
                        new Object []{userId},
                        new BeanPropertyRowMapper<>(Person.class));
    }

}
