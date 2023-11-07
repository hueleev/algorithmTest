package algorithmTest;

import java.util.*;

public class Scale {

    public static void main(String[] args) {
        HashMap<String, String> scaleMap = new HashMap<>();
        scaleMap.put("F", "B");
        scaleMap.put("Bb", "BE");
        scaleMap.put("Eb", "BEA");
        scaleMap.put("Ab", "BEAD");
        scaleMap.put("Db", "BEADG");
        scaleMap.put("Gb", "BEADGC");
        scaleMap.put("Cb", "BEADGCF");

        scaleMap.put("C#", "FCGDAEB");
        scaleMap.put("F#", "FCGDAE");
        scaleMap.put("B", "FCGDA");
        scaleMap.put("E", "FCGD");
        scaleMap.put("A", "FCG");
        scaleMap.put("D", "FC");
        scaleMap.put("G", "F");

        List<String> keys = Arrays.asList(scaleMap.keySet().toArray(new String[0]));

        Collections.shuffle(keys);

        HashMap<String, String> scaleMap2 = new HashMap<>();
        HashMap<String, String> failedMap = new HashMap<>();

        keys.forEach(key -> {
            System.out.println("조 >>>>>> " + key);
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String value = scaleMap.get(key);
            if ((value.toUpperCase()).equals(str.toUpperCase())) {
                System.out.println("OK 🙆🙆🙆");
            } else {
                System.out.println("NO 🙅‍♀️🙅‍♀️🙅‍♀️ >>>> " + value);
                failedMap.put("조 >>>>>> " + key, value);
            }
            scaleMap2.put(value, key);
            System.out.println("-----------------------------------------");
        });

        List<String> switchKeys = Arrays.asList(scaleMap2.keySet().toArray(new String[0]));
        Collections.shuffle(switchKeys);
        System.out.println("-----------------------------------------SWITCH------------------------------------------");
        switchKeys.forEach(key -> {
            System.out.println("#,b >>>>>> " + key);
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String value = scaleMap2.get(key);
            if ((value.toUpperCase()).equals(str.toUpperCase())) {
                System.out.println("OK 🙆🙆🙆");
            } else {
                System.out.println("NO 🙅‍♀️🙅‍♀️🙅‍♀️ >>>> " + value);
                failedMap.put("#,b >>>>>> " + key, value);
            }
            System.out.println("-----------------------------------------");
        });

        List<String> failedKeys = Arrays.asList(failedMap.keySet().toArray(new String[0]));
        Collections.shuffle(failedKeys);
        System.out.println("-----------------------------------------FAILED------------------------------------------");
        failedKeys.forEach(key -> {
            System.out.println(key);
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String value = failedMap.get(key);
            if ((value.toUpperCase()).equals(str.toUpperCase())) {
                System.out.println("OK 🙆🙆🙆");
            } else {
                System.out.println("NO 🙅‍♀️🙅‍♀️🙅‍♀️ >>>> " + value);
            }
            System.out.println("-----------------------------------------");
        });

    }
}
