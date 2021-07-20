package javaStudy.mda02;

/**
 * 초록색 사과 Predicate
 */
public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return Apple.Color.GREEN.equals(apple.getColor());
    }
}
