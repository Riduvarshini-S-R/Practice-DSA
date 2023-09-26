class circularQueue:
    def __init__(self,size):
        self.size=size
        self.items=[None for i in range(size)]
        self.front=-1
        self.rear=-1
    
    def isEmpty(self):
        return self.front==-1
    def isFull(self):
        return (self.front==0 and self.rear==self.size) or (self.front==self.rear+1)
    def enqueue(self,element):
        if self.isFull():
            print("Queue is full")
        else:
            if self.isEmpty():
                self.front=0
            self.rear=(self.rear+1)%self.size
            self.items[self.rear]=element
            
    def dequeue(self):
        if self.isEmpty():
            print("Queue is empty")
        else:
            print("Removed ",self.items[self.front])
            if(self.front==self.rear):
                self.front=-1
                self.rear=-1
            else:
                self.front=(self.front+1)%self.size
    
    def display(self):
        if self.isEmpty():
            print("Queue is empty")
        elif self.rear>=self.front:
            print(*self.items[self.front:self.rear+1])
        else:
            print(*self.items[self.front:],end=" ")
            print(*self.items[:self.rear+1])
            
n=int(input())
cq=circularQueue(n)
cq.enqueue(10)
cq.enqueue(20)
cq.enqueue(30)
cq.display()
cq.dequeue()
cq.display()
cq.enqueue(40)
cq.enqueue(50)
cq.display()

