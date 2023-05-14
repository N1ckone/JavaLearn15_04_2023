package homeWork4;

/** 9) Внешний статический класс */

public class ThirdUser {
    private String login;
    private String password;

    public ThirdUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void createQuery() {
        ThirdUser.Query query = new ThirdUser.Query();
        query.printToLog(login, password);
    }
    public static class Query {

        public void printToLog(String login, String password) {
            System.out.printf("Пользователь (логин: %s, пароль: %s) отправил запрос.\n", login, password);
        }
    }

    public static void main(String[] args) {
        ThirdUser user = new ThirdUser("King134", "12345");
        user.createQuery();
        ThirdUser.Query query = new ThirdUser.Query();
        ThirdUser user2 = new ThirdUser("Vasya341", "942rwj");
        query.printToLog(user2.getLogin(), user2.getPassword());

    }
}
