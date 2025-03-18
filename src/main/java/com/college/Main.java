/*

Project:    Hotel-management System
Started:    11.03.25
Updated:    18.03.25
---

Members
-------
Name and surname    | Student id    | GitHub repo                                                       |
---------------------------------------------------------------------------------------------------------
Ammaar Swartland    | 230159478     | (original) https://github.com/ammaar0x01/ADP3_capstone_project    |
Zaid Theunissen     | 221084142     | https://github.com/zaid-xt/ADP3_capstone_project                  |
Joshua Twigg        | 222153881     | https://github.com/JoshuaTwigg/ADP3_capstone_project              |
Talia Theresa Smuts | 221126082     | https://github.com/Taliasmuts28/ADP3_capstone_project             |
Muaath Slamong      | 230074138     | https://github.com/MuaathSlamong-alt/ADP3_capstone_project        |
---------------------------------------------------------------------------------------------------------
*/

package com.college;

import com.college.domain.*;
import com.college.factory.*;
import com.college.repository.IReservation;
import com.college.repository.ReservationRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTesting");
        System.out.println("=======");

        System.out.println("\n---Employee---");
        Employee employee = EmployeeFactory.createEmployee(1,"Amaar", "Swartland", "Manager");
        System.out.println(employee);
        // -----------------------------------


        System.out.println("\n---Guest---");
        Guest guest1 = GuestFactory.createGuest(102, "Alice", "Smith", "9876543210", "alice@email.com", "PayPal");
        System.out.println(guest1);
        // -----------------------------------


        System.out.println("\n---Reservation---");
        Reservation r0 = new Reservation.Builder()
                .build();
        Reservation r1 = new Reservation.Builder()
                .setReservationId(1)
                .build();
        System.out.println(r0);
        System.out.println(r1);

        System.out.println("\n---Reservation factory---");
        // Reservation r11 = ReservationFactory.createReservation();
        Reservation r12 = ReservationFactory.createReservation(100, "start", "end");
        // System.out.println(r11);
        System.out.println(r12);

        System.out.println("\n---Reservation repository---");
        IReservation repoReservation = ReservationRepository.getRepo();
        repoReservation.create(r0);
        // -----------------------------------


        System.out.println("\n---Payment---");
        // Create a Payment object using the Builder pattern
        Payment defaultPayment = PaymentFactory.createDefaultPayment(1, "50.00");
        System.out.println("Default Payment: " + defaultPayment);

        // Create a custom payment using the factory
        Payment customPayment = PaymentFactory.createPayment(2, "200.00", "Mastercard", "Completed", "2023-10-05");
        System.out.println("Custom Payment: " + customPayment);
        // -----------------------------------


        System.out.println("\n---Room---");
        Room roomThree = RoomFactory.createRoom();
        System.out.println(roomThree.toString());
        // -----------------------------------

    }
}
