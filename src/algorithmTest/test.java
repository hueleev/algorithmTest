package algorithmTest;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class test {
    private static int[] scoville = {1,2,3,9,10,12};
    private static int K = 7;

    public static void main(String[] args) {
        List<Integer> lowerList = new ArrayList<>();
        for (int i : scoville) {
            if (i < 7) {
                lowerList.add(i);
            }
        }

        System.out.println(lowerList);

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s= scan.nextLine();
        scan.close();
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
        int N= 18;
        System.out.println(N%2);
        if (N % 2 == 0) {
            System.out.println(N);
            if (N >=2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}

