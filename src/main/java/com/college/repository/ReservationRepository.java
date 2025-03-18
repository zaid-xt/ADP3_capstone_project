/*
File name:  ReservationRepository.java
Author:     Ammaar
Started:    12.03.25
updated:    18.03.25
*/

package com.college.repository;

import com.college.domain.Reservation;
//import com.college.repository.InReservationRepo;

import java.util.ArrayList;
import java.util.HashMap;

public class ReservationRepository implements IReservation {
//    private final HashMap<Integer, Reservation> Reservations = new HashMap<>();
//    private final ArrayList<Reservation> reservations = new ArrayList<>();
    // -----------------------------


    // for singleton pattern
    // checking if another instance of the class was already created
    private static IReservation repo = null;
    public static IReservation getRepo(){
        if(repo == null){
            repo = new ReservationRepository();
        }
        return repo;
    }

    private final ArrayList<Reservation> reservations;
    private ReservationRepository(){
        this.reservations = new ArrayList<>();
    }
    // -----------------------------

    @Override
//    public Reservation add(Reservation obj) {
//    public Reservation save(Reservation obj) {
    public Reservation create(Reservation obj) {
        if (this.reservations.add(obj)){
            System.out.println("added to arraylist");
            return obj;
        }
        return null;
    }

    /**
     * Returns an object at a specific index
     * */
    @Override
    public Reservation read(Integer integer) {
        System.out.println("object found");

        System.out.println(this.reservations.get(integer));
//        return this.reservations.get(integer);
        return null;

        // or use loop
    }

    @Override
    public boolean delete(Integer integer) {
        Reservation reservationToDel = this.read(integer);
        if (reservationToDel == null){
            return false;
        }
        System.out.println("removed from arraylist");
        return this.reservations.remove(reservationToDel);

        // return this.read(integer) ? this.reservations.remove(reservationToDel) : null;

    }

    @Override
    public Reservation update(Reservation obj) {
        System.out.println("updated");

        return null;
    }




    @Override
    public ArrayList<Reservation> getAll() {
        return this.reservations;
    }
}
