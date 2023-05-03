package fixed_grow_stack.pkg_Stack;

public interface Interface_STK {
    int MAX = 5; // maximum size of the stack
    public void push(int item); // push an item onto the stack
    public int pop(); // pop an item from the stack
    public int peek(); // peek at the top of the stack
    public boolean isEmpty(); // true if stack is empty
    public boolean isFull(); // true if stack is full
    public void clear(); // clear the stack
    public int size(); // return the number of items in the stack
    public void display(); // display the stack
