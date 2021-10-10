package lesson5;

public class OldEmployee {
    public static void showOld() {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "cott@mail.ru", "Engineer", "892312312", 30, 30000);
        persArray[1] = new Employee("Petrov Fedor", "Accountant", "Accountant", "892312311", 55, 47000);
        persArray[2] = new Employee("Sidorov Andrey", "yuu@mailbox.com", "Manager", "89996785656", 34, 40000);
        persArray[3] = new Employee("Ivanov Alexander", "demon@mailbox.com", "Driver", "89238987867", 56, 36000);
        persArray[4] = new Employee("Solovyeva Marina", "Archivist", "Archivist", "89228765678", 60, 20000);

        for (int i = 0; i < persArray.length; i++) {
            Employee employee = persArray[i];
            if (employee.getAge() > 40) {
               employee.info();
            }
        }
    }
}