
package com.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Pets_details")
public class Pets {
	@Id
	private int petId;
	private String petName;
	private String petBreede;
	private String petFood;
	private double petPrice;

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetBreede() {
		return petBreede;
	}

	public void setPetBreede(String petBreede) {
		this.petBreede = petBreede;
	}

	public String getPetFood() {
		return petFood;
	}

	public void setPetFood(String petFood) {
		this.petFood = petFood;
	}

	public double getPetPrice() {
		return petPrice;
	}

	public void setPetPrice(double petPrice) {
		this.petPrice = petPrice;
	}

	@Override
	public String toString() {
		return "Pets [petId=" + petId + ", petName=" + petName + ", petBreede=" + petBreede + ", petFood=" + petFood
				+ ", petPrice=" + petPrice + "]";
	}

	public Pets(int petId, String petName, String petBreede, String petFood, double petPrice) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petBreede = petBreede;
		this.petFood = petFood;
		this.petPrice = petPrice;
	}

	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}

}
