/*  IHousekeeperRepository.java
    IHousekeeper Repository
    Author: Muaath Slamong (230074138)
    Date: 23 March 2025
*/
package com.college.repository;

import com.college.domain.Housekeeper;
import java.util.ArrayList;

public interface IHousekeeperRepository extends IRepository<Housekeeper, Integer> {
    ArrayList<Housekeeper> getAll();
}
