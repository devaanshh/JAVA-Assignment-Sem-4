public abstract class Employee {
    private String name;
    private String address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    protected int basicSalary;
    public Employee(String name, String address, int basicSalary) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
    }
    public abstract int calculateMonthlySalary();
    // Getters and setters for name, address and basicSalary
}
public class BonusEmployee extends Employee {
    private int monthlyBonus;
    public BonusEmployee(String name, String address, int basicSalary, int
            monthlyBonus) {
        super(name, address, basicSalary);
        this.monthlyBonus = monthlyBonus;
    }
    @Override
    public int calculateMonthlySalary() {
        return (basicSalary / 12) + monthlyBonus;
    }
    // Getter and setter for monthlyBonus
}
public class NormalEmployee extends Employee {
    public NormalEmployee(String name, String address, int basicSalary) {
        super(name, address, basicSalary);
    }
    @Override
    public int calculateMonthlySalary() {
        return basicSalary / 12;
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        NormalEmployee normalEmployee = new NormalEmployee("Harshit Jain",
                "Mumbai", 1300000);
        BonusEmployee bonusEmployee = new BonusEmployee("Tim Cook", "Pune",
                10000, 25);
        System.out.println("Normal Employee:");
        System.out.println("Name: " + normalEmployee.getName());
        System.out.println("Address: " + normalEmployee.getAddress());
        System.out.println("Monthly Salary: " +
                normalEmployee.calculateMonthlySalary());
        System.out.println();
        System.out.println("Bonus Employee:");
        System.out.println("Name: " + bonusEmployee.getName());
        System.out.println("Address: " + bonusEmployee.getAddress());
        System.out.println("Monthly Salary: " +
                bonusEmployee.calculateMonthlySalary());
    }
}