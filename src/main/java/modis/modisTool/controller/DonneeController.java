package modis.modisTool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import modis.modisTool.repository.DonneeRepository;

@Controller
@RequestMapping("/donnee")
public class DonneeController {
	
	@Autowired
	DonneeRepository donneeRepository;
	
	@GetMapping("/listdonnee")
	public ModelAndView list() {
		return new ModelAndView("donnee/listdonnee", "donnees", donneeRepository.findAll());
	}

}
