package com.website.website;

import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<UserDetails,Integer> {

    void findAllById(int id);
    
}
