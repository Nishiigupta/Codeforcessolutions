import java.io.*;
import java.util.*;
public class btree {
    class Node{
        int data;
        Node left , right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }
    Node root = null;
    Node newnode(int data){
        return new Node(data);
    }
    void insert(int data){
        if(root==null){
            root = newnode(data);
            return;
        }
        Node temp = root;
        temp =insert_nodes(data, root);
    }
    Node insert_nodes(int data,Node root){
        if(root==null){
            root = newnode(data);
            return root;
        }
        if(data<root.data){
            root.left = insert_nodes(data,root.left);
        }
        else{
            root.right = insert_nodes(data,root.right);
        }
        return root;
    }
    void inorder(){
        inorder_trav(root);
    }
    void inorder_trav(Node root){
        while(root==null)
        return;

            inorder_trav(root.left);
            System.out.println(root.data+" ");
            inorder_trav(root.right);
        }
    int max_depth(Node root){
        int depth = 0;
        if(root==null)
        return 0;
        int left_depth =max_depth(root.left);
        int right_depth = max_depth(root.right);
        return Math.max(left_depth,right_depth)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        btree trr = new btree();
        int n = sc.nextInt();
        System.out.println("enter node values:-");
        for(int i =0;i<n;i++){
            int value = sc.nextInt();
            trr.insert(value);
        }
        trr.inorder();
        System.out.println("the height of thr tree is:-");
        int res =trr.max_depth(trr.root);
        System.out.println(res);
    }
}