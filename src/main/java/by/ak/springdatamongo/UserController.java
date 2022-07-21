package by.ak.springdatamongo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController public record UserController(UserService userService) {
    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }
}
