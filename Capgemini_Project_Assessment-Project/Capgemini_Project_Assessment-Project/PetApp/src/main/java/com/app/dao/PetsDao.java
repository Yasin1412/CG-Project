package com.app.dao;

import java.util.List;

import com.app.model.Pets;

public interface PetsDao {

	int updateData(Pets pt);

	int insertData(Pets pt);

	int deleteData(int id);

	List<Pets> listPets();

	List<Pets> getPets(int id);

}
