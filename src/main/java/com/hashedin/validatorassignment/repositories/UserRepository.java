package com.hashedin.validatorassignment.repositories;

import com.hashedin.validatorassignment.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
