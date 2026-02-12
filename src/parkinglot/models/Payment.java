package parkinglot.models;

import java.util.Date;

public class Payment extends BaseModel{
    private int amount;
    private PaymentMode mode;
    private PaymentStatus paymentStatus;
    private String refId;
    private Bill bill;
    private Date time;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", mode=" + mode +
                ", paymentStatus=" + paymentStatus +
                ", refId='" + refId + '\'' +
                ", bill=" + bill +
                ", time=" + time +
                '}';
    }
}
