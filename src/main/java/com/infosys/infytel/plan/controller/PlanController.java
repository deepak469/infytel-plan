package com.infosys.infytel.plan.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.plan.DTO.Plan;

@RestController
public class PlanController {
	
	@RequestMapping(value="/plan", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getPlan() {
		return "plan";
	}
	
	@RequestMapping(value="/myPlan", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Plan getMyPlan() {
		return new Plan(1, "plan A");
	}
	
	@RequestMapping("/planNumbers")
	public List<Long> getPlanNumbers(){
		System.out.println("==== get plan numbers ====");
		return Arrays.asList(1l,2L,3L,4L);
	}
	
	@RequestMapping("/plansSync")
	public List<Integer> getPlansSync(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(22,45,67);
	}
	
	@RequestMapping("/plansAsync")
	public Integer getPlansAsync(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 33;
	}

}
