package javaStudy.mda02;

/**
 * �ʷϻ� ����� ����
 */
public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return Apple.Color.GREEN.equals(apple.getColor());
    }
}
