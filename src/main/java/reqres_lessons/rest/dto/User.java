package reqres_lessons.rest.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "job",
        "id",
        "createdAt"
})

@Data
public class User {

    @JsonProperty("name")
    public String name;
    @JsonProperty("job")
    public String job;
    @JsonIgnore
    @JsonProperty("id")
    public String id;
    @JsonIgnore
    @JsonProperty("createdAt")
    public String createdAt;

}