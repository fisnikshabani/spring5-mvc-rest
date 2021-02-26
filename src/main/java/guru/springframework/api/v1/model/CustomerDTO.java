package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerDTO {
    private String firstName;
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;
}
