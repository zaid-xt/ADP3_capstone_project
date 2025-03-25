package com.college.factory;

import com.college.domain.Housekeeper;

public class HousekeeperFactory {
    // Create Housekeeper
    public static Housekeeper createHousekeeper(int HousekeeperId, String HousekeeperName, String HousekeeperSurname) {
        return new Housekeeper.HousekeeperBuilder()
                .setHousekeeperId(HousekeeperId)
                .setHousekeeperName(HousekeeperName)
                .setHousekeeperSurname(HousekeeperSurname)
                .build();

    }
}
