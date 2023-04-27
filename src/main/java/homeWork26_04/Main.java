package homeWork26_04;

public class Main {
    public static void main(String[] args) {

        // ДЗ 3
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(
                "Иванов Иван Иванович", "Software engineer",
                "Ivanov.Ivan@it.com", "+7-999-888-77-66",
                200000, 25
        );
        employees[1] = new Employee(
                "Андреева Анна Алексеевна", "Product-manager",
                "Andreeva.Anna@it.com", "+7-985-333-77-24",
                185000, 26
        );
        employees[2] = new Employee(
                "Фёдоров Алексей Владимирович", "Finance director",
                "Fedorov.Alexei@it.com", "+7-979-239-24-25",
                350000, 46
        );
        employees[3] = new Employee(
                "Некрасова Людмила Михайловна", "Accountant",
                "Nekrasova.Lydmila@it.com", "+7-925-987-54-72",
                200000, 49
        );
        employees[4] = new Employee(
                "Керсанов Михаил Юрьевич", "UI-UX designer",
                "Kersanov.Michel@it.com", "+7-989-926-23-80",
                165000, 24
        );

        for (Employee worker : employees) {
            if (worker.getAge() > 40) System.out.println(worker);
        }
        System.out.println("_________________________________________________");

        //ДЗ 4
        Animal dog = new Dog("Jack");
        System.out.println(dog.getName());
        dog.run(500);
        dog.swim(10);
        dog.jump(0.5);

        System.out.println("_________________________________________________");
        Animal dog2 = new Dog("Harry");
        System.out.println(dog2.getName());
        dog2.run(500);
        dog.swim(10);
        dog.jump(0.5);

        System.out.println("_________________________________________________");
        Animal cat = new Cat("Vasya");
        System.out.println(cat.getName());
        cat.run(200);
        cat.swim(100);
        cat.jump(2);

        System.out.println("_________________________________________________");
        Animal cat2 = new Cat("Barsik");
        System.out.println(cat2.getName());
        cat2.run(200);
        cat2.swim(100);
        cat2.jump(2);

    }
}
