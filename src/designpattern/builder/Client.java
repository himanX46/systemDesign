package designpattern.builder;

public class Client {
    public static void main(String[] args) {
        Student st = new IntelligentStudent();
        Student other = st.copy();
    }
}
