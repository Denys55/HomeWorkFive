import lombok.SneakyThrows;
import model.Category;
import model.Pet;
import model.User;
import retrofit2.Call;
import retrofit2.converter.gson.GsonConverterFactory;
import service.ClientForPet;
import service.ClientForUser;
import service.Config;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = new User(1,"55Denis", "Denis", "Cherep",
                "denis@mail.ru", "3451", "0987643212", 1);

        ClientForUser clientUser = Config.createClient(ClientForUser.class);
        User result = Config.execute(clientUser.addUser(user));
        System.out.println(result);

    }



}
