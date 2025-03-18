/*
File name:  _RepositoryInterface.java
Author:     Ammaar
Started:    12.03.25
Updated:    18.03.25
*/


package com.college.repository;

public interface _RepositoryInterface<ClassType, Id> {
    public ClassType create(ClassType obj);

    public ClassType read(Id id);

    public ClassType update(ClassType obj);

//    public ClassType delete(Id id);
    public boolean delete(Id id);

    // public ClassType getAll();
}
