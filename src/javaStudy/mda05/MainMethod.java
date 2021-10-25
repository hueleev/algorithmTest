package javaStudy.mda05;

import javaStudy.Dish;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MainMethod {

    public static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH)
    );

    public static void main(String[] args) {
        List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian).collect(toList());
        System.out.println(vegetarianMenu);

        // filtering
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        List<Dish> specialMenu = Arrays.asList(
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("salmon", false, 450, Dish.Type.FISH),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("beef", false, 700, Dish.Type.MEAT));

        // takeWhile
        List<Dish> slicedMenu1
                = specialMenu.stream().takeWhile(dish -> dish.getCalories() < 400).collect(toList());
        // dropWhile
        List<Dish> slicedMenu2
                = specialMenu.stream().dropWhile(dish -> dish.getCalories() < 400).collect(toList());

        // limit
        List<Dish> limitDishes
                = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 350)
                .limit(3)
                .collect(toList());

        // skip
        List<Dish> skipDishes
                = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 350)
                .skip(2)
                .collect(toList());

        // mapping
        List<String> dishNames
                = menu.stream()
                .map(Dish::getName)
                .collect(toList());

        List<Integer> dishNameLengths
                = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList());

        List<String> words = Arrays.asList("Hello", "world");
        List<String> distinct =
                words.stream()
                        .map(s -> s.split(""))
                        .flatMap(Arrays::stream)// 생성된 스트림을 하나의 스트림으로 평면화
                        .distinct()
                        .collect(toList());

        // match
        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        boolean isHealthy = menu.stream()
                .noneMatch(dish -> dish.getCalories() >= 1000);

        Optional<Dish> dish = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                        .map(n -> n * n)
                        .filter(n -> n % 3 == 0)
                        .findFirst();

        //reducing
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numberList.stream().reduce(0, (a, b) -> a + b);
        int product = numberList.stream().reduce(1, (a, b) -> a * b);

        Optional<Integer> max = numberList.stream().reduce(Integer::max);
        Optional<Integer> min = numberList.stream().reduce(Integer::min);

        menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);

        // number Stream
        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println(calories);

        // rangeStream
        IntStream evenNumbers = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0);
        System.out.println(evenNumbers.count());

        Stream<String> stream = Stream.of("Modern","Java","In","Action");
        stream.map(String::toUpperCase).forEach(System.out::println);
        Stream<String> emptyStream = Stream.empty();

        String homeValue = System.getProperty("home");
        Stream<String> homeValueStream
                = homeValue == null ? Stream.empty() : Stream.of(homeValue);

        Stream<String> homeValueStream2
                = Stream.ofNullable(System.getProperty("home"));

        int[] numbers2 = {2, 3, 5, 7, 11, 13};
        int sum2 = Arrays.stream(numbers2).sum();

        /*
        long uniqueWords = 0;
        try (Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct().count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        Stream.iterate(0, n -> n + 2).limit(5).forEach(System.out::println);

        Stream.generate(Math::random).limit(3).forEach(System.out::println);
    }
}
