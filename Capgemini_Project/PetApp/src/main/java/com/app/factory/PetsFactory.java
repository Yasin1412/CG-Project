package com.app.factory;

import com.app.test.*;
import com.app.dao.PetsDao;
import com.app.daoimpl.PetsDaoImpl;

public class PetsFactory {
	public static PetsDao getPetsDao() {
		return new PetsDaoImpl();
	}

}
