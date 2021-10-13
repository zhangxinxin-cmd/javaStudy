package test2;

import java.util.ArrayList;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(3,2,1,4,4);
        System.out.println(stack.size());
        stack.forEach(System.out::print);
        ArrayList<Integer> list=new ArrayList<>();
    }
}
