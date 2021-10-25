package javaStudy.mda08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class MainMethod2 {
    public static void main(String[] args) {
        // removeIf
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("01brian", 2011, 300));
        transactions.add(new Transaction("raoul", 2012, 1000));
        transactions.add(new Transaction("05raoul", 2011, 400));
        transactions.add(new Transaction("mario", 2012, 710));
        transactions.add(new Transaction("97mario", 2012, 700));
        transactions.add(new Transaction("alan", 2012, 950));

        for (Transaction transaction : transactions) {
            if (Character.isDigit(transaction.getReferenceCode().charAt(0))) {
                transactions.remove(transaction);
            }
        }
    }
}
