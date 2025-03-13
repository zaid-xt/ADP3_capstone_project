package com.college.repository;

public interface _RepoInterface<ClassType, Id> {
    public ClassType create(ClassType obj);

    public ClassType read(Id id);

    public ClassType update(ClassType obj);

    public ClassType delete(Id id);

    public ClassType getAll();
}
