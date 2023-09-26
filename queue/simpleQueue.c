#include <stdio.h>
#include <stdlib.h>

struct Queue{
    int* arr;
    int front, rear, capacity;
};

struct Queue* createQueue(int size){
    struct Queue* queue = (struct Queue*)(malloc(sizeof(struct Queue)));
    queue->front=-1;
    queue->rear=-1;
    queue->capacity=size;
    queue->arr=(int*)(malloc(sizeof(int)*size));
    return queue;
}

int isEmpty(struct Queue* queue){
    return queue->front==-1 && queue->rear==-1;
}

int isFull(struct Queue* queue) {
    return queue->rear == queue->capacity - 1;
}


void enqueue(struct Queue* queue, int element){
    if(isFull(queue)){
        printf("Stack is full\n");
    }
    else{
        if(queue->front==-1){
            queue->front=0;
        }
        queue->arr[++(queue->rear)]=element;
    }
}

void dequeue(struct Queue* queue){
    if(isEmpty(queue)){
        printf("Stack is empty\n");
    }
    else{
        printf("Removed : %d\n",queue->arr[queue->front]);
        if(queue->front==queue->rear){
            queue->front=-1;
            queue->rear=-1;
        }
        else{
            queue->front++;
        }
    }
}

void display(struct Queue* queue){
    for(int i=queue->front;i<=queue->rear;i++){
        printf("%d ",queue->arr[i]);
    }
    printf("\n");
}

int main()
{
    int size;
    scanf("%d",&size);
    struct Queue* q = createQueue(size);
    enqueue(q,10);
    enqueue(q,20);
    enqueue(q,30);
    display(q);
    dequeue(q);
    display(q);
    enqueue(q,40);
    enqueue(q,50);
    enqueue(q,60);
    display(q);
    enqueue(q,70);
    dequeue(q);
    dequeue(q);
    dequeue(q);
    dequeue(q);
    dequeue(q);
    printf("%d %d",q->front,q->rear);
    return 0;
}
