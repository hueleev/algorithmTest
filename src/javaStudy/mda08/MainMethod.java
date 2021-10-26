package javaStudy.mda08;

import java.util.*;
import java.util.stream.Collectors;

public class MainMethod {

    public static void main(String[] args) {
        List<String> friends_java8 = new ArrayList<>();
        friends_java8.add("James");
        friends_java8.add("Hue");
        friends_java8.add("Amy");

        try {
            List<String> friends = Arrays.asList("James", "Hue", "Amy");

            friends.set(0, "Richard"); // ok
            friends.add("Daniel"); // error
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 리스트 팩토리
        /*try {
            List<String> listFactory = List.of("James", "Hue", "Amy");
            listFactory.set(0, "Richard"); // ok
            listFactory.add("Daniel"); // error
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        // 집합 팩토리
        //Set<String> setFactory = Set.of("James", "Hue", "Amy");

        // 맵 팩토리
         /*Map<String, Integer> ageOfFriends = Map.of("James", 30, "Hue", 20, "Amy", 13);
        Map<String, Integer> ageOfFriends2
                = Map.ofEntries(
                        Map.entry("James", 30),
                        Map.entry("Hue", 20),
                        Map.entry("Amy", 13));*/
    }
}
