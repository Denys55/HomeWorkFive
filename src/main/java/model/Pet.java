package model;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Pet {

    @SerializedName("id")
    private Integer id;

    @SerializedName("category")
    private Category category;

    @SerializedName("name")
    private String name;

    @SerializedName("photoUrls")
    private List<String> photoUrls;

    @SerializedName("tags")
    private Tag tag;

    @SerializedName("status")
    private String status;

}
