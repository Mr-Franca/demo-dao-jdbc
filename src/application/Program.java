package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao(); 
		Department d = new Department();
		d.setId(2);
		System.out.println("TESTE INSERT");
		
		Seller newSeller = new Seller(null, "Greg","Greg@gmail.com",new Date(), 4000.0,d);
		sellerdao.insert(newSeller);
		System.out.println("Inserted! New id = "+newSeller.getId());
		}

}
