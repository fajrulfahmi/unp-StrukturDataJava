public class No3 {
    public static void main(String[] args) {
        No1 bst = new No1();
        bst.insert(45);
        bst.insert(30);
        bst.insert(50);
        bst.insert(25);
        bst.insert(35);
        bst.insert(43);
        bst.insert(60);
        bst.insert(49);

        System.out.print("inorder : ");
        bst.inorder();

        System.out.print("\nPre Order : ");
        No1.traversePreOrder(bst.root);

        System.out.print("\nPost Order : ");
        No1.traversePostorder(bst.root);
    }
}
