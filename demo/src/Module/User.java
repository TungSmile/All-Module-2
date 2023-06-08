package Module;

import java.io.Serializable;


public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String pass;
    private String name;
    private String phone;
    private String email;
    private static int count;

    public User(String id, String pass, String name, String phone, String email) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.phone = phone;
        this.email = email;
        count++;
    }

    public User() {
        count++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        User.count = count;
    }

    @Override
    public String toString() {
        return "  " + name.toUpperCase() +
                "    Id : " + id +
                "    Pass : " + pass +
                "    Phone : " + phone +
                "    Email : " + email;
    }
}
