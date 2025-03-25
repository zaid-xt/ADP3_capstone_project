package com.college.utilities;

public class Helper {
    // Generate a Guest ID based on some logic (for example, generating a random number)
    public static Integer generateGuestID() {
        // This could be replaced with a more complex logic, for now it returns a random number
        return (int)(Math.random() * 10000);  // Generating a random ID between 0 and 9999
    }

    /**
     * Check if a string is null or empty
     * @param s
     * @return boolean
     */
    public static boolean isNullOrEmpty(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        return false;
    }

    // Validate email format (without regex)
    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) {
            return false;
        }
        // Basic email validation: check if there's an '@' and a '.' after it
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.', atIndex);

        // Ensure '@' exists, and there's a '.' after '@'
        return (atIndex > 0 && dotIndex > atIndex);
    }

    // Validate contact number (ensuring it's a 10-digit number)
    public static boolean isValidContactNumber(String contactNumber) {
        if (isNullOrEmpty(contactNumber)) {
            return false;
        }
        // Ensure that the contact number is a 10-digit number
        return contactNumber.matches("\\d{10}");
    }
}
