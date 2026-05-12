package exam;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {

    private Map<String, User> users = new HashMap<>();

    public UserDatabase() {
        // Pre-loaded users
        users.put("student1", new User("student1", "pass123", "Ravi Sharma",  "ravi@example.com"));
        users.put("student2", new User("student2", "pass456", "Priya Mehta",  "priya@example.com"));
        users.put("student3", new User("student3", "pass789", "Amit Kumar",   "amit@example.com"));
    }

    public User findUser(String username) {
        return users.get(username);
    }
}
