public class Main {
    public static void main(String[] args) {
        Student student = new Student("Anuj", 1220, "AIML", "Java", 95, 85);
        student.display();
        ResultPrinter printer = new ResultPrinter(student);
        printer.display();
    }
}
