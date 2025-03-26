/* IGuestRepository.java
Guest Repository Interface
Author: Zaid Theunissen (221084142)
Date: 26 March 2025
*/

package com.college.repository;

import com.college.domain.Guest;
import java.util.List;

public interface IGuestRepository extends IRepository<Guest, Integer> {
    List<Guest> findByName(String name);
}