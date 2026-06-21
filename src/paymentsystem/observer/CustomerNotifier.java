package paymentsystem.enums.observer;

import paymentsystem.enums.PaymentStatus;
import paymentsystem.enums.models.Transaction;

public class CustomerNotifier implements PaymentObserver{
    @Override
    public void onTransactionUpdate(Transaction transaction) {
        if(transaction.getPaymentStatus()== PaymentStatus.SUCCESSFUL){
            System.out.println("Payment is successful of "+transaction.getRequest().getAmount());
        }
    }
}
