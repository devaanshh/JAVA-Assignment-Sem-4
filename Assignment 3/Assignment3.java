import java.util.Scanner;

class Student {
    private String prn;
    private String name;
    private String dob;
    private int marks;

    public Student(String prn, String name, String dob, int marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public String getPRN() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString() {
        return "PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks;
    }
}

public class Assignment3 {
    private static Scanner input = new Scanner(System.in);
    private static int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update/Edit Student");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // Consume newline left-over from input.nextInt()

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchByPRN();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    searchByPosition();
                    break;
                case 6:
                    updateStudent();
                    break;
                case 7:
                    deleteStudent();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 0);
    }

    private static void addStudent() {
        if (numStudents >= MAX_STUDENTS)
        {
            System.out.println("Maximum number of students reached. Cannot add more students.");
            return;
        }

        System.out.print("Enter PRN: ");
        String prn = input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Date of Birth (dd-mm-yyyy): ");
        String dob = input.nextLine();

        System.out.print("Enter Marks: ");
        int marks = input.nextInt();
        input.nextLine(); // Consume newline left-over from input.nextInt()

        Student student = new Student(prn, name, dob, marks);
        students[numStudents] = student;
        numStudents++;

        System.out.println("Student added successfully.");
    }
    private static void displayAllStudents() {
        if (numStudents == 0) {
            System.out.println("No students found.");
            return;
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i]);
        }
    }

    private static void searchByPRN() {
        System.out.print("Enter PRN to search for: ");
        String prn = input.nextLine();

        for (int i = 0; i < numStudents; i++) {
            if (students[i].getPRN().equalsIgnoreCase(prn)) {
                System.out.println(students[i]);
                return;
            }
        }

        System.out.println("No student found with PRN " + prn + ".");
    }

    private static void searchByName() {
        System.out.print("Enter Name to search for: ");
        String name = input.nextLine();

        for (int i = 0; i < numStudents; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                System.out.println(students[i]);
            }
        }

        System.out.println("No students found with Name " + name + ".");
    }

    private static void searchByPosition() {
        System.out.print("Enter position to search for: ");
        int position = input.nextInt();
        input.nextLine(); // Consume newline left-over from input.nextInt()

        if (position < 1 || position > numStudents) {
            System.out.println("Invalid position. Try again.");
            return;
        }

        System.out.println(students[position - 1]);
    }

    private static void updateStudent() {
        System.out.print("Enter PRN to update: ");
        String prn = input.nextLine();

        for (int i = 0; i < numStudents; i++) {
            if (students[i].getPRN().equalsIgnoreCase(prn)) {
                System.out.print("Enter new Name: ");
                String name = input.nextLine();
                students[i].setName(name);

                System.out.print("Enter new Date of Birth (dd-mm-yyyy): ");
                String dob = input.nextLine();
                students[i].setDOB(dob);

                System.out.print("Enter new Marks: ");
                int marks = input.nextInt();
                input.nextLine(); // Consume newline left-over from input.nextInt()
                students[i].setMarks(marks);

                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("No student found with PRN " + prn + ".");
    }

    private static void deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        String prn = input.nextLine();

        for (int i = 0; i < numStudents; i++) {
            if (students[i].getPRN().equalsIgnoreCase(prn)) {
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                numStudents--;
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("No student found with PRN " + prn + ".");
    }
}