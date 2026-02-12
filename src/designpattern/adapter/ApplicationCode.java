package designpattern.adapter;

public class ApplicationCode {
    ILogger logger;
    public ApplicationCode(ILogger logger){
        this.logger = logger;
    }
}
