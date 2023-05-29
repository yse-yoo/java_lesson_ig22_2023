package sns.entity;

public class User {

    // protected String email;
    // String email;
    // private String email;
    private String email;
    private String name;
    private String password;
    private boolean isActive;

    // Ctrl + . => Generate Getters and Setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    
}
