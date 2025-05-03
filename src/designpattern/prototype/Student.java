package designpattern.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    String name;
    String addess;
    int rollNo;

    public Student(Student other){
        this.name = other.name;
        this.addess = other.addess;
        this.rollNo = other.rollNo;
    }

    public Student(){}

    public Student copy(){
        return new Student(this);
    }
}
