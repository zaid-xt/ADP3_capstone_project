/*
File name:  ReservationFactory.java (Factory class)
Author:     Ammaar
Started:    12.03.25
*/

package com.college.factory;

import com.college.domain.Reservation;

public class ReservationFactory {
    public static Reservation createReservation(){
        return new Reservation.Builder().build();
    }

    public static Reservation createReservation(
            int rId,
            String rTimeStart,
            String rTimeEnd
    ){
        return new Reservation.Builder()
                .setReservationId(rId)
                .setReservationDateTimeStart(rTimeStart)
                .setReservationDateTimeEnd(rTimeEnd)
                .build();
    }
}
