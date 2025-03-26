/*
File name:  ReservationRepositoryTest.java (TESTS for repository Class)
Author:     Ammaar
Started:    24.03.25
updated:    24.03.25
*/
package com.college.repository;

import com.college.domain.Reservation;
import org.junit.jupiter.api.*;
import com.college.factory.ReservationFactory;

import static org.junit.jupiter.api.Assertions.*;

class ReservationRepositoryTest {
    static IReservationRepository testReservationRepo;
    Reservation reservation1 = ReservationFactory.createReservation(100, "10am", "12pm");

    @BeforeAll
    static void init(){
        System.out.println("\nTesting 'ReservationRepo.java'");
        System.out.println("------------------------------");
        testReservationRepo = ReservationRepository.getRepo();
    }

    @AfterEach
    void line(){
        System.out.println("----------------------------");
    }

    @Test
    void a_addT1(){
        System.out.println("\nTest1 (Creating and adding to repo)");

        Reservation created = testReservationRepo.create(reservation1);
        assertEquals(reservation1.getReservationId(), created.getReservationId(), "Ids do not match");
        assertNotNull(created, "Object is null");

        System.out.println("\nArrayList");
        System.out.println(testReservationRepo.getAll());
        System.out.println(testReservationRepo.getAll().size());
    }

    @Test
    void b_readT1(){
        System.out.println("\nTest2 (Reading)");

        Reservation read = testReservationRepo.read(reservation1.getReservationId());
        System.out.println(read);
        assertNotNull(read, "\nObject not null");
    }

    @Test
    void c_updateT1(){
        System.out.println("\nTest3 (Updating)");
        Reservation reservation2 = ReservationFactory.createReservation(
                this.reservation1.getReservationId(),
                "12pm",
                "2pm"
        );
        System.out.println(reservation2);

        Reservation successfulUpdate = testReservationRepo.update(reservation2);
        assertNotNull(successfulUpdate, "\nUpdate unsuccessful");
    }

    @Test
    void deleteT1(){
        System.out.println("\nTest4 (Deletion)");

        boolean successfulDeletion = testReservationRepo.delete(reservation1.getReservationId());
        assertTrue(successfulDeletion, "\nDeletion unsuccessful");
    }


    @Test
    void e_getAllT1(){
        System.out.println("\nTest5 (Get all objects; empty)");

        System.out.println(testReservationRepo.getAll());
        assertNotNull(testReservationRepo.getAll(), "\nArrayList is null");
    }

    @Test
    void e_getAllT2(){
        System.out.println("\nTest6 (Get all objects)");

        Reservation created = testReservationRepo.create(reservation1);
        assertEquals(reservation1.getReservationId(), created.getReservationId(), "Ids do not match");

        System.out.println();
        System.out.println(testReservationRepo.getAll());
        System.out.println(testReservationRepo.getAll().size());
        assertNotNull(testReservationRepo.getAll(), "\nArrayList is null");
    }

}