package br.com.hastydev.hastydev.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.hastydev.hastydev.model.Person;

@Repository
public interface Repositories extends CrudRepository<Person, Integer>{
    
}
