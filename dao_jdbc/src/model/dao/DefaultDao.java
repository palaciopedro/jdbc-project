package model.dao;

import java.util.List;

public interface DefaultDao<T> {

	void insert(T o);
	void update();
	void deleteById(int id);
	T findById(int id);
	List<T> findAll();
}
