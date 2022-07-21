package by.ak.springdatamongo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoTransactionManager;

@Configuration
public class Config {
  @Bean
  public MongoTransactionManager mongoTransactionManager() {
    return new MongoTransactionManager();
  }
}
