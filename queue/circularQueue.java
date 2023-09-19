//implementing a circular queue 

import java.util.*;

class Circularqueue{
    int[] cqueue;
    int front, rear;
    
    Circularqueue(int size){
        cqueue=new int[size];
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
        if((front==0 && rear==cqueue.length) || front==rear+1){
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
            rear=(rear+1)%cqueue.length;
            cqueue[rear]=element;
        }
    }
    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Removed : "+cqueue[front]);
            if (front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front=(front+1)%cqueue.length;
            }
        }
    }
    void display(){
        int i;
        for(i=front;i!=rear;i=(i+1)%cqueue.length){
            System.out.print(cqueue[i]+" ");
        }
        System.out.println(cqueue[i]);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		Circularqueue cq = new Circularqueue(s);
		cq.enqueue(10);
		cq.enqueue(20);
		System.out.println(cq.isEmpty());
		cq.enqueue(30);
		cq.display();
		cq.dequeue();
		cq.enqueue(40);
		cq.display();
		
	}
}
