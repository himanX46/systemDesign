package designpattern.prototype.copyObject;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        registry.addStudent("nov22Batch",new Student("Nov22Batch"));
        registry.addStudent("aug23Batch",new Student("aug22Batch"));

        Student himan = registry.getStudent("aug23Batch").copy();
        himan.setName("Himan");

        Student rajiv = registry.getStudent("aug23Batch").copy();
        rajiv.setName("Rajiv");
    }
}
