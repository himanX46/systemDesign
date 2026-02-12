package designpattern.builder;

public class Student {
    private String studentName;
    private int age;
    private String phone;
    private String address;

    private Student(Builder builder){
        this.studentName = builder.studentName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static class Builder{
        private String studentName;
        private int age;
        private String phone;
        private String address;

        public Builder(String name){
            this.studentName = name;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
