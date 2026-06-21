package paymentsystem.enums.models;

import parkinglot.models.PaymentStatus;

public class PaymentResponse {
    private final PaymentStatus paymentStatus;
    private final String message;

    public PaymentResponse(PaymentStatus paymentStatus, String message) {
        this.paymentStatus = paymentStatus;
        this.message = message;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public String getMessage() {
        return message;
    }
}
