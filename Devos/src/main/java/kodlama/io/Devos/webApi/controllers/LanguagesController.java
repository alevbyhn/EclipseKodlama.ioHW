package kodlama.io.Devos.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devos.business.abstracts.LanguageService;
import kodlama.io.Devos.entities.concretes.Language;

@RestController 
@RequestMapping
public class LanguagesController {
	private LanguageService languageService;
    
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<Language> getAll(){
		return languageService.getAll();
	
	}
	
	@PostMapping("/add")
	public Language add(@RequestBody Language language) throws Exception {
		return languageService.add(language);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Language language) throws Exception {
		languageService.delete(language);
		
	}
	@PostMapping("/update")
	public void update(@RequestBody Language language) throws Exception{
		languageService.update(language);
	}
	@GetMapping("/getById")
	public Language getById(int id) throws Exception{
		return languageService.getById(id);
	}

}
