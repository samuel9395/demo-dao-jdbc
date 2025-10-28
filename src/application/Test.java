package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Test {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("=== Test 1: department insert ===");
//        Department department = new Department(7, "IT");
//        departmentDao.insert(department);
//        System.out.println("Inserted! New department ID: " + department.getId());

        System.out.println("\n=== Test 2: department update ===");
        Department department = departmentDao.findById(6);
        department.setName("Marketing");
        departmentDao.update(department);
        System.out.println("Updated! New department ID: " + department.getId());
    }

}

