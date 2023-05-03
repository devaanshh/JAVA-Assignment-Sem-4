public interface Exam {
    public double Percent_Cal();
}
public class Student implements Exam {
    private String name;
    private int rollNo;
    private String branch;

    private String subject;
    private int marks1;

    private int marks2;

    public Student(String name, int rollNo, String branch, String subject, int marks1, int marks2) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;

        this.subject = subject;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Subject: " + subject);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: "+ marks2);
    }

    public double Percent_Cal() {
        return (double) (marks1+marks2) / 200 * 100;
    }
}
public class ResultPrinter {
    private Exam result;

    public ResultPrinter(Exam result) {
        this.result = result;
    }

    public void display() {
        System.out.println("Percentage: " + result.Percent_Cal());
    }
}
