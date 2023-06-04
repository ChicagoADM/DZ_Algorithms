package HW4;

public class Main {
    public static void main(String[] args) {
        TreeRedBlack<Integer> rbTree = new TreeRedBlack<Integer>();

        rbTree.add(5);
        rbTree.add(8);
        rbTree.add(2);
        rbTree.add(1);
        rbTree.add(4);

        System.out.println(rbTree);
    }
}

