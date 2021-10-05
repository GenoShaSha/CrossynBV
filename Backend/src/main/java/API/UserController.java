package API;
import Backend.Classes.User;
import org.springframework.web.bind.annotation.*;
import ch.qos.logback.core.status.Status;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")

public class UserController {

        ArrayList<User> users = new ArrayList<User>();

        @PostMapping("/login")
        public boolean loginUser(@RequestBody User user) {
            for (User other : users) {
                if (other.equals(user)) {
                    user.setLoggedIn(true);
                    return true;
                }
            }
            return false;
        }

        @PostMapping("/logout")
        public boolean logUserOut(@RequestBody User user) {
            for (User other : users) {
                if (other.equals(user)) {
                    user.setLoggedIn(false);
                    return true;
                }
            }
            return false;
    }
}
