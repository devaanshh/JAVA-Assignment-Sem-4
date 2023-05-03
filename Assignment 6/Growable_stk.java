package fixed_grow_stack;

import fixed_grow_stack.pkg_Stack.Interface_STK;
import java.util.Vector;

public class Growable_stk implements Interface_STK{

    // creating Vector of type Integer
    Vector<Integer> grow_STK = new Vector<Integer>();

    @Override
    public void push(int a) {
        grow_STK.add(a);
    }
    @Override
    public int pop() {
        if(grow_STK.isEmpty()){
            System.out.println("Stack is empty - Cannot remove element");
            return 0;
        }
        else{
            return grow_STK.remove(grow_STK.size()-1);
        }
    }

    @Override
    public int peek() {
        return grow_STK.get(grow_STK.size()-1);
    }

    @Override
    public boolean isEmpty() {
        if(grow_STK.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isFull() {
        System.out.println("Growable stack is never full");
        return false;
    }

    @Override
    public void clear() {
        grow_STK.clear();
        System.out.println("Stack is cleared");
    }

    @Override
    public int size() {
        return(grow_STK.size());
    }

    @Override
    public void display() {
        System.out.println("Stack elements are:");
        for(int i=0; i<grow_STK.size(); i++){
            System.out.println(grow_STK.get(i));
        }
    }
}

