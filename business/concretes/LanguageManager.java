package kodlama.io.Devos.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devos.business.abstracts.LanguageService;
import kodlama.io.Devos.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devos.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    
    public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
    
    
    @Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}


	@Override
	public Language add(Language language) throws Exception {
		if(checkIfNameExist(language)) {
			throw new Exception("You can't rewrite the same language");
		}
		if(checkIfNameEmpty(language)) {
			throw new Exception("Name can't be empty.");
			
		}
		return languageRepository.add(language);
	}	

    @Override
	public void update(Language language) throws Exception {
		languageRepository.update(language);
		
	}


	@Override
	public Language getById(int id) throws Exception {
		return languageRepository.getById(id);
	}
	
    @Override
	public void delete(Language language) throws Exception {
		languageRepository.delete(language);
		
	}
	
	private boolean checkIfNameExist(Language language) {
		for (Language language1: this.getAll()) 
			if(language1.getName().equals(language.getName())) {
				
			}
		      
        return false;
	}
	
	private boolean checkIfNameEmpty(Language language) {
		
		return language.getName().isBlank();
	}
	
	
	

}
