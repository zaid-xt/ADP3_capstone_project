/*

Project:    temp
Desc:       temp
Started:    11.03.25
Updated:    11.03.25
---

Members
-------
Name and surname    | Student id    | GitHub profile                        |
-----------------------------------------------------------------------------
Ammaar Swartland    | 230159478     | https://github.com/ammaar0x01         |
Zaid Theunissen     | 221084142     | https://github.com/zaid-xt            |
Joshua Twigg        | 222153881     | https://github.com/JoshuaTwigg        |
Talia Theresa Smuts | 221126082     | https://github.com/Taliasmuts28       |
Muaath Slamong      | 230074138     | https://github.com/MuaathSlamong-alt  |
-----------------------------------------------------------------------------
*/

package com.college;

import com.college.entity.Reservation;
import com.college.factory.ReservationFactory;
// import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTesting");
        System.out.println("=======");

        System.out.println("\nReservation");
        Reservation r0 = new Reservation.Builder()
                .build();

        Reservation r1 = new Reservation.Builder()
                .setReservationId(1)
                .build();

        System.out.println(r0);
        System.out.println(r1);


        Reservation r11 = ReservationFactory.createReservation();
        Reservation r12 = ReservationFactory.createReservation(100, "start", "end");

        System.out.println(r11);
        System.out.println(r12);

        // System.out.println(new Date());
    }
}
