package kodlama.io.devs.odev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.odev.DataAccess.abstracts.FrameworkRepository;
import kodlama.io.devs.odev.DataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.odev.business.abstracts.FrameworkService;
import kodlama.io.devs.odev.business.requests.CreateFrameworkRequests;
import kodlama.io.devs.odev.business.requests.DeleteFrameworkRequests;
import kodlama.io.devs.odev.business.requests.UpdateFrameworkRequests;
import kodlama.io.devs.odev.business.responses.GetAllFrameworkResponse;
import kodlama.io.devs.odev.entities.concretes.Frameworks;
import kodlama.io.devs.odev.entities.concretes.ProgrammingLanguage;

@Service
public class FrameworkManager implements FrameworkService {
    private FrameworkRepository frameworkRepository;
    private ProgrammingLanguageRepository languageRepository;

    @Autowired
    public FrameworkManager(FrameworkRepository frameworkRepository, ProgrammingLanguageRepository languageRepository) {
        this.frameworkRepository = frameworkRepository;
        this.languageRepository = languageRepository;
    }

    // @Override
    // public List<GetAllFrameworkResponse> getAll() {
    // List<GetAllFrameworkResponse> getAllFramewResponses =
    // frameworkRepository.findAll().stream()
    // .map(framework -> {
    // GetAllFrameworkResponse getAllFrameworkResponse;
    // // Programlama dilinin alt kategorisi olarak ekleme kismi cokuyor
    // // Tahminimce

    // });
    // return null;
    // }

    // @Override
    // public void add(CreateFrameworkRequests createFrameworkRequests) {
    // Frameworks frameworks = new Frameworks();
    // frameworks.setName(createFrameworkRequests.getName());
    // this.frameworkRepository.save(frameworks);
    // }

    @Override
    public List<GetAllFrameworkResponse> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(CreateFrameworkRequests createFrameworkRequests) {
        Frameworks frameworks = new Frameworks();
        ProgrammingLanguage programmingLanguage = languageRepository.findById(createFrameworkRequests.getPLanguageId())
                .get();
        frameworks.setName(createFrameworkRequests.getName());
        frameworks.setProgrammingLanguage(programmingLanguage);
        frameworkRepository.save(frameworks);
    }

    @Override
    public void delete(DeleteFrameworkRequests deleteFrameworkRequests) {
        frameworkRepository.deleteById(deleteFrameworkRequests.getId());
    }

    @Override
    public void update(int id, UpdateFrameworkRequests updateFrameworkRequests) {
        Frameworks frameworks = new Frameworks();
        ProgrammingLanguage programmingLanguage = languageRepository.findById(updateFrameworkRequests.getPLanguageId())
                .get();
        frameworks.setName(updateFrameworkRequests.getName());
        frameworks.setProgrammingLanguage(programmingLanguage);
        frameworkRepository.save(frameworks);
    }
}
