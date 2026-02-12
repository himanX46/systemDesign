package designpattern.builder;

public class Client {
    public static void main(String[] args) {
        Student student = new Student.Builder("Himan")
                .age(20).address("Hyd").
                phone("81").build();
    }
}
