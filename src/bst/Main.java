package bst;

public class Main {
    public static void main(String[] args) {
        BST_class bst = new BST_class();

        bst.insert(1);
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(90);
        bst.insert(20);
        bst.insert(30);
        bst.insert(52);
        bst.insert(4);
        bst.insert(50);

        System.out.println("BST:");
        bst.inorder();


        System.out.println("\nThe BST after Delete 12:");
        bst.deleteKey(12);
        bst.inorder();
    }
}
