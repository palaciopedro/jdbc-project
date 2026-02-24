package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(1);
		seller.setName("Martha");
		
		sellerDao.update(seller);
		
		System.out.println(seller);
		
		sellerDao.deleteById(8);
	}
}
