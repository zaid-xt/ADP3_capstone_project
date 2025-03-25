package com.college.repository;

import com.college.domain.Guest;
import java.util.List;

public interface IGuestRepository extends IRepository<Guest, Integer> {
    List<Guest> findByName(String name);
}