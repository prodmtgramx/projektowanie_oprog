package com.km.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.km.models.Klient;
import com.km.models.Ocena;
import com.km.models.PlanKlienta;
import com.km.models.Trener;
import com.km.models.Zlecenie;
import com.km.repositories.KlientRepository;
import com.km.repositories.OcenaRespository;
import com.km.repositories.PlanyRepository;
import com.km.repositories.TrenerRepository;
import com.km.repositories.ZlecenieRepository;

@Service
@Transactional
public class KlientServiceImpl implements KlientService {
	
	@Autowired
	private KlientRepository klientRepository;
	
	@Autowired
	private ZlecenieRepository zlecenieRepository;
	
	@Autowired
	private TrenerRepository trenerRepository;
	
	@Autowired
	private PlanyRepository planyRepository;
	
	@Autowired
	private OcenaRespository ocenaRespository;

	@Override
	public List<Trener> getCustomerTreners(long customer_id) {
		/*Optional<Klient> k = klientRepository.findById(customer_id);
		if (k.isPresent()) {
			Klient k1 = k.get();
			List<Zlecenie> zk = k1.getZlecenia();
			List<Long> trainers_id = new ArrayList<>();
			for (Zlecenie z1 : zk){
				if(z1.isAccepted()){
					trainers_id.add(z1.getTrener_id());
				}
			}*/
			return this.trenerRepository.findAllById(this.zlecenieRepository.findCustomerTrainersId(customer_id));
		//}
		//return null;
	}

	@Override
	public void askForNewPlan(long customer_id, long trainer_id) {
		Zlecenie z1 = this.zlecenieRepository.save(new Zlecenie());
		Optional<Trener> t = trenerRepository.findById(trainer_id);
		if (t.isPresent()) {
			Trener t1 = t.get();
			List<Zlecenie> zt = t1.getZlecenia();
			if(zt == null){
				zt = new ArrayList<>();
			}
			zt.add(z1);
			t1.setZlecenia(zt);
			
			Optional<Klient> k = klientRepository.findById(customer_id);
			if (k.isPresent()) {
				Klient k1 = k.get();
				List<Zlecenie> zk = k1.getZlecenia();
				if(zk == null){
					zk = new ArrayList<>();
				}
				zk.add(z1);
				k1.setZlecenia(zk);
				
				this.klientRepository.save(k1);
				this.trenerRepository.save(t1);
				
				
			}
		}
		
	}

	@Override
	public PlanKlienta getCustomerPlan(long customer_id, long trainer_id) {
		List<PlanKlienta> plk = this.planyRepository.getCustomerPlan(customer_id, trainer_id);
		return plk.get(plk.size()-1);
	}

	@Override
	public List<Trener> getAllTreners(long customer_id) {
		List<Trener> tl = this.trenerRepository.findAll();
		tl.removeAll(this.getCustomerTreners(customer_id));
		return tl;
	}

	@Override
	public void rateTrainer(Ocena ocena, long trainer_id) {
		ocena.setTrener_id(trainer_id);
		this.ocenaRespository.save(ocena);
	}

}
