package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

public class Category {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;
}
