package gb_pattern.Lesson_06;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private static final Map<Integer, User> hash = new HashMap<>();

    public IdentityMap() {
    }

    public static User isInto(int id) {
        User user;
        user = hash.get(id);
        return user;
    }

    public static void adUser(User user) {
        hash.put(user.getId(), user);
    }
}
