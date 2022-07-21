package by.ak.springdatamongo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Slf4j
@RequiredArgsConstructor
@Component
public class Initializer implements CommandLineRunner {

  private static final int INITIAL_USERS_QUANTITY = 20;
  private final UserRepository userRepository;

  @Override
  public void run(String... args) {
    var faker = new Faker();
    log.info("Here's a fun fact I wanna tell ya... \n {}", faker.chuckNorris().fact());

    log.info("Users initialization has been started...");

    IntStream.range(0, INITIAL_USERS_QUANTITY)
        .forEach(
            i -> {
              var user = new User();
              user.setName(faker.funnyName().name())
                  .setEmail(faker.funnyName().name())
                  .setLastName(faker.funnyName().name());
              userRepository.save(user);
            });

    log.info("Goods initialized. Total: {}", INITIAL_USERS_QUANTITY);
  }
}
