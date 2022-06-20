package com.example.java8to11;

import java.util.Collections;
import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {
        Function<Integer, Iterable> plus10 = (i) -> Collections.singleton(i + 10);

        System.out.println(plus10.apply(1));

    }
}
