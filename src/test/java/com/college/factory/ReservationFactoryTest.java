/*
File name:  ReservationFactoryTest.java (TESTS for factory Class)
Author:     Ammaar
Started:    24.03.25
updated:    24.03.25
*/

package com.college.factory;

import com.college.domain.Reservation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFactoryTest {
    @AfterEach
    void line(){
        System.out.println("----------------------------");
    }

    @Test
    void createReservationT1() {
        System.out.println("\nTest1 (object creation; no parameters)");
        Reservation obj = ReservationFactory.createReservation();
        assertNotNull(obj, "\nObject is null");
    }

    @Test
    void createReservationT2(){
        System.out.println("\nTest2 (object creation; empty strings; id=0)");
        Reservation obj = ReservationFactory.createReservation(0, "", "");
        assertNotNull(obj, "\nObject is null");
    }

    @Test
    void createReservationT3(){
        System.out.println("\nTest3 (object creation; empty strings)");
        Reservation obj = ReservationFactory.createReservation(111, "", "");
        assertNotNull(obj, "\nObject is null");
    }

    @Test
    void createReservationT4(){
        System.out.println("\nTest4 (object creation)");
        Reservation obj = ReservationFactory.createReservation(1, "8am", "10am");
        assertNotNull(obj, "\nObject is null");
    }

    @Test
    void equalityT1(){
        System.out.println("\nTest5 (testing equality)");
        Reservation obj1 = ReservationFactory.createReservation(12, "9am", "11am");
        Reservation obj2 = ReservationFactory.createReservation(12, "9am", "11am");

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        assertNotEquals(obj1, obj2, "\nObjects are equal");
    }
}
