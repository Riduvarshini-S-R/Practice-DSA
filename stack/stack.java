//simple implementation of stack

import java.util.*;

class Stack{
    int[] stack;
    int top=-1;
    
    Stack(int size){
        stack = new int[size];
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(int n){
        if(top==stack.length-1){
            System.out.println("STACK IS FULL");
        }
        else{
            top++;
            stack[top]=n;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("STACK IS EMPTY");
        }
        else{
            System.out.println("POPPED: "+stack[top]);
            top--;
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("STACK IS EMPTY");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    void display(){
        if (isEmpty()){
            System.out.println("STACK IS EMPTY");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Stack s = new Stack(size);
		s.push(10);
		s.push(20);
		s.isEmpty();
		s.push(30);
		s.display();
		s.pop();
		s.display();
	}
}

