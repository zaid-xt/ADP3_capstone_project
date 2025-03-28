/*  Housekeeper.java
    Housekeeper Entity
    Author: Muaath Slamong (230074138)
    Date: 19 March 2025
*/
package com.college.domain;

public class Housekeeper {
    // Housekeeper attribute
    private int HousekeeperId;
    private String HousekeeperName;
    private String HousekeeperSurname;

    // Default Constructor
    public Housekeeper() {

    }

    // Builder Housekeeper
    public Housekeeper(HousekeeperBuilder builder) {
        this.HousekeeperId = builder.HousekeeperId;
        this.HousekeeperName = builder.HousekeeperName;
        this.HousekeeperSurname = builder.HousekeeperSurname;
    }

    // Getters
    public int getHousekeeperId() {
        return HousekeeperId;
    }

    public String getHousekeeperName() {
        return HousekeeperName;
    }

    public String getHousekeeperSurname() {
        return HousekeeperSurname;
    }


    @Override
    public String toString() {
        return "Housekeeper{" +
                "HousekeeperId=" + HousekeeperId +
                ", HousekeeperName='" + HousekeeperName + '\'' +
                ", HousekeeperSurname='" + HousekeeperSurname + '\'' +
                '}';
    }

    public static class HousekeeperBuilder {
        private int HousekeeperId;
        private String HousekeeperName;
        private String HousekeeperSurname;

        public HousekeeperBuilder() {}

        public HousekeeperBuilder(int HousekeeperId, String HousekeeperName, String HousekeeperSurname, String HousekeeperRole) {
            this.HousekeeperId = HousekeeperId;
            this.HousekeeperName = HousekeeperName;
            this.HousekeeperSurname = HousekeeperSurname;
        }

        // Builder Getters
        public HousekeeperBuilder setHousekeeperId(int HousekeeperId) {
            this.HousekeeperId = HousekeeperId;
            return this;
        }

        public HousekeeperBuilder setHousekeeperName(String HousekeeperName) {
            this.HousekeeperName = HousekeeperName;
            return this;
        }

        public HousekeeperBuilder setHousekeeperSurname(String HousekeeperSurname) {
            this.HousekeeperSurname = HousekeeperSurname;
            return this;
        }

        public Housekeeper build() {
            return new Housekeeper(this);
        }
    }
}
