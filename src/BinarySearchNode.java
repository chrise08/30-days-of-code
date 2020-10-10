import java.util.*;
import java.io.*;
class BinarySearchNode{
    BinarySearchNode left,right;
    int data;
    BinarySearchNode(int data){
        this.data=data;
        left=right=null;
    }
}
class BinarySearchSolution{

    private static int getHeight(BinarySearchNode root){
        int heightLeft = 0;
        int heightRight = 0;

        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }

        return (heightLeft > heightRight ? heightLeft : heightRight);
    }

    public static BinarySearchNode insert(BinarySearchNode root,int data){
        if(root==null){
            return new BinarySearchNode(data);
        }
        else{
            BinarySearchNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BinarySearchNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}