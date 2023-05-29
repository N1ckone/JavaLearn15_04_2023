package homeWork5;

public class User implements Person {
    private String login;
    private String password;
    private int userId;

    public User(String login, String password, int userId) {
        this.login = login;
        this.password = password;
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }
}
