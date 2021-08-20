
import model.Category;
import model.Pet;
import model.Tag;
import model.User;
import service.ClientForPet;
import service.ClientForUser;
import service.Config;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = new User(1,"55Denis", "Denis", "Cherep",
                "denis@mail.ru", "3451", "0987643212", 1);

        User user1 = new User(2,"LenOk", "Elena", "Sidorova",
                "elena@mail.ru", "1111", "0959897654", 2);

        User user2 = new User(3,"Anton33", "Anton", "Ivanov",
                "ivanov@mail.ru", "0000", "0973452121", 3);

        User user3 = new User(4,"PetrIv", "Petr", "Voly",
                "voly@mail.ru", "9090", "0983218282", 4);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        List<String> list = new ArrayList<>();
        list.add("/Users/deniscerep/Downloads/dog image.jpg");


        Pet pet = Pet.builder()
                    .id(1)
                    .category(Category.builder()
                            .id(1)
                            .name("Dogs")
                            .build())
                    .name("Buks")
                    .photoUrls(list)
                    .status("pending")
                    .tag(Tag.builder()
                            .id(1)
                            .name("true")
                            .build())
                    .build();


        //ClientForUser clientUser = Config.createClient(ClientForUser.class);
        ClientForPet clientPet = Config.createClient(ClientForPet.class);

        //create user
        //User result = Config.execute(clientUser.addUser(user));

        //get user by user name
        //User getUser = Config.execute(clientUser.getUser("PetrIv"));
        //System.out.println(getUser.getFirstName());


        //Config.execute(clientUser.createWithList(users));

        //Config.execute(clientPet.addPet(pet));

        //Client.getMethod("user/user1", User.class);

        Config.execute(clientPet.addPet(pet));


    }



}
