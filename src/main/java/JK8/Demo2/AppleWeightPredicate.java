package JK8.Demo2;

import JK8.Apple;

public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= 6.0;
    }
}
