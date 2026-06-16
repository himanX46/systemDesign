package designpattern.strategy;

public class Client extends Drive{
    public Client() {
        super(new SimpleDriveStrategy());
    }
}
