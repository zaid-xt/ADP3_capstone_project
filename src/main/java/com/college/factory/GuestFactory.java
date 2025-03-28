/* GuestFactory.java
Guest Factory Class
Author: Zaid Theunissen (221084142)
Date: 26 March 2025
*/

package com.college.factory;

import com.college.domain.Guest;
import com.college.utilities.Helper;

public class GuestFactory {
    public static Guest createGuest(int guestID, String name, String surname, String contactNumber, String email, String paymentDetails) {
        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(surname) || Helper.isNullOrEmpty(paymentDetails)) {
            return null;
        }
        if (!Helper.isValidEmail(email)) {
            return null;
        }
        if (!Helper.isValidContactNumber(contactNumber)) {
            return null;
        }

        return new Guest.GuestBuilder()
                .setGuestID(guestID)
                .setName(name)
                .setSurname(surname)
                .setContactNumber(contactNumber)
                .setEmail(email)
                .setPaymentDetails(paymentDetails)
                .build();
    }
}
