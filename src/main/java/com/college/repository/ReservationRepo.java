/*
File name:  ReservationRepo.java
Author:     Ammaar
Started:    12.03.25
*/

package com.college.repository;

import com.college.domain.Reservation;
//import com.college.repository.InReservationRepo;

import java.util.HashMap;

public class ReservationRepo implements InReservationRepo{
    private final HashMap<Integer, Reservation> Reservations = new HashMap<>();
    // -----------------------------

    @Override
    public Object create(Object obj) {
        return null;
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public Object update(Object obj) {
        return null;
    }

    @Override
    public Object delete(Object o) {
        return null;
    }

    @Override
    public Reservation getAll() {
        return null;
    }
    // -----------------------------

}
