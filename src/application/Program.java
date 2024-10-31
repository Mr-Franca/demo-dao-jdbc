package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		System.out.println("Funções Departamento DAO");

		List<Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d.getId());
			System.out.println(d.getName());
		}
	}

}
