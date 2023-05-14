package homeWork4;

/**
 * 7) Обычный внутренний класс */

public class FirstUser {
    private String login;
    private String password;

    public FirstUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
    private class Query {

        public void printToLog() {
            System.out.printf("Пользователь (логин: %s, пароль: %s) отправил запрос.\n", login, password);
        }
    }

    public static void main(String[] args) {
        FirstUser user = new FirstUser("King134", "12345");
        user.createQuery();
        Query query = new FirstUser("Max356","qweasd").new Query();
        query.printToLog();
    }
}
