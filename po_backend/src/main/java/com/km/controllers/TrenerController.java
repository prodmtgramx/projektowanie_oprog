package com.km.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.km.modelDTO.KlientDTO;
import com.km.modelDTO.PlanKlientaDTO;
import com.km.models.PlanKlienta;
import com.km.services.ObjectTransferService;
import com.km.services.TrenerService;

@RestController
public class TrenerController {

	private long trener_id = 1L;
	@Autowired
	private TrenerService trenerService;
	@Autowired
	private ObjectTransferService ots;
	
	
	@PostMapping("/trainer/plan/add")
	public ResponseEntity<Boolean> addNewPlan(@RequestBody PlanKlientaDTO planKlienta){
		this.trenerService.addNewPlan(trener_id, new PlanKlienta(planKlienta));
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}
	
	@GetMapping("/trainer/customers/all")
	public ResponseEntity<List<KlientDTO>> getAllCustomers(){
		return new ResponseEntity<List<KlientDTO>>(ots.transferAllKlient(this.trenerService.getKlientList(trener_id)), HttpStatus.OK);
	}
	
	@GetMapping("/trainer/customer/planbound")
	public ResponseEntity<Boolean> boundPlanToCustomer(@RequestParam(value="plan")long plan_id, @RequestParam(value="klient")long klient_id){
		this.trenerService.savePlanToCustomer(klient_id, trener_id, plan_id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	@GetMapping("/trainer/plan/all")
	public ResponseEntity<List<PlanKlienta>> getAllPlans(){
		return new ResponseEntity<List<PlanKlienta>>(this.trenerService.getAllPlans(trener_id), HttpStatus.OK);
	}
	
	
}
