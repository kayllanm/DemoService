package com.ai.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "user")
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByUserName(@Param("userName") String userName);

}
