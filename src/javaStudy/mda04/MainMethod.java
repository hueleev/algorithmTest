package javaStudy.mda04;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MainMethod {

    public static void main(String[] args) {
        List<Dish_before> dishList = Arrays.asList(
                new Dish_before("fish", 200),
                new Dish_before("candy", 50),
                new Dish_before("pasta", 500)
        );

        List<Dish_before> lowCaloricDishes = new ArrayList<>();
        for (Dish_before dish : dishList) {
            if (dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }

        // 익명 클래스로 요리 정렬
        Collections.sort(lowCaloricDishes, new Comparator<Dish_before>() {
            @Override
            public int compare(Dish_before o1, Dish_before o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });

        // 정렬된 리스트 처리하여 이름 선택
        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish_before dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
        }

        System.out.println(lowCaloricDishes);
        System.out.println(lowCaloricDishesName);

        List<String> lowCaloricDishesName2 =
                dishList.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish_before::getCalories))
                .map(Dish_before::getName)
                .collect(toList());

        System.out.println(lowCaloricDishesName2);
    }
}
