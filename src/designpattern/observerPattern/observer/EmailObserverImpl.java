package designpattern.observerPattern.observer;

import designpattern.observerPattern.observable.StocksObservable;

public class EmailObserver implements Observer{
    String emailId;
    StocksObservable observable;

    public EmailObserver(String emailId,StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(emailId,"product is in stock");
    }
    static void sendEmail(String emailId,String message){
        System.out.println("mail sent to email: "+emailId+", with message: "+message);
    }
}
