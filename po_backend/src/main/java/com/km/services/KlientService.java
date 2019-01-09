package com.km.services;

import java.util.List;

import com.km.models.Ocena;
import com.km.models.PlanKlienta;
import com.km.models.Trener;

public interface KlientService {

	List<Trener> getCustomerTreners(long customer_id);
	void askForNewPlan(long customer_id, long trainer_id);
	PlanKlienta getCustomerPlan(long customer_id, long trainer_id);
	List<Trener> getAllTreners(long customer_id);
	void rateTrainer(Ocena ocena, long trainer_id);
}
