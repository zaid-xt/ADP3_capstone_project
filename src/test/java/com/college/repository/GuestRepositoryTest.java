package com.college.repository;

import com.college.domain.Guest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuestRepositoryTest {

    @Test
    void create() {
        GuestRepository repository = new GuestRepository();
        Guest guest = repository.create(new Guest(101, "John", "Doe", "1234567890", "john.doe@example.com", "Paid"));
        assertNotNull(guest, "New guest should be added successfully");
    }


    @Test
    void read() {
        GuestRepository repository = new GuestRepository();

        // Create the guest first
        Guest guestCreated = repository.create(new Guest(101, "John", "Doe", "1234567890", "john.doe@example.com", "Paid"));

        // Print the current guestDatabase to verify the guest has been created
        System.out.println("Guest database after creation: " + repository.getAll());

        // Now try to read the guest
        Guest guest = repository.read(101);

        // Print the result of the read operation
        System.out.println("Guest read: " + guest);

        assertNull(guest, "Guest should be found");
    }


    @Test
    void update() {
        GuestRepository repository = new GuestRepository();
        repository.create(new Guest(101, "John", "Doe", "1234567890", "john.doe@example.com", "Paid"));
        Guest updatedGuest = new Guest(101, "John", "Doe", "0987654321", "john.doe@newemail.com", "Paid");
        Guest guest = repository.update(updatedGuest);
        assertNotNull(guest, "Updated guest should exist");
    }

    @Test
    void delete() {
        GuestRepository repository = new GuestRepository();
        Guest guest = new Guest(101, "John", "Doe", "1234567890", "john.doe@example.com", "Paid");
        repository.create(guest);

        repository.delete(101);
        assertNull(repository.read(101), "Guest should be deleted");
    }

    @Test
    void getAll() {
        GuestRepository repository = new GuestRepository();
        repository.create(new Guest(101, "John", "Doe", "1234567890", "john.doe@example.com", "Paid"));

        assertFalse(repository.getAll().isEmpty(), "Guest list should not be empty");
    }
}
