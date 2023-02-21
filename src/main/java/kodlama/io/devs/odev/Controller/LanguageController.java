package kodlama.io.devs.odev.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.odev.business.abstracts.LanguageService;
import kodlama.io.devs.odev.business.requests.CreateLanguageRequests;
import kodlama.io.devs.odev.business.requests.DeleteLanguageRequests;
import kodlama.io.devs.odev.business.requests.UpdateLanguageRequests;
import kodlama.io.devs.odev.business.responses.GetAllLanguagesResponse;
import kodlama.io.devs.odev.business.responses.GetByIdResponses;
import kodlama.io.devs.odev.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping(path = "/api/languages")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping(path = "/getall")
    public List<GetAllLanguagesResponse> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequests createLanguageRequests) {
        this.languageService.add(createLanguageRequests);
    }

    @GetMapping("/getById")
    public GetByIdResponses getAll(@RequestParam int id) {
        return this.languageService.getById(id);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequests deleteLanguageRequests) {
        this.languageService.delete(deleteLanguageRequests);
    }

    @PutMapping("/update")
    public void update(int id, UpdateLanguageRequests updateLanguageRequests) {
        this.languageService.update(id, updateLanguageRequests);
    }
}
