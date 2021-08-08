package service;

import model.Pet;
import model.User;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClientForUser {
    @POST("user")
    @Headers({"Content-Type: application/json"})
    Call<User> addUser(@Body User user);

    @GET("/user/{username}")
    @Headers({"Content-Type: application/json"})
    Call<User> getUser(@Path("username") String userName);

}
