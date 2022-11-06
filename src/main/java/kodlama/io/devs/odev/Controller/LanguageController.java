package kodlama.io.devs.odev.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.odev.business.abstracts.LanguageService;
import kodlama.io.devs.odev.business.requests.CreateLanguageRequests;
import kodlama.io.devs.odev.business.responses.GetAllLanguagesResponse;

@RestController
@RequestMapping(path = "/api/languages")
public class LanguageController {
    private LanguageService languageService;
    
    @Autowired
    public LanguageController(LanguageService languageService){
        this.languageService = languageService;
    }

    @GetMapping(path = "/getall")
    public List<GetAllLanguagesResponse> getAll(){
        return languageService.getAll();
    }
    
    @PostMapping("/add")
    public void add(CreateLanguageRequests createLanguageRequests){
        this.languageService.add(createLanguageRequests);
    }

}
