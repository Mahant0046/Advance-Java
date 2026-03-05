package in.ac.kletech.bean;

public class LoginBean {
    private String username;
    private String password;

    // Hardcoded credentials
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "1234";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate() {
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}
