package kodlama.io.devs.odev.business.responses;

public class GetAllFrameworkResponse {
    private int id;
    private String name;
    // private List<Frameworks> frameworks;

    public GetAllFrameworkResponse() {

    }

    public GetAllFrameworkResponse(int id, String name) {
        this.id = id;
        this.name = name;
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
}
