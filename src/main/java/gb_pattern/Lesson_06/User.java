package gb_pattern.Lesson_06;

public class User {
    private final int id;
    private String nickName;

    public User(int id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public String toSting() {
        return "Now, I am " +this.nickName + "!";
    }

    public int getId() {
        return id;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
