package org.example.user;


import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class UserDAO {

    private Map<String, User> map = new HashMap<>();
    private static Long id = 0L;

    public void insert(User user) {
        user.setId(++id);
        map.put(user.getEmail(), user);
    }
    public Collection<User> select() {
        return map.values();
    }
}
