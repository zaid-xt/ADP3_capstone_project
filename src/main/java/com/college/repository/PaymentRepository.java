/*
File name:  PaymentRepository.java
Author:     Talia Smuts
Student Number:    221126082
*/


package com.college.repository;

import com.college.domain.Payment;
import java.util.ArrayList;

public class PaymentRepository implements IPaymentRepository {
    private static IPaymentRepository repo = null;
    private static int counter;
    private final ArrayList<Payment> payments;

    private PaymentRepository() {
        this.payments = new ArrayList<>();
    }


    public static IPaymentRepository getRepo(){
        counter++;
        System.out.println("\ninstances: " + counter);


        if(repo == null){
            System.out.println("Creating object...");
            repo = new PaymentRepository();
            return repo;
        }
        System.out.println("Object already exists");
        return repo;
    }


    @Override
    public Payment create(Payment obj) {
        if (obj == null) {
            System.out.println("Error: Payment cannot be null.");
            return null;
        }
        if (this.payments.add(obj)) {
            System.out.println("Payment added: " + obj);
            return obj;
        }
        System.out.println("Error: Payment cannot be completed");
        return null;
    }


    @Override
    public Payment read(Integer Id) {
        if (Id == null) {
            System.out.println("Error: ID cannot be null.");
            return null;
        }
        for (Payment payment : this.payments) {
            if (payment.getPaymentId() == Id) {
                System.out.println("Payment found: " + payment);
                return payment;
            }
        }
        System.out.println("Error: Payment with ID " + Id + " not found.");
        return null;
    }

    @Override
    public Payment update(Payment obj) {
        if (obj == null) {
            System.out.println("Error: Payment cannot be null.");
            return null;
        }
        for (int i = 0; i < payments.size(); i++) {
            Payment existingPayment = payments.get(i);
            if (existingPayment.getPaymentId() == obj.getPaymentId()) {
                payments.set(i, obj); // Replace the existing payment
                System.out.println("Payment updated: " + obj);
                return obj;
            }
        }
        System.out.println("Error: Payment with ID " + obj.getPaymentId() + " not found.");
        return null;
    }

    @Override
    public boolean delete(Integer Id) {
        if (Id == null) {
            System.out.println("Error: ID cannot be null.");
            return false;
        }
        for (Payment payment : payments) {
            if (payment.getPaymentId() == Id) {
                payments.remove(payment);
                System.out.println("Payment deleted: " + payment);
                return true;
            }
        }
        System.out.println("Error: Payment with ID " + Id + " not found.");
        return false;
    }

    @Override
    public ArrayList<Payment> getAll(){
        return this.payments;
    }
}