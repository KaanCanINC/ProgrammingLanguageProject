package kodlama.io.devs.odev.business.abstracts;

import java.util.List;

import kodlama.io.devs.odev.business.requests.CreateLanguageRequests;
import kodlama.io.devs.odev.business.responses.GetAllLanguagesResponse;


public interface LanguageService {
    List<GetAllLanguagesResponse> getAll();
    void add(CreateLanguageRequests createLanguageRequests);
    
}
