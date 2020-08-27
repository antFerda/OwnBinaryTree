package main.immutable;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        IMNode<Integer> root = new ImmutableNode(0, null, null);
        Random r = new Random();

        for (int i = 1; i < 100_000; i++) {
            root = root.add(r.nextInt()%500);
        }

        root.forEach(System.out::println);
        System.out.println("The size is: " + root.count());


    }
}
