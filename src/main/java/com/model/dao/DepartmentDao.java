package com.model.dao;

import java.util.List;
import com.model.entities.Department;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Department obj);
    Department findById(Department obj);
    List<Department> findAll();
}
