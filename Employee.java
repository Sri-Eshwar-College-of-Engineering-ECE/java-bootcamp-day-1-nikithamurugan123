public class Employee {
    String Name;
    static int count = 0;

    Employee(String name) {
        Name = name;
        count++;
    }

    void display() {
        System.out.println("Employee Name: " + Name);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("ABC");
        Employee employee2 = new Employee("DEF");
        Employee employee3 = new Employee("GHI");

        employee1.display();
        employee2.display();
        employee3.display();

        System.out.println("Total Employees: " + count);
    }
}