package paymentsystem.enums.strategy;

import paymentsystem.enums.PaymentStatus;
import paymentsystem.enums.models.PaymentRequest;
import paymentsystem.enums.models.PaymentResponse;

public class CreditCardProcessor extends AbstractPaymentProcessor{
    @Override
    PaymentResponse doProcess(PaymentRequest request) {
        System.out.println("processing credit card of amount:: "+request.getAmount());
        return new PaymentResponse(PaymentStatus.SUCCESSFUL,"Credit card payment successful");
    }
}
