package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.dao.DaoFactory;
import model.dao.DefaultDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Department obj = new Department(1, "Books");

		Seller seller = new Seller(1, "Carl", "carl@gmail.com", LocalDate.parse("12/02/1984", fmt), 2000.00, obj);

		DefaultDao<Seller> sellerDao = DaoFactory.createSellerDao();
		DefaultDao<Department> departmentDao = DaoFactory.createDepartmentDao();
 		
		System.out.println(seller);
	}

}
