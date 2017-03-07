package net.MyProjectTEST.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by power on 05.03.2017.
 */

@Entity
@Table(name="candidate_ansvers")
public class CandidateAnsvers {


    @Id
    @Column(name="id")
    private int id;

    @Column(name="n_question")
    private int n_question;

    @Column(name="ansvers")
    private String ansvers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getN_question() {
        return n_question;
    }

    public void setN_question(int n_question) {
        this.n_question = n_question;
    }

    public String getAnsvers() {
        return ansvers;
    }

    public void setAnsvers(String ansvers) {
        this.ansvers = ansvers;
    }

    @Override
    public String toString() {
        return "CandidateAnsvers{" +
                "id=" + id +
                ", n_question=" + n_question +
                ", ansvers='" + ansvers + '\'' +
                '}';
    }
}
