package com.ai.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "product")
public interface ProductRepository extends CrudRepository<Product, Long> {

	List<User> findByProductName(@Param("productName") String productName);

}
