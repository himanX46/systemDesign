package designpattern.prototype.copyObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    String name;
    String addess;
    int rollNo;
    String batch;

    public Student(Student other){
        this.name = other.name;
        this.addess = other.addess;
        this.rollNo = other.rollNo;
        this.batch = other.batch;
    }

    public Student(String batch){
        this.batch = batch;
    }

    public Student copy(){
        return new Student(this);
    }
}
