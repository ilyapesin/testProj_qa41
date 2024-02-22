package lombokexp;

import lombokexp.dto.User;
import lombokexp.dto.UserLombok;
import lombokexp.dto.UserWith;

public class MainLombok {
    public static void main(String[] args) {
        User user = new User("aas","123$");
        System.out.println("User: " + user.getUsername());
//        ----with ---- ---- ---- ---- ---- ---- ----
        UserWith userWith = new UserWith().withUsername(user.getUsername()).withPassword(user.getPassword());
        System.out.println(userWith);
        UserWith userWith1 = new UserWith().withUsername("qwewe");
        System.out.println(userWith1.getUsername());
//        ----lombok ---- ---- ---- ---- ---- ---- ----
        UserLombok userLombok = UserLombok.builder().username(user.getUsername())
                .password(user.getPassword())
                .build();
        System.out.println(userLombok);
    }
}
