/*
File name:  PaymentRepositoryTest.java
Author:     Talia Smuts
Student Number:    221126082
*/
package com.college.repository;

import com.college.domain.Payment;
import com.college.factory.PaymentFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentRepositoryTest {
    private IPaymentRepository repo = PaymentRepository.getRepo();

    @BeforeEach
    void setUp() {
        repo.getAll().clear();
    }

    @Test
    void create_shouldAddPaymentToRepository() {
        Payment payment = PaymentFactory.createDefaultPayment(1, "1500.00");
        Payment result = repo.create(payment);

        assertNotNull(result, "Should return the created payment");
        assertEquals(payment.getPaymentId(),
                repo.getAll().get(0).getPaymentId(),
                "Payment ID should match");
    }

    @Test
    void read_shouldReturnPaymentWhenExists() {
        Payment payment = PaymentFactory.createDefaultPayment(1, "1500.00");
        repo.create(payment);

        Payment found = repo.read(1);
        assertNotNull(found, "Should find the payment");
        assertEquals(payment.getPaymentId(), found.getPaymentId(), "Payment ID should match");
        assertEquals(payment.getPaymentAmount(), found.getPaymentAmount(), "Amount should match");
    }

    @Test
    void read_shouldReturnNullWhenNotFound() {
        assertNull(repo.read(999), "Should return null for non-existent payment");
    }

    @Test
    void update_shouldModifyExistingPayment() {
        Payment original = PaymentFactory.createDefaultPayment(1, "1500.00");
        repo.create(original);


        Payment updated = new Payment.Builder()
                .setPaymentId(1)
                .setPaymentAmount("2000.00")
                .setPaymentMethod("Updated Method")
                .setPaymentStatus("Updated Status")
                .setPaymentDate("2023-11-01")
                .build();


        Payment result = repo.update(updated);
        assertNotNull(result, "Should return the updated payment");


        Payment stored = repo.read(1);
        assertEquals(updated.getPaymentAmount(), stored.getPaymentAmount(), "Amount should be updated");
        assertEquals(updated.getPaymentMethod(), stored.getPaymentMethod(), "Method should be updated");
    }

    @Test
    void update_shouldReturnNullWhenNotFound() {
        Payment nonExistent = PaymentFactory.createDefaultPayment(999, "100.00");
        assertNull(repo.update(nonExistent), "Should return null for non-existent payment");
    }

    @Test
    void delete_shouldRemovePayment() {
        Payment payment = PaymentFactory.createDefaultPayment(1, "1500.00");
        repo.create(payment);

        boolean deleted = repo.delete(1);
        assertTrue(deleted, "Should return true when deleted");
        assertEquals(0, repo.getAll().size(), "Repository should be empty");
    }

    @Test
    void delete_shouldReturnFalseWhenNotFound() {
        assertFalse(repo.delete(999), "Should return false for non-existent payment");
    }

    @Test
    void getRepo_shouldReturnSameInstance() {
        IPaymentRepository firstInstance = PaymentRepository.getRepo();
        IPaymentRepository secondInstance = PaymentRepository.getRepo();
        assertSame(firstInstance, secondInstance, "Should return the same instance");
    }
}
