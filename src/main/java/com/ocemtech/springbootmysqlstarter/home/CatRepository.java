package com.ocemtech.springbootmysqlstarter.home;

import org.springframework.data.repository.CrudRepository;


public interface CatRepository extends CrudRepository<Cats,Integer> {
}
