package test2;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Demo02 {
    public static void main(String[] args) {
        /*int leftLimit = 2;
        int rightLimit = 11;

        Runnable r = () -> {
            int generatedInteger = leftLimit + (int) (Math.random() * rightLimit);
            System.out.println(generatedInteger);
            System.out.println(ThreadLocalRandom.current());
        };
        for (int i = 1; i < 10; i++) {
            new Thread(r).start();
        }*/
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        DoubleStream doubles = tlr.doubles(2, 4);
        doubles.forEach(System.out::println);
    }
}
