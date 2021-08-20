package service;

import model.Pet;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClientForPet {

    //create pet
    @POST("pet")
    @Headers({"Content-Type: application/json"})
    Call<Pet> addPet(@Body Pet pet);

    //get pet by id
    @GET("pet/{petId}")
    @Headers({"Content-Type: application/json"})
    Call<Pet> getPet(@Path("petId") Integer id);



}
