package com.km.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.km.models.Klient;


@Repository
@Transactional
public interface KlientRepository extends JpaRepository<Klient, Long> {

	@Query("select z.klient_id from Zlecenie z where z.trener_id = ?1")
	List<Long> findTrainerCustomersId(long trener_id);
}