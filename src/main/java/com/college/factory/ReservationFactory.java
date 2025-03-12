package com.college.factory;

import com.college.entity.Reservation;

public class ReservationFactory {
    public static Reservation createReservation(){
        return new Reservation.Builder()
                .setReservationId(1)
                .build();
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
