package designpattern.practicalFactory;

import designpattern.practicalFactory.Birds.Bird;
import designpattern.practicalFactory.Birds.BirdFactory;
import designpattern.practicalFactory.Birds.BirdType;

public class Client {
    public static void main(String[] args) {
        Bird bird = BirdFactory.createBirdOfType(BirdType.SPARROW);
    }
}
