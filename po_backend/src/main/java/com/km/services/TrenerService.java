package com.km.services;

import java.util.List;

import com.km.models.Klient;
import com.km.models.PlanKlienta;

public interface TrenerService {
	
	void addNewPlan(long trainer_id, PlanKlienta planKlienta);
	List<Klient> getKlientList(long trainer_id);
	void savePlanToCustomer(long customer_id, long trainer_id, long plan_id);
	List<PlanKlienta> getAllPlans(long trainer_id);
}
