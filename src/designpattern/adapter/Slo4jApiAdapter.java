package designpattern.adapter;

import designpattern.adapter.thirdparty.slo4j.SloAPI4j;

public class Slo4jApiAdapter implements ILogger{
    private SloAPI4j adapter = new SloAPI4j();
    @Override
    public void log(String message) {
        adapter.out(message);
    }
}
