/*
File name:  PaymentFactoryTest.java
Author:     Talia Smuts
Student Number:    221126082
*/
package com.college.factory;

import static org.junit.jupiter.api.Assertions.*;

import com.college.domain.Payment;
import org.junit.jupiter.api.Test;

public class PaymentFactoryTest {

    @Test
    public void testCreateDefaultPayment() {
        Payment payment = PaymentFactory.createDefaultPayment(1, "1500.00");

        assertEquals(1, payment.getPaymentId());
        assertEquals("1500.00", payment.getPaymentAmount());
        assertEquals("Credit Card", payment.getPaymentMethod());
        assertEquals("Pending", payment.getPaymentStatus());
        assertEquals("2023-10-01", payment.getPaymentDate());
    }

    @Test
    public void testCreatePayment() {
        Payment payment = PaymentFactory.createPayment(2, "750.00", "Mastercard", "Completed", "2023-10-05");

        assertEquals(2, payment.getPaymentId());
        assertEquals("750.00", payment.getPaymentAmount());
        assertEquals("Mastercard", payment.getPaymentMethod());
        assertEquals("Completed", payment.getPaymentStatus());
        assertEquals("2023-10-05", payment.getPaymentDate());
    }
}