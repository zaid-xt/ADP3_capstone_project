/*
File name:  IReservationRepo.java (Interface)
Author:     Ammaar
Started:    12.03.25
Updated:    24.03.25
*/

package com.college.repository;

import com.college.domain.Reservation;

import java.util.ArrayList;

public interface IReservationRepository extends IRepository<Reservation, Integer> {
    ArrayList<Reservation> getAll();
}
