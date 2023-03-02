import java.util.*;
import java.util.Scanner;
class Smallest_distance
{
    static void smallest_distance()
    {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int minI=0,minJ=0;
        for (int i = 0; i < 9; i++) {
            int diff = arr[i+1] - arr[i];
            if(diff < min){
                min = diff;
                minI = i;
                minJ = i+1;
            }
        }
        System.out.println("The smallest distance is between " + arr[minI] + " and " + arr[minJ]+ " and the distance is " + min);
                sc.close();
    }
}
class Array_List{
    static void arraylist()
    {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(int l = 0; l < 10; l++)
        {
            int n = sc.nextInt();
            array[l] = n;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int l = 0; l < 10; l++){
            list.add(array[l]);
        }
        System.out.println(list);
        sc.close();
    }
}
public class ArrayEvenOdd
{
    public static void main(String[] args) {

        System.out.println("1. Smallest distance between two numbers in an array");
        System.out.println("2. Array to ArrayList");
        System.out.println("3. Even and Odd numbers");
        System.out.println("Enter your choice: ");
        Scanner sc1 = new Scanner(System.in);
        int choice = sc1.nextInt();
        switch(choice)
        {
            case 1:
                Smallest_distance.smallest_distance();
                break;
            case 2:
                Array_List.arraylist();
                break;
            case 3:
                // Create two arrays odd and even
                int[] odd = new int[10];
                int[] even = new int[10];
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter numbers to classify, enter 'end' to stop: ");
                while(true)
                {
                    String input = sc.nextLine();
                    if(input.equals("end"))
                    {
                        break;
                    }
                    else
                    {
                        int num = Integer.parseInt(input);
                        if(num%2 == 0)
                        {
                            for(int i=0; i<even.length; i++)
                            {
                                if(even[i] == 0)
                                {
                                    even[i] = num;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            for(int i=0; i<odd.length; i++)
                            {
                                if(odd[i] == 0)
                                {
                                    odd[i] = num;
                                    break;
                                }
                            }
                        }
                    }
                }
                sc.close();
                // Print the arrays
                System.out.println("Even numbers: ");
                for(int i=0; i<even.length; i++)
                {
                    if(even[i] != 0)
                    {
                        System.out.print(even[i]+" ");
                    }
                }
                System.out.println();
                System.out.println("Odd numbers: ");
                for(int i=0; i<odd.length; i++)
                {
                    if(odd[i] != 0)
                    {
                        System.out.print(odd[i]+" ");
                    }
                }

            default:
                System.out.println("Invalid choice");
        }
        sc1.close();
    }
}