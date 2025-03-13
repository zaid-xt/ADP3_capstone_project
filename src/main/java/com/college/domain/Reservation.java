/*
File name:  Reservation.java
Author:     Ammaar
Started:    12.03.25
*/

package com.college.domain;

public class Reservation {
    private int reservationId;
    private String reservationDateTimeStart;
    private String reservationDateTimeEnd;
    // -----------------------------------

    private Reservation(){}

    private Reservation(Builder reservationBuilder){
        this.reservationId = reservationBuilder.builderId;
        this.reservationDateTimeStart = reservationBuilder.builderDateTimeStart;
        this.reservationDateTimeEnd = reservationBuilder.builderDateTimeEnd;
    }
    // -----------------------------------

    // getters
    public int getReservationId() {
        return reservationId;
    }

    public String getReservationDateTimeStart() {
        return reservationDateTimeStart;
    }

    public String getReservationDateTimeEnd() {
        return reservationDateTimeEnd;
    }

    @Override
    public String toString() {
        if (this.reservationId == 0){
            return null;
        }

        return "Reservation{" +
                "reservationId=" + reservationId +
                ", reservationDateTimeStart='" + reservationDateTimeStart + '\'' +
                ", reservationDateTimeEnd='" + reservationDateTimeEnd + '\'' +
                '}';
    }
    // -----------------------------------

    public static class Builder{
        private int builderId;
        private String builderDateTimeStart;
        private String builderDateTimeEnd;

        public Builder setReservationId(int reservationId) {
            this.builderId = reservationId;
            return this;
        }

        public Builder setReservationDateTimeStart(String reservationDateTimeStart) {
            this.builderDateTimeStart = reservationDateTimeStart;
            return this;
        }

        public Builder setReservationDateTimeEnd(String reservationDateTimeEnd) {
            this.builderDateTimeEnd = reservationDateTimeEnd;
            return this;
        }

        public Reservation build(){
            return new Reservation(this);
        }
    }
}
