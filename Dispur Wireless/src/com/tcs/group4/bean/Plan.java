package com.tcs.group4.bean;

public class Plan {
	
	private String planName;
	private boolean typeOfPlan;
	private float tarrif;
	private int validity;
	private String rental;
	
	
	public Plan() {

	}
	
	
	
	public Plan(String planName, boolean typeOfPlan, float tarrif, int validity, String rental) {
		this.planName = planName;
		this.typeOfPlan = typeOfPlan;
		this.tarrif = tarrif;
		this.validity = validity;
		this.rental = rental;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public boolean isTypeOfPlan() {
		return typeOfPlan;
	}
	public void setTypeOfPlan(boolean typeOfPlan) {
		this.typeOfPlan = typeOfPlan;
	}
	public float getTarrif() {
		return tarrif;
	}
	public void setTarrif(float tarrif) {
		this.tarrif = tarrif;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public String getRental() {
		return rental;
	}
	public void setRental(String rental) {
		this.rental = rental;
	}
	
	
	
	

}
