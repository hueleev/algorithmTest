package javaStudy.mda02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MainMethod2 {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple(Apple.Color.RED, 180),
                new Apple(Apple.Color.GREEN, 100),
                new Apple(Apple.Color.GREEN, 350),
                new Apple(Apple.Color.RED, 400)
        );

        /**
         * ���Լ� ���� (List sort �� Comparator Ȱ��
         * [Apple{color=GREEN, weight=100}, Apple{color=RED, weight=180}, Apple{color=GREEN, weight=350}, Apple{color=RED, weight=400}]
         */
        appleList.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        
        /**
         * Runnable lambda ��
         */        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        });
        
        /**
         * Runnable lambda ��
         */
        Thread t_lambda = new Thread(() -> System.out.println("Hello World"));
    }
}
