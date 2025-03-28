/* GuestRepository.java
Guest Repository Class
Author: Zaid Theunissen (221084142)
Date: 26 March 2025
*/
package com.college.repository;

import com.college.domain.Guest;
import java.util.*;

public class GuestRepository implements IGuestRepository {
    private final Map<Integer, Guest> guestDatabase = new HashMap<>();

    @Override
    public Guest create(Guest guest) {
        guestDatabase.put(guest.getGuestID(), guest);
        return guest;
    }

    @Override
    public Guest read(Integer guestID) {
        return guestDatabase.get(guestID);
    }

    @Override
    public Guest update(Guest guest) {
        if (guestDatabase.containsKey(guest.getGuestID())) {
            guestDatabase.put(guest.getGuestID(), guest);
            return guest;
        }
        return null;
    }

    @Override
    public boolean delete(Integer guestID) {
        return guestDatabase.remove(guestID) != null;
    }

//    @Override // use this?
    public Map<Integer, Guest> getAll() {
        return guestDatabase;
    }

    @Override
    public List<Guest> findByName(String name) {
        List<Guest> result = new ArrayList<>();
        for (Guest guest : guestDatabase.values()) {
            if (guest.getName().equalsIgnoreCase(name)) {
                result.add(guest);
            }
        }
        return result;
    }
}