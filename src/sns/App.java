package sns;

import sns.entity.User;

public class App {
    
    public static void main(String[] args) {
        User user = new User();
        // user.email = "test@test.com";
        user.setEmail("test@test.com");
        System.out.println(user.getEmail());
    }

}
