package kodlama.io.devs.odev.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.odev.business.abstracts.FrameworkService;
import kodlama.io.devs.odev.business.requests.CreateFrameworkRequests;
import kodlama.io.devs.odev.business.requests.DeleteFrameworkRequests;
import kodlama.io.devs.odev.business.requests.UpdateFrameworkRequests;
import kodlama.io.devs.odev.business.responses.GetAllFrameworkResponse;

@RestController
@RequestMapping("/api/framework")
public class FrameworkController {
    private FrameworkService frameworkService;

    public FrameworkController(FrameworkService frameworkService) {
        this.frameworkService = frameworkService;
    }

    @GetMapping("/getAll")
    public List<GetAllFrameworkResponse> getAll() {
        return frameworkService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateFrameworkRequests createFrameworkRequests) {
        this.frameworkService.add(createFrameworkRequests);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteFrameworkRequests deleteFrameworkRequests) {
        this.frameworkService.delete(deleteFrameworkRequests);
    }

    @PutMapping("/update")
    public void update(int id, UpdateFrameworkRequests updateFrameworkRequests) {
        this.frameworkService.update(id, updateFrameworkRequests);
    }

}
