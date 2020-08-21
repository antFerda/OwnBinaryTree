package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MutableNode root = new MutableNode(0);
        Random r = new Random();
//        r.nextInt();

        for (int i = 1; i < 100_000; i++) {
//            System.out.println(r.nextInt()%500);
            root.add(r.nextInt()%500);
        }
        root.print();
        System.out.println(root.count());

    }
}
