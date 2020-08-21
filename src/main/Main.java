package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        mutableTreeDemo();
        immutableTreeDemo();
    }


    static void mutableTreeDemo() {
        MutableNode root = new MutableNode(0);
        Random r = new Random();

        for (int i = 1; i < 100_000; i++) {
            root.add(r.nextInt()%500);
        }
        root.print();
        System.out.println(root.count());
    }


    static void immutableTreeDemo() {
        INode root = new ImmutableNode(0, null, null);
        Random r = new Random();

        for (int i = 1; i < 100_000; i++) {
            root = root.add(r.nextInt()%500);
        }

        root.print();
        System.out.println("The size is: " + root.count());

    }
}
