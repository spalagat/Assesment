package com.assesment.problem1.repositories;

import com.assesment.problem1.entities.Lps;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends CrudRepository<Lps,String> {
}
