package net.MyProjectTEST.test.service;

import net.MyProjectTEST.test.dao.QuestionsDao;
import net.MyProjectTEST.test.model.Questions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by power on 05.03.2017.
 */


@Service
public class QuestionsServiceImpl implements QuestionsService {

    private QuestionsDao questionsDao;
    public void setQuestionsDao(QuestionsDao questionsDao){
        this.questionsDao = questionsDao;
    }


    @Override
    @Transactional
    public void addQuestions(Questions questions) {
        this.questionsDao.addQuestion(questions);
    }

    @Override
    @Transactional
    public void updateQuestions(Questions questions) {
    this.questionsDao.updateQuestion(questions);
    }

    @Override
    @Transactional
    public void removeQuestions(int id) {
    this.questionsDao.removeQuestion(id);
    }

    @Override
    @Transactional
    public Questions getQuestionsById(int id) {
        return this.questionsDao.getQuestionById(id);
    }

    @Override
    @Transactional
    public List<Questions> listQuestions() {
        return this.questionsDao.listQuestions();
    }
}
