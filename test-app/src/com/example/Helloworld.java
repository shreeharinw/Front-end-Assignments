package com.example;

public class Helloworld {

    public static void main(String[] args) {
        //System.out.println("hello");
        // christmas tree with just one Garland
        System.out.println("Hello world");
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());

        // christmas tree with two Garlands and one Bubble lights
        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println(tree2.decorate());
    }
}
