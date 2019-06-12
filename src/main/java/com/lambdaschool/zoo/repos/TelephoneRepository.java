package com.lambdaschool.zoo.repos;

import com.lambdaschool.zoo.model.Telephone;
import com.lambdaschool.zoo.model.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Long> {
}
