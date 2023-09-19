//implementing the structure of queue

import java.util.*;

class Queue{
    int[] queue;
    int front, rear;
    
    Queue(int size){
        queue=new int[size];
        front=-1;
        rear=-1;
    }
    boolean isEmpty(){
        if (front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){
        if (front==0 && rear==queue.length){
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int element){
        if (isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(isEmpty()){
                front=0;
            }
            queue[++rear]=element;
        }
    }
    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Removed : "+queue[front]);
            if (front==rear){
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
		int s = sc.nextInt();
		Queue q = new Queue(s);
		q.enqueue(10);
		q.enqueue(20);
		System.out.println(q.isEmpty());
		q.enqueue(30);
		q.display();
		q.dequeue();
		q.display();
	}
}
