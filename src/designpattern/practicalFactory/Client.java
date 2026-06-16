package designpattern.observerPattern.observable.practicalFactory;

import designpattern.observerPattern.observable.practicalFactory.Birds.Bird;
import designpattern.observerPattern.observable.practicalFactory.Birds.BirdFactory;
import designpattern.observerPattern.observable.practicalFactory.Birds.BirdType;

public class Client {
    public static void main(String[] args) {
        Bird bird = BirdFactory.createBirdOfType(BirdType.SPARROW);
    }
}
