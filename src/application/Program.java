package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao(); 
		System.out.println("Teste update");
		
		System.out.println("Informe o ID a ser deletado: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sellerdao.deleteByID(id);;
		System.out.println("Delete complete");
	
		}

}
