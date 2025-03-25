/*
File name:  IPaymentRepository.java
Author:     Talia Smuts
Student Number:    221126082
*/


package com.college.repository;

import com.college.domain.Payment;
import java.util.ArrayList;

public interface IPaymentRepository extends IRepository<Payment, Integer> {
    ArrayList<Payment> getAll();
}