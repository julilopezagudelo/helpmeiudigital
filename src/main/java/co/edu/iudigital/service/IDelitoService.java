package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.DelitoDTO;

public interface IDelitoService {

	List<DelitoDTO> findAll();
	
	DelitoDTO findById(Long id);
	
	DelitoDTO save(DelitoDTO delitoDTO);
	
	void delete(Long id);
}
