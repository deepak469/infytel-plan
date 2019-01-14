package com.infosys.infytel.plan.DTO;

public class Plan {
	
	private int planId;
	private String planName;
	
	public Plan(int planId, String planName) {
		super();
		this.planId = planId;
		this.planName = planName;
	}
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	

}
