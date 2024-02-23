public class No2 {
    class Node {
        char key;
        No2.Node left, right;

        public Node(char item) {
            key = item;
            left = right = null;
        }
    }

    No2.Node root;

    No2() {
        root = null;
    }

    void insert(char key) {
        root = insertKey(root, key);
    }

    No2.Node insertKey(No2.Node root, char key) {
        if (root == null) {
            root = new No2.Node(key);
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

    void inorderRec(No2.Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    //delete
    void deleteKey(char key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, char key) {
        if (root == null) {
            return root;
        }
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    char minValue(Node root) {
        char minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }


    public static void main(String[] args) {
        No2 bst = new No2();
        bst.insert('Q');
        bst.insert('P');
        bst.insert('W');
        bst.insert('O');
        bst.insert('E');
        bst.insert('I');
        bst.insert('R');
        bst.insert('U');
        bst.insert('T');
        bst.insert('Y');
        System.out.print("Inorder traversal : ");
        bst.inorder();

        bst.deleteKey('R');
        System.out.print("\nInorder traversal : ");
        bst.inorder();



    }
}
