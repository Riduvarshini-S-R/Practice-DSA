//implementing a simple stack structure

#include <stdio.h>
#include <stdlib.h>

struct Stack{
    int top;
    int* arr;
    int capacity;
};

struct Stack* createStack(int size){
    struct Stack* stack = (struct Stack*)(malloc(sizeof(struct Stack)));
    stack->top=-1;
    stack->arr=(int*)malloc(size*sizeof(int));
    stack->capacity=size;
    return stack;
}

int isEmpty(struct Stack* stack){
    return stack->top==-1;
}

int isFull(struct Stack* stack){
    return stack->top==stack->capacity-1;
}

void push(struct Stack* stack,int element){
    if (isFull(stack)){
        printf("Stack is full");
    }
    else{
        stack->arr[++stack->top]=element;
    }
}

void pop(struct Stack* stack){
    if (isEmpty(stack)){
        printf("Stack is empty");
    }
    else{
        printf("Removed - %d\n",stack->arr[stack->top]);
        stack->top--;
    }
}
int peek(struct Stack* stack){
    if(!isEmpty(stack)){
        return stack->arr[stack->top];
    }
    else{
        printf("Stack is empty");
    }
}
void display(struct Stack* stack){
    for(int i=0;i<=stack->top;i++){
        printf("%d ",stack->arr[i]);
    }
    printf("\n");
}

int main()
{
    struct Stack* s = createStack(10);
    push(s,10);
    push(s,20);
    printf("%d \n",isEmpty(s));
    push(s,30);
    display(s);
    pop(s);
    display(s);
    
    return 0;
}
