package fixed_grow_stack;
import java.util.Scanner;

public class master_main {
    public static void main(String[] args) {

        // Main menu
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose sub-menu:");
        System.out.println("1. Fixed Stack");
        System.out.println("2. Growing Stack");
        System.out.println("3. Exit");
        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        // Sub-menu for Fixed Stack [Fixed_stk.java]
        if(choice == 1){
            Fixed_stk stk = new Fixed_stk();
            System.out.println("\n\nSub-menu: Fixed Stack");
            System.out.println("Choose operation:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peek Element");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full");
            System.out.println("6. Clear stack");
            System.out.println("7. Display stack");
            System.out.println("8. Exit");
            System.out.print("\nEnter your choice: ");
            int choice_fix = sc.nextInt();

            if(choice_fix == 1){
                System.out.print("Enter element to push: ");
                int element_fix = sc.nextInt();
                stk.push(element_fix);
            }
            else if(choice_fix == 2){
                System.out.println("Popped element: " + stk.pop());
            }
            else if(choice_fix == 3){
                System.out.println("Peeked element: " + stk.peek());
            }
            else if(choice_fix == 4){
                System.out.println("Is stack empty? " + stk.isEmpty());
            }
            else if(choice_fix == 5){
                System.out.println("Is stack full? " + stk.isFull());
            }
            else if(choice_fix == 6){
                stk.clear();
            }
            else if(choice_fix == 7){
                stk.display();
            }
            else if(choice_fix == 8){
                System.exit(0);
            }
            else{
                System.out.println("Invalid choice");
            }

        }

        else if (choice == 2){
            Growable_stk stk = new Growable_stk();
            System.out.println("\n\nSub-menu: Growing Stack");
            System.out.println("Choose operation:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peek Element");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full");
            System.out.println("6. Clear stack");
            System.out.println("7. Display stack");
            System.out.println("8. Exit");
            System.out.print("\nEnter your choice: ");
            int choice_grow = sc.nextInt();

            if(choice_grow == 1){
                System.out.println("Enter element to push: ");
                int element_grow = sc.nextInt();
                stk.push(element_grow);
            }

            else if(choice_grow == 2){
                System.out.println("Popped element: " + stk.pop());
            }

            else if(choice_grow == 3){
                System.out.println("Peeked element: " + stk.peek());
            }

            else if(choice_grow == 4){
                System.out.println("Is stack empty? " + stk.isEmpty());
            }

            else if(choice_grow == 5){
                System.out.println("Is stack full? " + stk.isFull());
            }

            else if(choice_grow == 6){
                stk.clear();
            }

            else if(choice_grow == 7){
                stk.display();
            }

            else if(choice_grow == 8){
                System.exit(0);
            }

            else{
                System.out.println("Invalid choice");
            }


        }

        else if (choice == 3){
            System.exit(0);
        }

        else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
