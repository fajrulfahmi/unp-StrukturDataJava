public class No4 {
    class Node {
        int key;
        Node kiri, kanan;

        public Node(int item) {
            key = item;
            kiri = kanan = null;
        }

    }

    Node root;

    No4() {
        root = null;
    }

    void insert(int key) {
        root = insertkey(root, key);
    }

    Node insertkey(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.kiri = insertkey(root.kiri, key);
        } else if (key > root.key) {
            root.kanan = insertkey(root.kanan, key);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.kiri);
            System.out.print(root.key + " ");
            inorderRec(root.kanan);
        }
    }

    boolean search(int key) {
        root = search_Recursive(root, key);
        if (root != null)
            return true;
        else
            return false;
    }

    Node search_Recursive(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key > key)
            return search_Recursive(root.kiri, key);
        return search_Recursive(root.kanan, key);
    }

    public static void main(String[] args) {
        No4 bst = new No4();
        bst.insert(45);
        bst.insert(30);
        bst.insert(50);
        bst.insert(25);
        bst.insert(35);
        bst.insert(43);
        bst.insert(60);
        bst.insert(49);
        System.out.print("Inorder traversal : ");
        bst.inorder();
        System.out.print("\nCek angka 20      : ");
        boolean ret_val = bst.search(20);
        if (ret_val == true)
            System.out.println("ada");
        else
            System.out.println("tidak ada");
    }
}
