/*

Project:    temp
Desc:       temp
Started:    11.03.25
Updated:    11.03.25
---

Members
-------
Name and surname    | Student id    | GitHub repo                                                       |
---------------------------------------------------------------------------------------------------------
Ammaar Swartland    | 230159478     | (original) https://github.com/ammaar0x01/ADP3_capstone_project    |
Zaid Theunissen     | 221084142     | https://github.com/zaid-xt/ADP3_capstone_project                  |
Joshua Twigg        | 222153881     |                                   |
Talia Theresa Smuts | 221126082     | https://github.com/Taliasmuts28/ADP3_capstone_project.git         |
Muaath Slamong      | 230074138     | https://github.com/MuaathSlamong-alt/ADP3_capstone_project.git    |
---------------------------------------------------------------------------------------------------------
*/

package com.college;

import com.college.domain.Reservation;
import com.college.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTesting");
        System.out.println("=======");

        System.out.println("\n---Reservation---");
        Reservation r0 = new Reservation.Builder()
                .build();
        Reservation r1 = new Reservation.Builder()
                .setReservationId(1)
                .build();
        System.out.println(r0);
        System.out.println(r1);


        System.out.println("\n---Reservation factory---");
        Reservation r11 = ReservationFactory.createReservation();
        Reservation r12 = ReservationFactory.createReservation(100, "start", "end");
        System.out.println(r11);
        System.out.println(r12);



    }
}
