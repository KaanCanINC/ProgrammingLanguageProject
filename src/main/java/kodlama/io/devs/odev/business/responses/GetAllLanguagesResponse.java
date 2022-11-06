package kodlama.io.devs.odev.business.responses;



import java.util.List;

import kodlama.io.devs.odev.entities.concretes.Frameworks;



public class GetAllLanguagesResponse {
    
    private int id;
    private String name;
    private List<Frameworks> frameworks;

    public GetAllLanguagesResponse(int id, String name, List<Frameworks> frameworks) {
        this.id = id;
        this.name = name;
        this.frameworks = frameworks;
    }

    public GetAllLanguagesResponse(){
        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Frameworks> getFrameworks() {
        return frameworks;
    }
    public void setFrameworks(List<Frameworks> frameworks) {
        this.frameworks = frameworks;
    }


}
