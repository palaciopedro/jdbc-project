package model.dao;

import java.util.List;

public interface DefaultDao<T> {

	void insert(T o);
	void update(T o);
	void deleteById(T o, int id);
	T findById(T o, int id);
	List<T> findAll(T o);
}
