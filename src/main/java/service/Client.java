package service;

import com.google.gson.Gson;
import lombok.SneakyThrows;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.stream.Collectors;

public class Client {

    private static String baseUrl = "https://petstore.swagger.io/v2/";
    static OkHttpClient client = new OkHttpClient();

    @SneakyThrows
    public static void getMethod(String url, Object obj){
        Request request = new Request.Builder()
                .url(baseUrl + url)
                .get()
                .build();

        Response response = client.newCall(request).execute();

        Gson gson = new Gson();
        Object o = gson.fromJson(response.body().charStream(), Class.class);
        System.out.println();
    }


}
