package com.otekin.dev.demo.springbootjavarecord.repsitory;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.otekinx.dev.demo.springbootjavarecord.entity.User;

@Repository
public interface UserRepository
        extends CrudRepository<User, Long> {
	List<User> findAll();
} 