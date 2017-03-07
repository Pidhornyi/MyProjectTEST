package net.MyProjectTEST.test.dao;

import net.MyProjectTEST.test.model.Questions;
import java.util.List;

/**
 * Created by power on 05.03.2017.
 */
public interface QuestionsDao {
    public void addQuestion(Questions questions);
    public void updateQuestion(Questions questions);
    public void removeQuestion(int id);
    public Questions getQuestionById(int id );
    public List<Questions> listQuestions();



}
