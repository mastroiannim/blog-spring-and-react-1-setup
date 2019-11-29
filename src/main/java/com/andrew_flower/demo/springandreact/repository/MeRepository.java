package com.andrew_flower.demo.springandreact.repository;

import com.andrew_flower.demo.springandreact.model.Me;
import org.springframework.data.repository.CrudRepository;

public interface MeRepository extends CrudRepository<Me, Long> {
}