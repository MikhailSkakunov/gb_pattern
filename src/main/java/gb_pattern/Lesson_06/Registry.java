package gb_pattern.Lesson_06;

public class Registry {
    private static final Registry instance = new Registry();

    public static Registry getInstance() {
        return instance;
    }

    protected UserMapper userMapper = new UserMapper();

    public static UserMapper getUserMapper() {
        return getInstance().userMapper;
    }
}
