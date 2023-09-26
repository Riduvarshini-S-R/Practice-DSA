#include <stdio.h>
#include <stdlib.h>

struct circularQueue{
    int* arr;
    int front, rear, capacity;
};

struct circularQueue* createQueue(int size){
    struct circularQueue* cqueue = (struct circularQueue*)(malloc(sizeof(struct circularQueue)));
    cqueue->front=-1;
    cqueue->rear=-1;
    cqueue->capacity=size;
    cqueue->arr=(int*)(malloc(sizeof(int)*size));
    return cqueue;
}

int isEmpty(struct circularQueue* cqueue){
    return cqueue->front==-1;
}

int isFull(struct circularQueue* cqueue) {
    return (cqueue->rear == cqueue->capacity) || (cqueue->front == cqueue->rear+1);
}


void enqueue(struct circularQueue* cqueue, int element){
    if(isFull(cqueue)){
        printf("Stack is full\n");
    }
    else{
        if(cqueue->front==-1){
            cqueue->front=0;
        }
        cqueue->rear=(cqueue->rear+1)%cqueue->capacity;
        cqueue->arr[cqueue->rear]=element;
    }
}

void dequeue(struct circularQueue* cqueue){
    if(isEmpty(cqueue)){
        printf("Stack is empty\n");
    }
    else{
        printf("Removed : %d\n",cqueue->arr[cqueue->front]);
        if(cqueue->front==cqueue->rear){
            cqueue->front=-1;
            cqueue->rear=-1;
        }
        else{
            cqueue->front=(cqueue->front+1)%cqueue->capacity;
        }
    }
}

void display(struct circularQueue* cqueue){
    int i;
    for(i=cqueue->front;i!=cqueue->rear;i=(i+1)%cqueue->capacity){
        printf("%d ",cqueue->arr[i]);
    }
    printf("%d ",cqueue->arr[i]);
    printf("\n");
}

int main()
{
    int size;
    scanf("%d",&size);
    struct circularQueue* cq = createQueue(size);
    enqueue(cq,10);
    enqueue(cq,20);
    enqueue(cq,30);
    display(cq);
    dequeue(cq);
    display(cq);
    enqueue(cq,40);
    display(cq);
    return 0;
}

