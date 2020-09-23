
package entity;

import javax.xml.registry.infomodel.User;




public class Films {
    private int film_id;
    private  String film_name;
    private  String film_desc;
    private  User user ;

    public Films() {
        
    }

    public Films(int film_id, String film_name, String film_desc, User user) {
        this.film_id = film_id;
        this.film_name = film_name;
        this.film_desc = film_desc;
        this.user = user;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getFilm_desc() {
        return film_desc;
    }

    public void setFilm_desc(String film_desc) {
        this.film_desc = film_desc;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
