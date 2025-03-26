package com.college.domain;

public class Payment {
    private int paymentId;
    private String paymentAmount;
    private String paymentMethod;
    private String paymentStatus;
    private String paymentDate;

    public Payment() {

    }

    private Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.paymentAmount = builder.paymentAmount;
        this.paymentMethod = builder.paymentMethod;
        this.paymentStatus = builder.paymentStatus;
        this.paymentDate = builder.paymentDate;

    }
    public int getPaymentId() {
        return paymentId;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public String getPaymentDate() {
        return paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                '}';
    }

    public static class Builder {
        private int paymentId;
        private String paymentAmount;
        private String paymentMethod;
        private String paymentStatus;
        private String paymentDate;

        public Builder setPaymentId(int paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setPaymentAmount(String paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder setPaymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }


    }
}
