package javaStudy.mda02;

/**
 * 무게 Predicate
 */
public class AppleHeavyWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
