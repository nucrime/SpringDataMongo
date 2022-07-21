package by.ak.springdatamongo.repository;

import by.ak.springdatamongo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

  User findByName(String name);
}
