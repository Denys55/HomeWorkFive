package service;

import model.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ClientForUser {

    // create user
    @POST("user")
    @Headers({"Content-Type: application/json"})
    Call<User> addUser(@Body User user);

    //get user by user name
    @GET("user/{username}")
    @Headers({"Content-Type: application/json"})
    Call<User> getUser(@Path("username") String userName);

    //create list users
    @POST("user/createWithList")
    @Headers({"Content-Type: application/json"})
    Call<User> createWithList(@Body List<User> users);

    @PUT("user/{username}")
    @Headers({"Content-Type: application/json"})
    Call<User> updateUser(@Body User user);

    @DELETE("user/{username}")
    @Headers({"Content-Type: application/json"})
    Call<User> deleteUser(@Body User user);




}
