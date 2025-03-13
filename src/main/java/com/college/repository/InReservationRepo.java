/*
File name:  InReservationRepo.java
Author:     Ammaar
Started:    12.03.25
*/

package com.college.repository;

import com.college.domain.Reservation;

public interface InReservationRepo extends _RepoInterface{
    public Reservation getAll();

}
