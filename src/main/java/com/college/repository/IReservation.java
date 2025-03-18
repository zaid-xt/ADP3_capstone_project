/*
File name:  IReservation.java
Author:     Ammaar
Started:    12.03.25
*/

package com.college.repository;

import com.college.domain.Reservation;

import java.util.ArrayList;

public interface IReservation extends _RepositoryInterface<Reservation, Integer> {
//    public Reservation getAll();
    public ArrayList<Reservation> getAll();

}
