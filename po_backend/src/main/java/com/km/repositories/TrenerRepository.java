package com.km.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.km.models.Trener;

@Repository
@Transactional
public interface TrenerRepository extends JpaRepository<Trener, Long> {

}
