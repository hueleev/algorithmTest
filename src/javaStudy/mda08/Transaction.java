package javaStudy.mda08;

import javaStudy.mda05.Trader;

public class Transaction {

    private final String referenceCode;
    private final int year;
    private final int value;

    public Transaction(String referenceCode, int year, int value) {
        this.referenceCode = referenceCode;
        this.year = year;
        this.value = value;
    }

    public String getReferenceCode() { return referenceCode; }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "referenceCode=" + referenceCode +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
