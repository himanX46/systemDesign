package designpattern.prototype.copyObject;

public class IntelligentStudent extends Student {
    private int iq;
    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }



    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }
}
