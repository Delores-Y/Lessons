package JK8.Demo2;

import JK8.Apple;

public class AppleColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "Green".equals(apple.getColor());
    }
}
