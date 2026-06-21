package paymentsystem.enums.observer;

import paymentsystem.enums.models.Transaction;

public class MerchantNotifier implements PaymentObserver{
    @Override
    public void onTransactionUpdate(Transaction transaction) {
        System.out.println(transaction.getId()+" status updated:: "+transaction.getPaymentStatus());
    }
}
