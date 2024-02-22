package lombokexp.dto;

public class UserWith {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public UserWith withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserWith withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "UserWith{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
