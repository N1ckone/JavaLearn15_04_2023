package homeWork5;

public class Worker implements Person {

    private String name;
    private int age;
    private int accountNumber;
    private String occupation;

    public Worker(String name, int age, int accountNumber, String occupation) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOccupation() {
        return occupation;
    }
}
