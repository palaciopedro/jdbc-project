package model.dao;

import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class DaoFactory {

	public static DefaultDao<Seller> createSellerDao() {
		return new SellerDaoJDBC();
	}
	
	public static DefaultDao<Department> createDepartmentDao(){
		return new DepartmentDaoJDBC();
	}

}
