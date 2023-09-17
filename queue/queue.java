//implementing the structure of queue

import java.util.*;

class Queue{
    int[] queue;
    int front=-1,rear=-1;
    Queue(int size){
        queue = new int[size]; 
    }
    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){
        if(front==0 && rear==queue.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int n){
        if(isFull()){
            System.out.println("QUEUE IS FULL");
        }
        else{
            if(isEmpty()){
                front=0;
            }
            rear++;
            queue[rear]=n;
        }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
        }
        else{
            System.out.println("REMOVED: "+queue[front]);
            if(front>rear){
                front=-1;
                rear=-1;
            }
	    else{
		front++;
	    }
        }
    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Queue q = new Queue(size);
		q.enqueue(10);
		q.enqueue(20);
		q.display();
		q.enqueue(30);
		q.display();
		q.dequeue();
		q.display();
	}
}
