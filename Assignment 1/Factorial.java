import java.io.*;
import java.util.Scanner;
class Get_Factorial
{
    void fetch_fact(int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
public class Factorial
{
    public static void main(String[] args) throws IOException
    {
        Get_Factorial obj1 = new Get_Factorial();
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        //creating a menu
        int choice;
        System.out.println("Enter your choice: ");
        System.out.println("1. Command Line Arg");
        System.out.println("2. Scanner");
        System.out.println("3. BufferedReader");
        System.out.println("4. DataInputStream");
        System.out.println("5. Console");
        System.out.println("6. Exit");
        choice = Integer.parseInt(b.readLine());
        if(choice == 1)
        {
            obj1.fetch_fact(Integer.parseInt(args[0]));
        }
        else if(choice == 2)
        {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter your number for scanner: ");
            int a = myObj.nextInt();
            obj1.fetch_fact(a);
            myObj.close();
        }
        else if(choice == 3)
        {
            BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your number for BufferReader: ");
            String n = a1.readLine();
            int n1 = Integer.parseInt(n);
            obj1.fetch_fact(n1);
        }
        else if(choice == 4)
        {
            DataInputStream a2 = new DataInputStream(new
                    FileInputStream("C:\\Users\\devansh\\OneDrive\\Desktop\\JAVA\\input.txt"));
            String s = a2.readLine();
            int n2 = Integer.parseInt(s);
            obj1.fetch_fact(n2);
            a2.close();
        }
        else if(choice == 5)
        {
            Console a3 = System.console();
            System.out.print("Enter your number for console: ");
            int n3 = Integer.parseInt(a3.readLine());
            obj1.fetch_fact(n3);
        }
        else if(choice == 6)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}