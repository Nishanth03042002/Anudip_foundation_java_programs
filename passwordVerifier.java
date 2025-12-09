class Login {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long!");
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class passwordVerifier {
    public static void main(String[] args) {
        Login a = new Login();

        a.setUsername("Nishanth");
        a.setPassword("abc123");  
        a.setPassword("strongPass");

        System.out.println("Username: " + a.getUsername());
        System.out.println("Password: " + a.getPassword());
    }
}
