package kodlama.io.devs.odev.business.requests;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateFrameworkRequests {
    private String name;
    private int pLanguageId;
}
