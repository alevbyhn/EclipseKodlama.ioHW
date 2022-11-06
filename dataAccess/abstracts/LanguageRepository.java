package kodlama.io.Devos.dataAccess.abstracts;

import java.util.List;


import kodlama.io.Devos.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
    public Language add(Language language);
	public void delete(Language language);
	void update(Language language);
	public Language getById(int id);
	
}
