package homeWork4;

/**
 *8) Локальный внутренний класс  */

public class SecondUser {
    private String login;
    private String password;

    public SecondUser(String login, String password) {
        this.login = login;
        this.password = password;
    }



    public void createQuery() {

        class Query{
            public void printToLog() {
                System.out.printf("Пользователь (логин: %s, пароль: %s) отправил запрос.\n", login, password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }



    public static void main(String[] args) {
      SecondUser user = new SecondUser("jack034", "yuiophjkl2");
      user.createQuery();

    }
}
