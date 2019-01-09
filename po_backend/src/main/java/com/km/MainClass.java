package com.km;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.km.models.Cwiczenie;
import com.km.models.Klient;
import com.km.models.PlanKlienta;
import com.km.models.Posilek;
import com.km.models.Trener;
import com.km.repositories.KlientRepository;
import com.km.repositories.TrenerRepository;
import com.km.repositories.ZlecenieRepository;
import com.km.services.KlientService;
import com.km.services.TrenerService;


@Component
public class MainClass {
	
	@Autowired
	private TrenerRepository tR;
	
	@Autowired
	private TrenerService ts;
	
	@Autowired
	private KlientRepository kr;
	
	@Autowired
	private KlientService ks;
	
	@Autowired
	private ZlecenieRepository zr;
	
	@Autowired
	private ModelClassFactory mcf;
	
	   @PostConstruct
	    public void start()
	    {
	       Trener r1 = this.tR.save(mcf.trener1("Marek"));
	       Trener r2 = this.tR.save(mcf.trener1("Wiesław"));
	       this.kr.save(mcf.klient1());
       
	       ts.addNewPlan(1L, mcf.plan1());
	       
	       ks.askForNewPlan(3L, 1L);
	      
	       this.ts.savePlanToCustomer(3L, 1L, 4L);
	    }
	   
}
