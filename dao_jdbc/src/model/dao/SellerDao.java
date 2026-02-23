	package model.dao;
	
	import java.util.List;
	
	import model.entities.Department;
	import model.entities.Seller;
	
	public interface SellerDao extends DefaultDao<Seller> {
		List<Seller> findByDepartment(Department department);
	}
