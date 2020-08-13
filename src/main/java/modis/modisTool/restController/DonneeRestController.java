package modis.modisTool.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modis.modisTool.model.Donnee;
import modis.modisTool.repository.DonneeRepository;

@RestController
@RequestMapping("/rest/donnee")
@CrossOrigin(origins= {"*"})
public class DonneeRestController {
	
	@Autowired
	private DonneeRepository donneeRepository;
	
	public ResponseEntity<List<Donnee>> list(){
		return new ResponseEntity<List<Donnee>>(donneeRepository.findAll(),HttpStatus.OK);
	}

}
