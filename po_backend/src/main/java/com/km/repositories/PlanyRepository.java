package com.km.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.km.models.PlanKlienta;

@Repository
@Transactional
public interface PlanyRepository extends JpaRepository<PlanKlienta, Long> {

	@Query("select pk from PlanKlienta pk where klient_id=?1 and trener_id = ?2")
	List<PlanKlienta> getCustomerPlan(long customer_id, long trainer_id);
	
	@Query("select pk from PlanKlienta pk where trener_id = ?1")
	List<PlanKlienta> getAllPlans(long trainer_id);
}
