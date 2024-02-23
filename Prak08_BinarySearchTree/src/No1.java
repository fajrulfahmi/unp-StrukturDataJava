public class No1 {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    No1() {
        root = null;
    }

    void insert(int key) {
        root = insertKey(root, key);
    }

    Node insertKey(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertKey(root.left, key);
        } else if (key > root.key) {
            root.right = insertKey(root.right, key);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    //no3
    public static void traversePreOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        }
    }

    public static void traversePostorder(Node root) {
        if (root == null) {
            return;
        }
        traversePostorder(root.left);
        traversePostorder(root.right);
        System.out.print(root.key + " ");
    }

    public static void main(String[] args) {
        No1 bst = new No1();
        bst.insert(7);
        bst.insert(4);
        bst.insert(6);
        bst.insert(10);
        bst.insert(1);
        bst.insert(5);
        bst.insert(11);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        System.out.print("Inorder traversal : ");
        bst.inorder();
    }
}
