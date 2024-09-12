package com.orion.bird.repository;
import com.orion.bird.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends CrudRepository<Users, Long> {}
