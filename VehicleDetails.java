package com.lti.vehicleloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_details")
public class VehicleDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="vehicle_seq", allocationSize=1)
	@Column(name="VEHICLE_ID")
	private int vehicleId;

	@Column(name="CAR_MAKE")
	private String carMake;

	@Column(name="CAR_MODEL")
	private String carModel;

	@Column(name="EX_SHOWROOM_PRICE")
	private Double ex_Showroom_Price;

	@Column(name="ON_ROAD_PRICE")
	private Double on_Road_Price;

	@OneToOne
	@JoinColumn(name="USER_ID")
	private UserPersonalDetails userPersonalDetails;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Double getEx_Showroom_Price() {
		return ex_Showroom_Price;
	}

	public void setEx_Showroom_Price(Double ex_Showroom_Price) {
		this.ex_Showroom_Price = ex_Showroom_Price;
	}

	public Double getOn_Road_Price() {
		return on_Road_Price;
	}

	public void setOn_Road_Price(Double on_Road_Price) {
		this.on_Road_Price = on_Road_Price;
	}

	public UserPersonalDetails getUserPersonalDetails() {
		return userPersonalDetails;
	}

	public void setUserPersonalDetails(UserPersonalDetails userPersonalDetails) {
		this.userPersonalDetails = userPersonalDetails;
	}
	
	
}
