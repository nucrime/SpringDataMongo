package by.ak.springdatamongo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  @Transactional
  public Iterable<User> getUsers() {
    return userRepository.findAll();
  }
}
