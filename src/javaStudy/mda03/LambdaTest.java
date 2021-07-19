package javaStudy.mda03;

import javaStudy.mda02.Apple;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple(Apple.Color.RED, 180),
                new Apple(Apple.Color.GREEN, 100),
                new Apple(Apple.Color.RED, 100),
                new Apple(Apple.Color.GREEN, 350),
                new Apple(Apple.Color.RED, 400)
        );

        appleList.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(appleList);
        appleList.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(appleList);
        appleList.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(appleList);
    }
}
