package designpattern.adapter;

import designpattern.adapter.thirdparty.log4j.Log4jSDK;

public class Log4jAdapter implements ILogger{
    Log4jSDK adapter = new Log4jSDK();
    @Override
    public void log(String message) {
        adapter.sendStream(message);
    }
}
