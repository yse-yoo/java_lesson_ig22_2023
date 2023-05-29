package sns.entity;

public class App {
    public static void main(String[] args) {
        User user = new User();
        // user.email = "test@test.com";     
        // System.out.println(user.email);

        user.setEmail("test@test.com");
        System.out.println(user.getEmail());
    }
}
