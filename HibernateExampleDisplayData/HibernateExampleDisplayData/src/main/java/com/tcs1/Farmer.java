package com.tcs1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Farmer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int FarmerId;
	String FarmerName;
	String FarmerMob;
	String FarmerSonName;
	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Farmer(int farmerId, String farmerName, String farmerMob, String farmerSonName) {
		super();
		FarmerId = farmerId;
		FarmerName = farmerName;
		FarmerMob = farmerMob;
		FarmerSonName = farmerSonName;
	}
	public Farmer( String farmerName, String farmerMob, String farmerSonName) {
		super();
	
		FarmerName = farmerName;
		FarmerMob = farmerMob;
		FarmerSonName = farmerSonName;
	}
	public int getFarmerId() {
		return FarmerId;
	}
	public void setFarmerId(int farmerId) {
		FarmerId = farmerId;
	}
	public String getFarmerName() {
		return FarmerName;
	}
	public void setFarmerName(String farmnerName) {
		FarmerName = farmnerName;
	}
	public String getFarmerMob() {
		return FarmerMob;
	}
	public void setFarmerMob(String farmerMob) {
		FarmerMob = farmerMob;
	}
	public String getFarmerSonName() {
		return FarmerSonName;
	}
	public void setFarmerSonName(String farmerSonName) {
		FarmerSonName = farmerSonName;
	}
	@Override
	public String toString() {
		return "Farmer [FarmerId=" + FarmerId + ", FarmnerName=" + FarmerName + ", FarmerMob=" + FarmerMob
				+ ", FarmerSonName=" + FarmerSonName + "]";
	}
	

}
