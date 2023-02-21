package kodlama.io.devs.odev.business.abstracts;

import java.util.List;

import kodlama.io.devs.odev.business.requests.CreateLanguageRequests;
import kodlama.io.devs.odev.business.requests.DeleteLanguageRequests;
import kodlama.io.devs.odev.business.requests.UpdateLanguageRequests;
import kodlama.io.devs.odev.business.responses.GetAllLanguagesResponse;
import kodlama.io.devs.odev.business.responses.GetByIdResponses;

public interface LanguageService {
    List<GetAllLanguagesResponse> getAll();

    GetByIdResponses getById(int id);

    void add(CreateLanguageRequests createLanguageRequests);

    void delete(DeleteLanguageRequests deleteLanguageRequests);

    void update(int id, UpdateLanguageRequests updateLanguageRequests);
}
