package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: department insert ===");
        Department department = new Department(7, "IT");
        // departmentDao.insert(department);
        System.out.println("Inserted! New department ID: " + department.getId());

        System.out.println("\n=== Test 2: department update ===");
        department = departmentDao.findById(6);
        department.setName("Marketing");
        departmentDao.update(department);
        System.out.println("Updated! New department ID: " + department.getId());

        System.out.println("\n=== Test 3: department update ===");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 4: findAll =======");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 5: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = input.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        input.close();
    }

}

