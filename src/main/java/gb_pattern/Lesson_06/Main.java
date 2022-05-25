package gb_pattern.Lesson_06;

public class Main {
    public static void main(String[] args) {

        UserMapper userMapper = Registry.getUserMapper();

        User user = userMapper.find(1);
        System.out.println(user.getNickName());

        User renameNick = userMapper.getUser(1);
        renameNick.setNickName("NickName");
        System.out.println(renameNick.toSting());
    }
}
