package com.orion.bird.backEnd.dataBase.repository;
import com.orion.bird.backEnd.dataBase.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends CrudRepository<Users, Long> {}
