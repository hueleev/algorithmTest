package javaStudy.mda03;

import javaStudy.mda02.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("apple","banana","melon", ""));

        java.util.function.Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();

        // [apple, banana, melon]
        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);


        List<Apple> appleList = Arrays.asList(
                new Apple(Apple.Color.RED, 180),
                new Apple(Apple.Color.GREEN, 100),
                new Apple(Apple.Color.RED, 100),
                new Apple(Apple.Color.GREEN, 350),
                new Apple(Apple.Color.RED, 400)
        );

        Predicate<Apple> greenApplePredicate = (apple) -> Apple.Color.GREEN.equals(apple.getColor());
        System.out.println(filter(appleList, greenApplePredicate));
        Predicate<Apple> notGreenApple = greenApplePredicate.negate();  // 기존 predicate 반전
        System.out.println(filter(appleList, notGreenApple));

        Predicate<Apple> greenAndHeavyApple = greenApplePredicate.and(apple -> apple.getWeight() > 150);
        System.out.println(filter(appleList, greenAndHeavyApple));

        Predicate<Apple> greenAndHeavyAppleOrRed = greenApplePredicate.and(apple -> apple.getWeight() > 150).or(apple -> Apple.Color.RED.equals(apple.getColor()));
        System.out.println(filter(appleList, greenAndHeavyAppleOrRed));

    }

    public static <T> List<T> filter(List<T> list, java.util.function.Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
