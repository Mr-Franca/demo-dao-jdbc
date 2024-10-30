package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteByID(Integer id);
	Seller findById(Integer id);
	List<Department> findAll();
}
