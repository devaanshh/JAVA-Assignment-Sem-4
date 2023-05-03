class MyExcep extends Exception {
    public MyExcep(String message) {
        super(message);
    }
}
public class Factorial {
    public static void main(String[] args) {
        int n;
        for(int i=0;i<args.length;i++){
            try {
                int fact = 1;
                n = Integer.parseInt(args[i]);
                if (n < 0 || n > 15) {
                    throw new MyExcep("Invalid input! Integer must be
                            between 0 and 15.");
                }
                for (int j = 1; j <= n; j++) {
                    fact *= j;
                }
                System.out.println("Factorial of " + n + " is: " + fact);
            } catch (MyExcep e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer
                        value.");
            }
        }
    }
}
