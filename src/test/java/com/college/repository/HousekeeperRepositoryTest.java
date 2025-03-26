/*  HousekeeperRepositoryTest.java
    Housekeeper Repository Test Class
    Author: Muaath Slamong (230074138)
    Date: 25 March 2025
*/

package com.college.repository;

import com.college.domain.Housekeeper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HousekeeperRepositoryTest {
    private HousekeeperRepository repository;
    private Housekeeper housekeeper1;
    private Housekeeper housekeeper2;

    // Create sample housekeepers
    @BeforeEach
    void setUp() {
        repository = HousekeeperRepository.getRepository();

        // Housekeepers with unique IDs
        housekeeper1 = new Housekeeper.HousekeeperBuilder()
                .setHousekeeperId(1)
                .setHousekeeperName("Ammaar")
                .setHousekeeperSurname("Swartland")
                .build();
        housekeeper2 = new Housekeeper.HousekeeperBuilder()
                .setHousekeeperId(2)
                .setHousekeeperName("Zaid")
                .setHousekeeperSurname("Theunissen")
                .build();
    }

    // Tests if Repository is correctly retrieved
    @Test
    void testGetRepository() {
        HousekeeperRepository repoInstance = HousekeeperRepository.getRepository();
        assertNotNull(repoInstance);
        assertSame(repository, repoInstance);
    }

    @Test
    void testCreate() {
        //Create a new Housekeeper and verify its stored correctly
        Housekeeper created = repository.create(housekeeper1);
        assertNotNull(created);
        assertEquals(housekeeper1.getHousekeeperId(), created.getHousekeeperId());
    }

    @Test
    void testRead() {
        //Store a housekeeper and reads it
        repository.create(housekeeper1);
        Housekeeper read = repository.read(housekeeper1.getHousekeeperId());
        assertNotNull(read);
        assertEquals(housekeeper1.getHousekeeperId(), read.getHousekeeperId());
    }

    @Test
    void testDelete() {
        //Store and delete housekeeper
        repository.create(housekeeper2);
        boolean deleted = repository.delete(housekeeper2.getHousekeeperId());
        assertTrue(deleted);
        assertNull(repository.read(housekeeper2.getHousekeeperId()));
    }

    @Test
    void testUpdate() {
        //Store and Update Housekeeper
        repository.create(housekeeper1);
        Housekeeper updated = new Housekeeper.HousekeeperBuilder()
                .setHousekeeperId(1)
                .setHousekeeperName("Updated Name")
                .setHousekeeperSurname("Updated Surname")
                .build();

        Housekeeper result = repository.update(updated);
        assertNotNull(result);
        assertEquals("Updated Name", result.getHousekeeperName());
    }

    @Test
    void testGetAll() {
        // Store housekeepers and verify if they are retrieved
        repository.create(housekeeper1);
        repository.create(housekeeper2);
        assertEquals(4, repository.getAll().size());
    }


}
