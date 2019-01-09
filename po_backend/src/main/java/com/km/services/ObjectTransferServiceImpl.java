package com.km.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.km.modelDTO.KlientDTO;
import com.km.modelDTO.TrenerDTO;
import com.km.models.Klient;
import com.km.models.Trener;

@Service
public class ObjectTransferServiceImpl implements ObjectTransferService{

	@Override
	public List<TrenerDTO> transferAllTrainers(List<Trener> trenerList) {
		return trenerList.stream().map(trener -> new TrenerDTO(trener)).collect(Collectors.toList());
	}

	@Override
	public List<KlientDTO> transferAllKlient(List<Klient> klientList) {
		return klientList.stream().map(klient -> new KlientDTO(klient)).collect(Collectors.toList());
	}

}
