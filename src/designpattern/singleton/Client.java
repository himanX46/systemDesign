package designpattern.singleton;

public class Client {
    DatabaseConnection dbc = DatabaseConnection.getInstance();
    DatabaseConnection dbc2 = DatabaseConnection.getInstance();
}
