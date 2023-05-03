package fixed_grow_stack;

import fixed_grow_stack.pkg_Stack.Interface_STK;

public class Fixed_stk implements Interface_STK{
    int fix_STK[] = new int[MAX];
    int top = 0;

    @Override
    public void push(int a){
        if(top==MAX){
            System.out.println("Stack is full - Cannot insert element");
            return;
        }
        else{
            fix_STK[top] = a;
            top++;
        }
    }

    @Override
    public int pop() {
        if(top==0){
            System.out.println("Stack is empty - Cannot remove element");
            return 0;
        }
        else{
            return fix_STK[--top];
        }
    }

    @Override
    public int peek() {
        return fix_STK[top--];
    }

    @Override
    public boolean isEmpty() {
        if(top==0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if(top==MAX){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void clear() {
        for(int i=0; i<top; i++){
            pop();
        }
        System.out.println("Stack is cleared");
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void display() {
        System.out.println("Stack elements are: ");
        for(int i=0; i<top; i++){
            System.out.println(fix_STK[i]);
        }
    }
}
