import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;
    
    Node(int val){
        data = val;
        left = null;
        right= null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        root=null;
    }
    
    void printPreorderTree(Node node){
        if(node!=null){
            System.out.println(node.data);
            printPreorderTree(node.left);
            printPreorderTree(node.right);
        }
    }
    
    void printInorderTree(Node node){
        if(node!=null){
            printInorderTree(node.left);
            System.out.println(node.data);
            printInorderTree(node.right);
        }
    }
    
    void printPostorderTree(Node node){
        if(node!=null){
            printPostorderTree(node.left);
            printPostorderTree(node.right);
            System.out.println(node.data);
        }
    }
    void insert(Node node, int val){
        if(node==null){
            node = new Node(val);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        
        while (!q.isEmpty()) {
            node = q.peek();
            q.remove();
 
            if (node.left == null) {
                node.left = new Node(val);
                break;
            }
            else
                q.add(node.left);
 
            if (node.right == null) {
                node.right = new Node(val);
                break;
            }
            else
                q.add(node.right);
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(5);
        bt.insert(bt.root,2);
        bt.insert(bt.root,4);
        bt.insert(bt.root,7);
        bt.printInorderTree(bt.root);
    }
}

