package com.college.repository;

import com.college.domain.Housekeeper;
import java.util.ArrayList;

public interface IHousekeeperRepository extends IRepository<Housekeeper, Integer> {
    ArrayList<Housekeeper> getAll();
}
