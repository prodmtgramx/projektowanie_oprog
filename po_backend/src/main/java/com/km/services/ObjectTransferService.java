package com.km.services;

import java.util.List;

import com.km.modelDTO.KlientDTO;
import com.km.modelDTO.TrenerDTO;
import com.km.models.Klient;
import com.km.models.Trener;

public interface ObjectTransferService {

	List<TrenerDTO> transferAllTrainers(List<Trener> trenerList);
	List<KlientDTO> transferAllKlient(List<Klient> klientList);
}
