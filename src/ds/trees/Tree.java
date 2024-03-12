package ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private TreeNode root;

    public void insert(int data) {
        if (root == null) root = new TreeNode(data);
        else root.insert(data);
    }

    public void traverseInOrder() {
        if (root != null) root.traverseInOrder();
    }

    public void traversePreOrder() {
        if (root != null) root.traversePreOrder();
    }

    public void traversePostOrder() {
        if (root != null) root.traversePostOrder();
    }

    public void traverseLevelOrder(){
        if (root != null) root.traverseLevelOrder();
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(4);
        t.insert(32);
        t.insert(211);
        t.insert(30);
        t.insert(40);
        t.insert(20);
        t.insert(-30);
        t.insert(-10);
        t.insert(0);

        t.traverseInOrder();
        System.out.println();

        t.traversePreOrder();
        System.out.println();

        t.traversePostOrder();
        System.out.println();

        t.traverseLevelOrder();
    }

}

class TreeNode {
    int value;
    TreeNode leftNode;
    TreeNode rightNode;

    public void insert(int data) {
        if (value == data) return;

        if (data < value) {
            if (leftNode == null) leftNode = new TreeNode(data);
            else leftNode.insert(data);
        } else {
            if (rightNode == null) rightNode = new TreeNode(data);
            else rightNode.insert(data);
        }
    }

    public void traverseInOrder() {
        if (leftNode != null) leftNode.traverseInOrder();
        System.out.print(value + ", ");
        if (rightNode != null) rightNode.traverseInOrder();
    }

    public void traversePreOrder() {
        System.out.print(value + ", ");
        if (leftNode != null) leftNode.traversePreOrder();
        if (rightNode != null) rightNode.traversePreOrder();
    }


    public void traversePostOrder() {
        if (leftNode != null) leftNode.traversePostOrder();
        if (rightNode != null) rightNode.traversePostOrder();
        System.out.print(value + ", ");

    }


    public void traverseLevelOrder() {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node =queue.poll();
                System.out.print(node.getValue() + " ");
                if (node.getLeftNode() != null) {
                    queue.add(node.getLeftNode());
                }
                if (node.getRightNode() != null) {
                    queue.add(node.getRightNode());
                }
            }
        }
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

}
