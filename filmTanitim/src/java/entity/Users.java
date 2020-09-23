
package entity;


public class Users {
    private int user_id;
    private String pass;
    private String user_name;

    public Users(int user_id, String pass, String user_name) {
        this.user_id = user_id;
        this.pass = pass;
        this.user_name = user_name;
    }

    
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    
}
