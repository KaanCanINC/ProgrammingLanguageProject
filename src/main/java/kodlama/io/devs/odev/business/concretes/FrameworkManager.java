package kodlama.io.devs.odev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.odev.DataAccess.abstracts.FrameworkRepository;
import kodlama.io.devs.odev.business.abstracts.FrameworkService;
import kodlama.io.devs.odev.business.requests.CreateFrameworkRequests;
import kodlama.io.devs.odev.business.responses.GetAllFrameworkResponse;
import kodlama.io.devs.odev.entities.concretes.Frameworks;

@Service
public class FrameworkManager implements FrameworkService {
    private FrameworkRepository frameworkRepository;

    @Autowired
    public FrameworkManager() {
        this.frameworkRepository = frameworkRepository;
    }

    public List<GetAllFrameworkResponse> getAll(){
        List<GetAllFrameworkResponse> getAllFramewResponses = frameworkRepository.findAll().stream()
        .map(framework -> {
            GetAllFrameworkResponse getAllFrameworkResponse;
        })
    
    }

    @Override
    public void add(CreateFrameworkRequests createFrameworkRequests) {
        Frameworks frameworks = new Frameworks();
        frameworks.setName()
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

    @Override
    public List<GetAllFrameworkResponse> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
