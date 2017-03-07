package net.MyProjectTEST.test.service;

import net.MyProjectTEST.test.model.Questions;

import java.util.List;

/**
 * Created by power on 05.03.2017.
 */


public interface QuestionsService {
public void addQuestions(Questions questions);
    public void updateQuestions (Questions questions);
    public void removeQuestions(int id);
    public Questions getQuestionsById(int id);
    public List<Questions> listQuestions();


}
