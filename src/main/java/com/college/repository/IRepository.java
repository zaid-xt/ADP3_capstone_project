/*
File name:  IRepository.java (MAIN Interface)
Author:     Ammaar
Started:    12.03.25
Updated:    18.03.25
*/


package com.college.repository;

public interface IRepository<ClassType, Id> {
    ClassType create(ClassType obj);

    ClassType read(Id id);

    ClassType update(ClassType obj);

    boolean delete(Id id);
}
