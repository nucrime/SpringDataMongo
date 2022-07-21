package by.ak.springdatamongo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@Accessors(chain = true)
public class User {
  private String id;
  private String name;
  private String lastName;
  private String email;
}
