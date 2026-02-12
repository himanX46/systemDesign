package designpattern.practicalFactory.Birds;

public class BirdFactory {

    public static Bird createBirdOfType(BirdType birdType){
        return switch(birdType){
            case HEN -> new Hen();
            case CROW -> new Crow();
            case PEACOCK -> new Peacock();
            case SPARROW -> new Sparrow();
            default -> new Bird();
        };
    }

    public static Bird createObjectFromStringType(String str){
        if(str.equalsIgnoreCase("HEN")){
            return new Hen();
        }else if(str.equalsIgnoreCase("SPARROW")){
            return new Sparrow();
        }else if(str.equalsIgnoreCase("PEACOCK")){
            return new Peacock();
        }else if(str.equalsIgnoreCase("CROW")){
            return new Crow();
        }else{
            return new Bird();
        }
    }
}
