/*  HousekeeperFactoryTest.java
    Housekeeper Test Class
    Author: Muaath Slamong (230074138)
    Date: 25 March 2025
*/

package com.college.factory;

import com.college.domain.Housekeeper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HousekeeperFactoryTest {

    // Creates a standard Housekeeper
    @Test
    void testCreateHousekeeper() {
        Housekeeper housekeeper = HousekeeperFactory.createHousekeeper(1, "Ammaar", "Swartland");

        assertNotNull(housekeeper);
        assertEquals(1, housekeeper.getHousekeeperId());
        assertEquals("Ammaar", housekeeper.getHousekeeperName());
        assertEquals("Swartland", housekeeper.getHousekeeperSurname());
    }


    @Test
    void testCreateHousekeeperWithDifferentValues() {
        Housekeeper housekeeper = HousekeeperFactory.createHousekeeper(2, "Zaid", "Theunissen");

        assertNotNull(housekeeper);
        assertEquals(2, housekeeper.getHousekeeperId());
        assertEquals("Zaid", housekeeper.getHousekeeperName());
        assertEquals("Theunissen", housekeeper.getHousekeeperSurname());
    }

    // Creates Housekeeper with no ID
    @Test
    void testCreateHousekeeperWithZeroId() {
        Housekeeper housekeeper = HousekeeperFactory.createHousekeeper(0, "NULL", "NULL");

        assertNotNull(housekeeper);
        assertEquals(0, housekeeper.getHousekeeperId());
        assertEquals("NULL", housekeeper.getHousekeeperName());
        assertEquals("NULL", housekeeper.getHousekeeperSurname());
    }

    @Test
    void testEquality() {
        System.out.println("\nTest Equality (Housekeeper Factory)");

        Housekeeper obj1 = HousekeeperFactory.createHousekeeper(3, "Talia", "Smuts");
        Housekeeper obj2 = HousekeeperFactory.createHousekeeper(3, "Muaath", "Slamong");

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        // Objects will not be equal since they are different instances
        assertNotEquals(obj1, obj2, "\nObjects are equal");
    }

}
