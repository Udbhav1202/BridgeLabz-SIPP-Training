package ThisFinalStaticKeyword;

class Employee {
    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Emily", 101, "Developer");
        Employee e2 = new Employee("David", 102, "Tester");

        e1.displayDetails();
        e2.displayDetails();
        displayTotalEmployees();
    }
}

