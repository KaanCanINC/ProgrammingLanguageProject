package kodlama.io.devs.odev.business.abstracts;

import java.util.List;

import kodlama.io.devs.odev.business.requests.CreateFrameworkRequests;
import kodlama.io.devs.odev.business.requests.DeleteFrameworkRequests;
import kodlama.io.devs.odev.business.requests.DeleteLanguageRequests;
import kodlama.io.devs.odev.business.requests.UpdateFrameworkRequests;
import kodlama.io.devs.odev.business.responses.GetAllFrameworkResponse;

public interface FrameworkService {
    List<GetAllFrameworkResponse> getAll();

    void add(CreateFrameworkRequests createFrameworkRequests);

    void delete(DeleteFrameworkRequests deleteFrameworkRequests);

    void update(int id, UpdateFrameworkRequests updateFrameworkRequests);
}
