package javaStudy.mda02;

import java.awt.event.ActionListener;
import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class MainMethod {

    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple(Apple.Color.RED, 180),
                new Apple(Apple.Color.GREEN, 100),
                new Apple(Apple.Color.GREEN, 350),
                new Apple(Apple.Color.RED, 400)
        );
        // 동작 파라미터화
        System.out.println(filterApples(appleList, new AppleHeavyWeightPredicate()).toString());
        // 익명 클래스
        System.out.println(filterApples(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return Apple.Color.GREEN.equals(apple.getColor());
            }
        }).toString());
        // 람다식
        System.out.println(filterApples(appleList, (Apple apple) -> Apple.Color.RED.equals(apple.getColor())));
        // compareTo
        appleList.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        System.out.println(appleList.toString());
        // stream lambda
        List<Integer> lambdaTest = appleList.stream().filter(apple -> apple.getWeight() > 150).sorted(Comparator.comparing(Apple::getWeight)).map(Apple::getWeight).collect(toList());
        System.out.println(lambdaTest.toString());
        // groupingBy
        Map<Apple.Color, List<Apple>> groupingTest = appleList.stream().collect(groupingBy(Apple::getColor));
        System.out.println(groupingTest.toString());
    }


    /**
     * 사과 필터
     *
     * @param inventory
     * @param p
     * @return
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
