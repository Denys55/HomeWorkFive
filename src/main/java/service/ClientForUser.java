package service;

import model.Pet;
import model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ClientForUser {
    @POST("user")
    @Headers({"Content-Type: application/json"})
    Call<User> addUser(@Body User user);
}
