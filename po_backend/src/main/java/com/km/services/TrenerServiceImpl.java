package com.km.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.km.models.Klient;
import com.km.models.PlanKlienta;
import com.km.models.Trener;
import com.km.models.Zlecenie;
import com.km.repositories.KlientRepository;
import com.km.repositories.PlanyRepository;
import com.km.repositories.TrenerRepository;

@Service
@Transactional 
public class TrenerServiceImpl implements TrenerService{
	
	@Autowired
	private TrenerRepository trenerRepository;
	
	@Autowired
	private PlanyRepository planyRepository;
	
	@Autowired
	private KlientRepository klientRepository;
	
	@Override
	public void addNewPlan(long trainer_id, PlanKlienta planKlienta) {
		Optional<Trener> t = trenerRepository.findById(trainer_id);
		if (t.isPresent()) {
			Trener t1 = t.get();
			List<PlanKlienta> lpk = t1.getPlany();
			lpk.add(planKlienta);
			t1.setPlany(lpk);
			trenerRepository.save(t1);
		}
		
	}

	@Override
	public List<Klient> getKlientList(long trainer_id) {
		return this.klientRepository.findAllById(klientRepository.findTrainerCustomersId(trainer_id));
	}

	@Override
	public void savePlanToCustomer(long customer_id, long trainer_id, long plan_id) {
		Optional<PlanKlienta> pk = this.planyRepository.findById(plan_id);
		if (pk.isPresent()){
			PlanKlienta pk1 = pk.get();
			Optional<Klient> k = this.klientRepository.findById(customer_id);
			if(k.isPresent()){
				Klient k1 = k.get();
				List<PlanKlienta> pkk = k1.getPlany();
				if(pkk == null){
					pkk = new ArrayList<>();
				}
				pkk.add(pk1);
				k1.setPlany(pkk);
				if(akceptacjaZlecenia(customer_id, trainer_id)){
					this.klientRepository.save(k1);
				}
				//this.klientRepository.save(k1);
			}
		}
		
	}
	
	private boolean akceptacjaZlecenia(long customer_id, long trainer_id) {
		Optional<Trener> t = trenerRepository.findById(trainer_id);
		Optional<Klient> k = klientRepository.findById(customer_id);
		if (t.isPresent() && k.isPresent()) {
			Trener t1 = t.get();
			Klient k1 = k.get();
			List<Zlecenie> zl =t1.getZlecenia();
			List<Zlecenie> zlk = k1.getZlecenia();
			
			for(Zlecenie z : zl){
				for(Zlecenie zk : zlk){
					if(z.getId() == zk.getId()){
						z.setAccepted(true);
						trenerRepository.save(t1);
						klientRepository.save(k1);
						return true;
					}
				}
			}
			
		}
		return false;
		
	}

	@Override
	public List<PlanKlienta> getAllPlans(long trainer_id) {
		return this.planyRepository.getAllPlans(trainer_id);
	}

}
