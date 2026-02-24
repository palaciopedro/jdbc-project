package application;

import java.sql.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller newSeller = new Seller(null, "Ronaldo", "ronaldo@gmail.com", new Date(108, 1, 16), 4000.0, new Department(2, null));
		
		sellerDao.insert(newSeller);
		
		System.out.println("Inserted! " + newSeller.getId());
	}
}
