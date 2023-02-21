package kodlama.io.devs.odev.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.odev.DataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.odev.business.abstracts.LanguageService;
import kodlama.io.devs.odev.business.requests.CreateLanguageRequests;
import kodlama.io.devs.odev.business.requests.DeleteLanguageRequests;
import kodlama.io.devs.odev.business.requests.UpdateLanguageRequests;
import kodlama.io.devs.odev.business.responses.GetAllLanguagesResponse;
import kodlama.io.devs.odev.business.responses.GetByIdResponses;
import kodlama.io.devs.odev.entities.concretes.ProgrammingLanguage;

@Service
public class LanguageManager implements LanguageService {
    private ProgrammingLanguageRepository languageRepository;

    @Autowired
    public LanguageManager(ProgrammingLanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguagesResponse> getAll() {
        languageRepository.findAll().stream().forEach(System.out::println);
        List<GetAllLanguagesResponse> getAllLangResponse = languageRepository.findAll().stream()
                .map(language -> {
                    GetAllLanguagesResponse getAllLanguagesResponse = new GetAllLanguagesResponse();
                    getAllLanguagesResponse.setId(language.getId());
                    getAllLanguagesResponse.setName(language.getName());

                    return getAllLanguagesResponse;
                })
                .collect(Collectors.toList());
        return getAllLangResponse;

    }

    @Override
    public GetByIdResponses getById(int id) {
        ProgrammingLanguage programmingLanguage = languageRepository.findById(id).get();
        GetByIdResponses getByIdResponses = new GetByIdResponses();
        getByIdResponses.setName(programmingLanguage.getName());
        return getByIdResponses;
    }

    @Override
    public void add(CreateLanguageRequests createLanguageRequests) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(createLanguageRequests.getName());
        this.languageRepository.save(programmingLanguage);
    }

    @Override
    public void delete(DeleteLanguageRequests deleteLanguageRequests) {
        languageRepository.deleteById(deleteLanguageRequests.getId());
    }

    @Override
    public void update(int id, UpdateLanguageRequests updateLanguageRequests) {
        if (!updateLanguageRequests.getName().isEmpty()) {
            ProgrammingLanguage programmingLanguage = languageRepository.findById(id).get();
            programmingLanguage.setName(updateLanguageRequests.getName());
            languageRepository.save(programmingLanguage);
        }

    }

}
