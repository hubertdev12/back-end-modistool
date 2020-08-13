package modis.modisTool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modis.modisTool.repository.DonneeRepository;

@Service
public class DonneeService {

	@Autowired
	private DonneeRepository donneeRepository;
	
	
}
