//implementing a simple queue

class Queue:
    def __init__(self):
        self.items=[]
    def isEmpty(self):
        return self.items==[]
    def size(self):
        return len(self.items)
    def push(self,n):
        self.items.append(n)
    def pop(self):
        if self.isEmpty():
            print("EMPTY")
        else:
            print("REMOVED",self.items.pop(0))
    def display(self):
        print(*self.items)
        
queue = Queue()
queue.push(10)
queue.push(20)
queue.push(30)
queue.display()
queue.pop()
queue.display()
