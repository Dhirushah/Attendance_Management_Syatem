package Model.modelclass;

public class User_table {
int id;
String Username;
String Password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User_table(int id, String username, String password) {
        this.id = id;
        Username = username;
        Password = password;
    }
}

