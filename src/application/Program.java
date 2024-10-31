package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		System.out.println("Funções Departamento DAO");
		
		Department d = new Department();
		d.setName("Eletrodomestics");
		depDao.insert(d);
		
		System.out.println("Insert Dep");
	
		}

}
