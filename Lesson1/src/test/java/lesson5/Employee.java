package lesson5;

public class Employee {
    private String name;
    private String email;
    private String position;
    private String number;
    private int age;
    private int salary;

    public Employee(String name, String email, String position, String number, int age, int salary) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.number = number;
        this.age = age;
        this.salary = salary;
    }

    public void info() {
        System.out.println("ФИО: " + name + ", Email "+ email + ", Должность "+ position +", Номер телефона "+ number + ", Возраст "+ age + ", Зарплата "+ salary);
    }
    public int getAge() {
        return age;
    }
}
