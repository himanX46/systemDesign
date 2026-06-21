package paymentsystem.enums.strategy;

import paymentsystem.enums.models.PaymentRequest;
import paymentsystem.enums.models.PaymentResponse;

public interface PaymentProcessor {
    PaymentResponse processPayment(PaymentRequest paymentRequest);
}
