package com.example.demo.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;

public class DoThing {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    // propagation of anotation:  require, require new ....
    public void ds() {
        Collection<String> collection = Arrays.asList("a", "b", "c");
        var rs = collection.stream().map(e -> e + "ok").filter(e -> !e.equals("aok")).toList();

        // for each of element its will compare

        // add(1) int coundownlatch

        // in method we call coundown.done



    }
}


