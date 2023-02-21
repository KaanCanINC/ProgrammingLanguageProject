package kodlama.io.devs.odev.business.responses;

public class GetAllLanguagesResponse {

    private int id;
    private String name;

    public GetAllLanguagesResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public GetAllLanguagesResponse() {

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
