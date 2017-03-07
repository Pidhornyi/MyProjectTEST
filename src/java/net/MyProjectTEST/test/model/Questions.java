package net.MyProjectTEST.test.model;

import javax.persistence.*;

/**
 * Created by power on 05.03.2017.
 */



@Entity
@Table(name="questions")
public class Questions {

    @Id
    @Column(name="nquestions")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int n_questions;

    @Column(name="question")
    private String question;


    public int getN_questions() {
        return n_questions;
    }

    public void setN_questions(int n_questions) {
        this.n_questions = n_questions;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "n_questions=" + n_questions +
                ", question='" + question + '\'' +
                '}';
    }
}
