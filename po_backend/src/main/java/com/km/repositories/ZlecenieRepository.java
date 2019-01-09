package com.km.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.km.models.Zlecenie;

@Repository
@Transactional
public interface ZlecenieRepository extends JpaRepository<Zlecenie, Long> {
	
	@Query("select z.trener_id from Zlecenie z where z.klient_id = ?1")
	List<Long> findCustomerTrainersId(long customer_id);

}
