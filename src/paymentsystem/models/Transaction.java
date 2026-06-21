package paymentsystem.enums.models;



import paymentsystem.enums.PaymentStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final String id;
    private final PaymentRequest request;
    private PaymentStatus paymentStatus;
    private final LocalDateTime timestamp;

    public Transaction(PaymentRequest request){
        this.request = request;
        this.id = UUID.randomUUID().toString();
        this.paymentStatus = PaymentStatus.INITIATED;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public PaymentRequest getRequest() {
        return request;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
