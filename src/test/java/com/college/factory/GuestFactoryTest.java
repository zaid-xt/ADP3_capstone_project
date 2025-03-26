package com.college.factory;

import com.college.domain.Guest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuestFactoryTest {

    @Test
    void testCreateGuestWithValidData() {
        Guest guest = GuestFactory.createGuest(101, "John", "Doe", "1234567890", "john.doe@example.com", "Paid");
        assertNotNull(guest, "Guest should be created successfully");
        assertEquals("John", guest.getName());
    }

    @Test
    void testCreateGuestWithEmptyName() {
        Guest guest = GuestFactory.createGuest(102, "", "Doe", "1234567890", "jane.doe@example.com", "Unpaid");
        assertNull(guest, "Guest should not be created with an empty name");
    }

    @Test
    void testCreateGuestWithInvalidEmail() {
        Guest guest = GuestFactory.createGuest(103, "Jane", "Smith", "1234567890", "invalid-email", "Paid");
        assertNull(guest, "Guest should not be created with an invalid email");
    }

    @Test
    void testCreateGuestWithInvalidContactNumber() {
        Guest guest = GuestFactory.createGuest(104, "Alice", "Brown", "1234", "alice.brown@example.com", "Unpaid");
        assertNull(guest,"Guest should not be created with an invalid contact number");
    }
}
