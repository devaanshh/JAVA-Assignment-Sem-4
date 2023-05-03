import java.util.Scanner;
class NOMATCHEXCP extends Exception {
    public NOMATCHEXCP(int line, String input) {
        super("Error: Line " + line + ": \"" + input + "\" is not equal to
                \"India\"");
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int line = 0;
        try {
            System.out.print("Enter a string: ");
            input = scanner.nextLine();
            line++;
            if (!input.equals("India")) {
                throw new NOMATCHEXCP(line, input);
            }
            System.out.println("Input string is equal to \"India\"");
        } catch (NOMATCHEXCP e) {
            System.err.println(e.getMessage());
        }
    }
}