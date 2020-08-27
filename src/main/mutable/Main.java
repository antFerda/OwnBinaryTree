package main.mutable;

import main.immutable.ImmutableNode;
import main.mutable.INode;
import main.mutable.MutableNode;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        mutableTreeDemo();
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
}
