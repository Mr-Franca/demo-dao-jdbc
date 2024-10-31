package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		System.out.println("Funções Departamento DAO");
		
		Department d = new Department();
		d.setId(7);
		depDao.deleteByID(d.getId());
		
		System.out.println("Delete Dep");
	
		}

}
