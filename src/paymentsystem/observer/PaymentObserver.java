package paymentsystem.enums.observer;

import paymentsystem.enums.models.Transaction;

public interface PaymentObserver {
    void onTransactionUpdate(Transaction transaction);
}
