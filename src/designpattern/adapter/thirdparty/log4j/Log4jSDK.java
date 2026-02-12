package designpattern.adapter.thirdparty.log4j;

public class Log4jSDK {
    public boolean sendStream(String message){
        System.out.println("Sending stream");
        return true;
    }
}
