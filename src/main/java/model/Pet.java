package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

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
    private String photoUrls;

    @SerializedName("tags")
    private Tag tag;

    @SerializedName("status")
    private String status;

}
