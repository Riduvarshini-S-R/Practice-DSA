#implementing a simple stack
class Stack:
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
            return self.items.pop(-1)
    def display(self):
        print(*self.items)
        
stack = Stack()
stack.push(10)
stack.push(20)
stack.push(30)
stack.display()
stack.pop()
stack.display()

