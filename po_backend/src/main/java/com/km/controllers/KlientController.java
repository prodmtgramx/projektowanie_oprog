package com.km.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.km.modelDTO.OcenaDTO;
import com.km.modelDTO.TrenerDTO;
import com.km.models.Ocena;
import com.km.models.PlanKlienta;
import com.km.models.Trener;
import com.km.services.KlientService;
import com.km.services.ObjectTransferService;

@RestController
public class KlientController {
	
	private long customer_id = 3;
	@Autowired
	private KlientService klientService;
	@Autowired
	private ObjectTransferService ots;
	
	/**
	 * Metoda zwraca w postaci JSON listę obiektów trenerów.
	 * @return List<TrenerDTO>
	 */
	@GetMapping("/customer/trener/all")
	public ResponseEntity<List<TrenerDTO>> getAllCustomerTreners(){
		return new ResponseEntity<List<TrenerDTO>>(ots.transferAllTrainers(this.klientService.getCustomerTreners(customer_id)), HttpStatus.OK);
	}
	
	
	/**
	 * Metoda dodaje nowe zlecenie od klienta trenerowi.
	 * @param id
	 * @return Boolean
	 */
	@GetMapping("/customer/trener/ask/{id}")
	public ResponseEntity<Boolean> askForCooperation(@PathVariable("id") Long id){
		this.klientService.askForNewPlan(customer_id, id);
		return new ResponseEntity<>(true, HttpStatus.ACCEPTED);
	}
	
	/**
	 * metoda zwraca w postaci JSON plan klienta - oraz wybranego trenera
	 * @param id
	 * @return PlanKlienta
	 */
	@GetMapping("/customer/trener/plan/{id}")
	public ResponseEntity<PlanKlienta> takePlan(@PathVariable("id") Long id){
		System.out.println(id);
		return new ResponseEntity<>(this.klientService.getCustomerPlan(customer_id, id), HttpStatus.ACCEPTED);
	}
	
	/**
	 * Metoda zwraca wszystkich trenerów z którymi klient moze podjac wspoprace
	 * @return
	 */
	@GetMapping("/trener/all")
	public ResponseEntity<List<TrenerDTO>> getAllAvaliableTreners(){
		return new ResponseEntity<List<TrenerDTO>>(ots.transferAllTrainers(this.klientService.getAllTreners(customer_id)), HttpStatus.OK);
	}
	
	/**
	 *  metoda dodae trenerowi nową ocene
	 * @param ocena
	 * @param id
	 * @return
	 */
	@PostMapping("/rate/trainer/{id}")
	public ResponseEntity<Boolean> rateTrainer(@RequestBody OcenaDTO ocena,@PathVariable("id") Long id){
		Ocena o = new Ocena();
		o.setComment(ocena.getComment());
		o.setValue(ocena.getValue());
		o.setKlient_id(this.customer_id);
		this.klientService.rateTrainer(o, id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

}
