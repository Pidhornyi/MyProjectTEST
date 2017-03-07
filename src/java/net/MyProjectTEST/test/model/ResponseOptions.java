package net.MyProjectTEST.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by power on 05.03.2017.
 */




@Entity
@Table(name="response_options")
public class ResponseOptions {

    @Id
    @Column(name="n_question")
    private int n_question;

    @Column(name="response_options")
    private String response_options;

    @Column(name = "true_false")
    private Enum true_false;

    public int getN_question() {
        return n_question;
    }

    public void setN_question(int n_question) {
        this.n_question = n_question;
    }

    public String getResponse_options() {
        return response_options;
    }

    public void setResponse_options(String response_options) {
        this.response_options = response_options;
    }

    public Enum getTrue_false() {
        return true_false;
    }

    public void setTrue_false(Enum true_false) {
        this.true_false = true_false;
    }


    @Override
    public String toString() {
        return "ResponseOptions{" +
                "n_question=" + n_question +
                ", response_options='" + response_options + '\'' +
                ", true_false=" + true_false +
                '}';
    }
}
