package ds.trees;

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
