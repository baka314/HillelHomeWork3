class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
}
public class Main {
        public static void main(String[] args) {
            Employee[] collegue = new Employee[5];
            collegue[0] = new Employee("Michel", "designer", "michel1010@gmail.com", "0683649080",4000,31);
            collegue[1] = new Employee("Boris", "manager", "borispol@mailbox.com", "095312314",3800,32);
            collegue[2] = new Employee("Derek", "java developer", "derekheil@gmail.com", "067312315",5500,38);
            collegue[3] = new Employee("Molly", "HR", "mollydrok@mailbox.com", "066312316",3500,27);
            collegue[4] = new Employee("Jane", "frontend developer", "janekot@mai.com", "096312317",5000,29);
        }

}

