/*  HousekeeperRepository.java
    Housekeeper Repository
    Author: Muaath Slamong (230074138)
    Date: 23 March 2025
*/

package com.college.repository;

import com.college.domain.Housekeeper;
import java.util.ArrayList;

public class HousekeeperRepository {
    // Singleton instance
    private static HousekeeperRepository repo = null;
    private static int counter;

    private final ArrayList<Housekeeper> housekeepers;

    private HousekeeperRepository() {
        this.housekeepers = new ArrayList<>();
    }

    public static HousekeeperRepository getRepository() {
        counter++;
        System.out.println("\nInstances: " + counter);

        if (repo == null) {
            System.out.println("Creating object...");
            repo = new HousekeeperRepository();
            return repo;
        }
        System.out.println("Object already exists");
        return repo;
    }

    // Create
    public Housekeeper create(Housekeeper obj) {
        if (this.housekeepers.add(obj)) {
            System.out.println(obj);
            System.out.println(" * added to arraylist");
            return obj;
        }
        return null;
    }

    // Read
    public Housekeeper read(int housekeeperId) {
        for (Housekeeper housekeeper : this.housekeepers) {
            if (housekeeperId == housekeeper.getHousekeeperId()) {
                System.out.println(" * object found");
                return housekeeper;
            }
        }
        System.out.println(" * object not found");
        return null;
    }

    // Delete
    public boolean delete(int housekeeperId) {
        Housekeeper housekeeperToDel = this.read(housekeeperId);
        if (housekeeperToDel == null) {
            return false;
        }
        System.out.println(" * removed from arraylist");
        return this.housekeepers.remove(housekeeperToDel);
    }

    // Update
    public Housekeeper update(Housekeeper obj) {
        int housekeeperId = obj.getHousekeeperId();
        Housekeeper existingHousekeeper = this.read(housekeeperId);

        if (existingHousekeeper == null) {
            return null;
        }

        boolean success = this.delete(housekeeperId);
        if (success) {
            System.out.println(" * updated");
            if (this.housekeepers.add(obj)) {
                return obj;
            }
        }
        return null;
    }

    // Get All
    public ArrayList<Housekeeper> getAll() {
        return this.housekeepers;
    }
}

