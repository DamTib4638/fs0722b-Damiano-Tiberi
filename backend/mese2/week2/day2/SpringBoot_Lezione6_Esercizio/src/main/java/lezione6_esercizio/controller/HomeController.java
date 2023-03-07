package lezione6_esercizio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lezione6_esercizio.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService istruzioni;
	
	@GetMapping("/home")
	public ModelAndView formLingua() {
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	
	@PostMapping("/setLingua")
	public ModelAndView selezionaLingua(@RequestParam String lingua) {
		ModelAndView model = new ModelAndView("istruzioni");
		String s = istruzioni.check(lingua);
		model.addObject("lingua", s);
		return model;
	}

}
