package designpattern.adapter;

import designpattern.adapter.thirdparty.logger.LoggerAPI;

public class LoggerAPIAdapter implements ILogger{
    private LoggerAPI adapter = new LoggerAPI();
    @Override
    public void log(String message) {
        adapter.printLog(message.getBytes());
    }
}
