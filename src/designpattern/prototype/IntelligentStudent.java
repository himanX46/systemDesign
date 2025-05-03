package designpattern.prototype;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    public IntelligentStudent() {
        super();
    }

    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }
}
