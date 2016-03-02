package com.hibernate.mapping.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="PARKED_VEHICLE_DETAIL")
public class VehicleDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VEHCILE_ID")
	private int vehicleId;
	@Column(name="VECHILCE_NUMBER")
	private String vechicleNo;
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private UserDetail userDetail;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVechicleNo() {
		return vechicleNo;
	}
	public void setVechicleNo(String vechicleNo) {
		this.vechicleNo = vechicleNo;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}
