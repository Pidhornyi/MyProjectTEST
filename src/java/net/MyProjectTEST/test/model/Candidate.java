package net.MyProjectTEST.test.model;

import javax.persistence.*;

/**
 * Created by power on 05.03.2017.
 */

@Entity
@Table(name ="candidate")
public class Candidate {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="key")
    private String key;

    @Column(name="true_false")
    private boolean true_false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isTrue_false() {
        return true_false;
    }

    public void setTrue_false(boolean true_false) {
        this.true_false = true_false;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", key='" + key + '\'' +
                ", true_false=" + true_false +
                '}';
    }
}
